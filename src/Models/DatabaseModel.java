package Models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import Controllers.AccountController;
import Controllers.AccountRoleController;
import Controllers.ContactController;
import Controllers.FamilyInfoController;
import Controllers.StudentController;

public class DatabaseModel {

	private final String url = "jdbc:postgresql://localhost:5432/school";
	private final String user = "root";
	private final String password = "root";

	Connection conn;

	public Connection openConnection() throws ClassNotFoundException {
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Database connected to the database successfully");
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return conn;
	}

	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	public void accountRecord(AccountController accountController, AccountRoleController accountRoleController,
			StudentController studentController, FamilyInfoController familyInfoController,
			ContactController contactController) {
		try {
			Connection conn = openConnection();

			String queryAccount = "INSERT INTO account(user_name, password, create_on, last_login, tc) VALUES(?, ?, ?, ?, ?)";
			PreparedStatement pstAccount = conn.prepareStatement(queryAccount, Statement.RETURN_GENERATED_KEYS);
			pstAccount.setString(1, accountController.getUserName());
			pstAccount.setString(2, accountController.getPassword());
			pstAccount.setDate(3, accountController.getCreatedOn());
			pstAccount.setDate(4, accountController.getLastLogin());
			pstAccount.setInt(5, accountController.getTc());
			pstAccount.executeUpdate();
			pstAccount.close();

			String queryAccountRole = "INSERT INTO account_role(account_id, role_id, grant_date) VALUES((SELECT MAX(account_id) FROM account), ?, ?)";
			PreparedStatement pstAccountRole = conn.prepareStatement(queryAccountRole);
			pstAccountRole.setInt(1, accountRoleController.getRoleID());
			pstAccountRole.setDate(2, accountRoleController.getGrantDate());
			pstAccountRole.executeUpdate();
			pstAccountRole.close();

			String queryStudent = "INSERT INTO student(account_id, first_name, last_name, tc, age, gender) VALUES((SELECT MAX(account_id) FROM account), ?, ?, ?, ?, ?)";
			PreparedStatement pstStudent = conn.prepareStatement(queryStudent, Statement.RETURN_GENERATED_KEYS);
			pstStudent.setString(1, studentController.getFirstName());
			pstStudent.setString(2, studentController.getLastName());
			pstStudent.setInt(3, studentController.getTC());
			pstStudent.setShort(4, studentController.getAge());
			pstStudent.setString(5, String.valueOf(studentController.getGender()));
			pstStudent.executeUpdate();
			pstStudent.close();

			String queryFamilyInfo = "INSERT INTO family_info(student_id, mother_name, mother_job, father_name, father_job) VALUES((SELECT MAX(student_id) FROM student), ?, ?, ?, ?)";
			PreparedStatement pstFamilyInfo = conn.prepareStatement(queryFamilyInfo, Statement.RETURN_GENERATED_KEYS);
			pstFamilyInfo.setString(1, familyInfoController.getMotherName());
			pstFamilyInfo.setString(2, familyInfoController.getMotherJob());
			pstFamilyInfo.setString(3, familyInfoController.getFatherName());
			pstFamilyInfo.setString(4, familyInfoController.getFatherJob());
			pstFamilyInfo.executeUpdate();
			pstFamilyInfo.close();

			String queryContact = "INSERT INTO contact(student_id, phone_number, mail, address) VALUES((SELECT MAX(student_id) FROM student), ?, ?, ?)";
			PreparedStatement pstContact = conn.prepareStatement(queryContact, Statement.RETURN_GENERATED_KEYS);
			pstContact.setString(1, contactController.getPhoneNumber());
			pstContact.setString(2, contactController.getMail());
			pstContact.setString(3, contactController.getAddress());
			pstContact.executeUpdate();
			pstContact.close();

			closeConnection();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public List<Object[]> accountShowAllRecord() {
		int columnCount;

		List<Object[]> accounts = new ArrayList<Object[]>();

		try {
			Connection conn = openConnection();
			String query = "SELECT * FROM account a, account_role ar, role r WHERE a.account_id = ar.account_id AND ar.role_id = r.role_id";

			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			columnCount = rs.getMetaData().getColumnCount();

			while (rs.next()) {
				Object[] header = { "accountID", "userName", "password", "createOn", "lastLogin", "accountID", "roleID",
						"grantDate", "roleID", "roleName", "tc" };

				header[0] = rs.getInt("account_id");
				header[1] = rs.getString("user_name");
				header[2] = rs.getString("password");
				header[3] = rs.getDate("create_on");
				header[4] = rs.getDate("last_login");
				header[5] = rs.getInt("account_id");
				header[6] = rs.getInt("role_id");
				header[7] = rs.getDate("grant_date");
				header[8] = rs.getInt("role_id");
				header[9] = rs.getString("role_name");
				header[10] = rs.getString("tc");
				accounts.add(header);
			}
			closeConnection();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return accounts;
	}

	public AccountController accountFind(int tc) {
		AccountController accountController = new AccountController();
		StudentController studentController = new StudentController();
		FamilyInfoController familyInfoController = new FamilyInfoController();
		ContactController contactController = new ContactController();
		try {
			Connection conn = openConnection();
			String query = "SELECT * FROM account a, account_role ar, role r, student s, family_info f, contact c "
					+ "WHERE a.account_id = s.account_id " + "AND a.account_id = ar.account_id "
					+ "AND ar.role_id = r.role_id " + "AND s.student_id = f.student_id "
					+ "AND s.student_id = c.student_id " + "AND a.tc = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, tc);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				accountController.setUserName(rs.getString("user_name"));
				accountController.setPassword(rs.getString("password"));
				accountController.setTc(rs.getInt("tc"));

				studentController.setFirstName(rs.getString("first_name"));
				studentController.setLastName(rs.getString("last_name"));
				studentController.setTC(rs.getInt("tc"));
				studentController.setAge(rs.getShort("age"));
				studentController.setGender(rs.getString("gender").charAt(0));
				accountController.setStudentController(studentController);

				familyInfoController.setMotherName(rs.getString("mother_name"));
				familyInfoController.setMotherJob(rs.getString("mother_job"));
				familyInfoController.setFatherName(rs.getString("father_name"));
				familyInfoController.setFatherJob(rs.getString("father_job"));
				accountController.setFamilyInfoController(familyInfoController);

				contactController.setPhoneNumber(rs.getString("phone_number"));
				contactController.setMail(rs.getString("mail"));
				contactController.setAddress(rs.getString("address"));
				accountController.setContactController(contactController);
			}

			pst.close();
			closeConnection();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return accountController;
	}
	
	public void accountDelete(int tc) {
		
		try {
			Connection conn = openConnection();
			String query = "DELETE FROM account a WHERE a.tc = ?";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, tc);
			pst.executeUpdate();
			pst.close();
			closeConnection();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

--
-- PostgreSQL database dump
--

-- Dumped from database version 10.6 (Ubuntu 10.6-0ubuntu0.18.04.1)
-- Dumped by pg_dump version 10.6 (Ubuntu 10.6-0ubuntu0.18.04.1)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: account; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.account (
    account_id integer NOT NULL,
    user_name text NOT NULL,
    password text NOT NULL,
    create_on timestamp without time zone NOT NULL,
    last_login timestamp without time zone,
    tc integer NOT NULL
);


ALTER TABLE public.account OWNER TO root;

--
-- Name: account_account_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.account_account_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.account_account_id_seq OWNER TO root;

--
-- Name: account_account_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.account_account_id_seq OWNED BY public.account.account_id;


--
-- Name: account_role; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.account_role (
    account_id integer NOT NULL,
    role_id integer NOT NULL,
    grant_date timestamp without time zone
);


ALTER TABLE public.account_role OWNER TO root;

--
-- Name: contact; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.contact (
    contact_id integer NOT NULL,
    student_id integer NOT NULL,
    phone_number text,
    mail text,
    address text
);


ALTER TABLE public.contact OWNER TO root;

--
-- Name: contact_contact_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.contact_contact_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.contact_contact_id_seq OWNER TO root;

--
-- Name: contact_contact_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.contact_contact_id_seq OWNED BY public.contact.contact_id;


--
-- Name: family_info; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.family_info (
    family_info_id integer NOT NULL,
    student_id integer NOT NULL,
    mother_name text,
    mother_job text,
    father_name text,
    father_job text
);


ALTER TABLE public.family_info OWNER TO root;

--
-- Name: family_info_family_info_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.family_info_family_info_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.family_info_family_info_id_seq OWNER TO root;

--
-- Name: family_info_family_info_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.family_info_family_info_id_seq OWNED BY public.family_info.family_info_id;


--
-- Name: role; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.role (
    role_id integer NOT NULL,
    role_name text NOT NULL
);


ALTER TABLE public.role OWNER TO root;

--
-- Name: role_role_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.role_role_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.role_role_id_seq OWNER TO root;

--
-- Name: role_role_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.role_role_id_seq OWNED BY public.role.role_id;


--
-- Name: student; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.student (
    student_id integer NOT NULL,
    account_id integer NOT NULL,
    first_name text NOT NULL,
    last_name text NOT NULL,
    tc integer NOT NULL,
    age smallint,
    gender "char"
);


ALTER TABLE public.student OWNER TO root;

--
-- Name: student_last_name_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.student_last_name_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.student_last_name_seq OWNER TO root;

--
-- Name: student_last_name_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.student_last_name_seq OWNED BY public.student.last_name;


--
-- Name: student_student_id_seq; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.student_student_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.student_student_id_seq OWNER TO root;

--
-- Name: student_student_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: root
--

ALTER SEQUENCE public.student_student_id_seq OWNED BY public.student.student_id;


--
-- Name: account account_id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.account ALTER COLUMN account_id SET DEFAULT nextval('public.account_account_id_seq'::regclass);


--
-- Name: contact contact_id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.contact ALTER COLUMN contact_id SET DEFAULT nextval('public.contact_contact_id_seq'::regclass);


--
-- Name: family_info family_info_id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.family_info ALTER COLUMN family_info_id SET DEFAULT nextval('public.family_info_family_info_id_seq'::regclass);


--
-- Name: role role_id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.role ALTER COLUMN role_id SET DEFAULT nextval('public.role_role_id_seq'::regclass);


--
-- Name: student student_id; Type: DEFAULT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.student ALTER COLUMN student_id SET DEFAULT nextval('public.student_student_id_seq'::regclass);


--
-- Name: account account_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.account
    ADD CONSTRAINT account_pkey PRIMARY KEY (account_id);


--
-- Name: account_role account_role_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.account_role
    ADD CONSTRAINT account_role_pkey PRIMARY KEY (account_id, role_id);


--
-- Name: account account_tc_key; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.account
    ADD CONSTRAINT account_tc_key UNIQUE (tc);


--
-- Name: account account_user_name_key; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.account
    ADD CONSTRAINT account_user_name_key UNIQUE (user_name);


--
-- Name: contact contact_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.contact
    ADD CONSTRAINT contact_pkey PRIMARY KEY (contact_id);


--
-- Name: family_info family_info_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.family_info
    ADD CONSTRAINT family_info_pkey PRIMARY KEY (family_info_id);


--
-- Name: family_info family_info_student_id_key; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.family_info
    ADD CONSTRAINT family_info_student_id_key UNIQUE (student_id);


--
-- Name: role role_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.role
    ADD CONSTRAINT role_pkey PRIMARY KEY (role_id);


--
-- Name: role role_role_name_key; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.role
    ADD CONSTRAINT role_role_name_key UNIQUE (role_name);


--
-- Name: student student_account_id_key; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_account_id_key UNIQUE (account_id);


--
-- Name: student student_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_pkey PRIMARY KEY (student_id);


--
-- Name: student student_tc_key; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_tc_key UNIQUE (tc);


--
-- Name: contact contact_student_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.contact
    ADD CONSTRAINT contact_student_id_fkey FOREIGN KEY (student_id) REFERENCES public.student(student_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: family_info family_info_student_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.family_info
    ADD CONSTRAINT family_info_student_id_fkey FOREIGN KEY (student_id) REFERENCES public.student(student_id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: student student_tc_fkey; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_tc_fkey FOREIGN KEY (tc) REFERENCES public.account(tc) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- PostgreSQL database dump complete
--


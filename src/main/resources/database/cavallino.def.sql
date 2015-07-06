--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: cavallino_base; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA cavallino_base;


--
-- Name: cavallino_configlang; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA cavallino_configlang;


--
-- Name: cavallino_configres; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA cavallino_configres;


SET search_path = cavallino_base, pg_catalog;

--
-- Name: idgen; Type: SEQUENCE; Schema: cavallino_base; Owner: -
--

CREATE SEQUENCE idgen
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: registrations; Type: TABLE; Schema: cavallino_base; Owner: -; Tablespace: 
--

CREATE TABLE registrations (
    id bigint DEFAULT nextval('idgen'::regclass) NOT NULL,
    email text NOT NULL,
    firstname text,
    familyname text,
    phonenumber text,
    password text
);


SET search_path = cavallino_configlang, pg_catalog;

--
-- Name: plv8_units; Type: TABLE; Schema: cavallino_configlang; Owner: -; Tablespace: 
--

CREATE TABLE plv8_units (
)
INHERITS (pdsystem_lang.plv8_units);


SET search_path = cavallino_configres, pg_catalog;

--
-- Name: sc_resources; Type: TABLE; Schema: cavallino_configres; Owner: -; Tablespace: 
--

CREATE TABLE sc_resources (
)
INHERITS (pdsystem_systembase.sc_resources_template);


SET search_path = cavallino_configlang, pg_catalog;

--
-- Name: unitinfo; Type: DEFAULT; Schema: cavallino_configlang; Owner: -
--

ALTER TABLE ONLY plv8_units ALTER COLUMN unitinfo SET DEFAULT '{}'::json;


SET search_path = cavallino_configres, pg_catalog;

--
-- Name: rscpath; Type: DEFAULT; Schema: cavallino_configres; Owner: -
--

ALTER TABLE ONLY sc_resources ALTER COLUMN rscpath SET DEFAULT '/'::text;


SET search_path = cavallino_base, pg_catalog;

--
-- Name: registrations_pkey; Type: CONSTRAINT; Schema: cavallino_base; Owner: -; Tablespace: 
--

ALTER TABLE ONLY registrations
    ADD CONSTRAINT registrations_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--


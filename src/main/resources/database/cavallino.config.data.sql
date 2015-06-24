--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

SET search_path = cavallino_configlang, pg_catalog;

--
-- Data for Name: plv8_units; Type: TABLE DATA; Schema: cavallino_configlang; Owner: -
--

COPY plv8_units (unitname, src, unitinfo) FROM stdin;
\.


SET search_path = cavallino_configres, pg_catalog;

--
-- Data for Name: sc_resources; Type: TABLE DATA; Schema: cavallino_configres; Owner: -
--

COPY sc_resources (rscpath, rscname, rsc) FROM stdin;
/	cavallino-client.js	\\x2f2f2320736f757263654d617070696e6755524c3d636176616c6c696e6f2d636c69656e742e6d61700a
/	cavallino-client.map	\\x7b0a2276657273696f6e223a332c0a2266696c65223a22636176616c6c696e6f2d636c69656e742e6a73222c0a226c696e65436f756e74223a312c0a226d617070696e6773223a223b222c0a22736f7572636573223a5b5d2c0a226e616d6573223a5b5d0a7d0a
\.


--
-- PostgreSQL database dump complete
--


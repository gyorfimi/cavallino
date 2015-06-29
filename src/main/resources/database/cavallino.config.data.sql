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
hu.commit.prodigium.modules.cavallino.db.mapping.cavallino_configlang.Plv8_units	stjs.ns("hu.commit.prodigium.modules.cavallino.db.mapping.cavallino_configlang");\nhu.commit.prodigium.modules.cavallino.db.mapping.cavallino_configlang.Plv8_units = function() {};\nstjs.extend(hu.commit.prodigium.modules.cavallino.db.mapping.cavallino_configlang.Plv8_units, null, [hu.commit.prodigium.db.mapping.TableRecord], function(constructor, prototype) {\n    prototype.unitname = null;\n    prototype.src = null;\n    prototype.unitinfo = null;\n    constructor.table = new hu.commit.prodigium.db.mapping.metadata.Table("cavallino_configlang.plv8_units", function(metamodel) {\n        metamodel.addField("unitname", "text").addField("src", "text").addField("unitinfo", "json");\n    });\n}, {unitinfo: {name: "Map", arguments: [null, "Object"]}, table: {name: "hu.commit.prodigium.db.mapping.metadata.Table", arguments: ["hu.commit.prodigium.modules.cavallino.db.mapping.cavallino_configlang.Plv8_units"]}}, {});\n;\n//@ sourceMappingURL=Plv8_units.map	{"dependencies":["org.stjs.javascript.Map","hu.commit.prodigium.db.mapping.TableRecord","hu.commit.prodigium.db.mapping.metadata.Table"],"type":"class","side":"server","module":"cavallino"}
hu.commit.prodigium.modules.cavallino.db.mapping.cavallino_configres.Sc_resources	stjs.ns("hu.commit.prodigium.modules.cavallino.db.mapping.cavallino_configres");\nhu.commit.prodigium.modules.cavallino.db.mapping.cavallino_configres.Sc_resources = function() {};\nstjs.extend(hu.commit.prodigium.modules.cavallino.db.mapping.cavallino_configres.Sc_resources, null, [hu.commit.prodigium.db.mapping.TableRecord], function(constructor, prototype) {\n    prototype.rscpath = null;\n    prototype.rscname = null;\n    prototype.rsc = null;\n    constructor.table = new hu.commit.prodigium.db.mapping.metadata.Table("cavallino_configres.sc_resources", function(metamodel) {\n        metamodel.addField("rscpath", "text").addField("rscname", "text").addField("rsc", "bytea");\n    });\n}, {table: {name: "hu.commit.prodigium.db.mapping.metadata.Table", arguments: ["hu.commit.prodigium.modules.cavallino.db.mapping.cavallino_configres.Sc_resources"]}}, {});\n;\n//@ sourceMappingURL=Sc_resources.map	{"dependencies":["hu.commit.prodigium.db.mapping.TableRecord","hu.commit.prodigium.db.mapping.metadata.Table"],"type":"class","side":"server","module":"cavallino"}
hu.commit.prodigium.modules.cavallino.db.mapping.datasources.DataSources	stjs.ns("hu.commit.prodigium.modules.cavallino.db.mapping.datasources");\nhu.commit.prodigium.modules.cavallino.db.mapping.datasources.DataSources = function() {};\nstjs.extend(hu.commit.prodigium.modules.cavallino.db.mapping.datasources.DataSources, null, [], null, {}, {});\n//@ sourceMappingURL=DataSources.map	{"dependencies":[],"type":"class","side":"server","module":"cavallino"}
\.


SET search_path = cavallino_configres, pg_catalog;

--
-- Data for Name: sc_resources; Type: TABLE DATA; Schema: cavallino_configres; Owner: -
--

COPY sc_resources (rscpath, rscname, rsc) FROM stdin;
/	cavallino-client.js	\\x73746a732e6e73282268752e636f6d6d69742e70726f64696769756d2e6d6f64756c65732e636176616c6c696e6f2e64622e6d617070696e672e64617461736f757263657322293b0a68752e636f6d6d69742e70726f64696769756d2e6d6f64756c65732e636176616c6c696e6f2e64622e6d617070696e672e64617461736f75726365732e44617461536f7572636573203d2066756e6374696f6e2829207b7d3b0a73746a732e657874656e642868752e636f6d6d69742e70726f64696769756d2e6d6f64756c65732e636176616c6c696e6f2e64622e6d617070696e672e64617461736f75726365732e44617461536f75726365732c206e756c6c2c205b5d2c206e756c6c2c207b7d2c207b7d293b0a2f2f2320736f757263654d617070696e6755524c3d636176616c6c696e6f2d636c69656e742e6d61700a
/	cavallino-client.map	\\x7b0a2276657273696f6e223a332c0a2266696c65223a22636176616c6c696e6f2d636c69656e742e6a73222c0a226c696e65436f756e74223a312c0a226d617070696e6773223a223b222c0a22736f7572636573223a5b5d2c0a226e616d6573223a5b5d0a7d0a
\.


--
-- PostgreSQL database dump complete
--


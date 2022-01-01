CREATE TABLE IF NOT EXISTS UNITS(
	ID IDENTITY NOT NULL PRIMARY KEY, 
	ICON_LINK VARCHAR(100) NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	QTY INT NOT NULL,
	UNIT_TYPE VARCHAR(1) NOT NULL,
	UNIT_ID INT NOT NULL,
	STATUS VARCHAR(1) NOT NULL);
	
CREATE TABLE IF NOT EXISTS COUNTRIES(
	ID IDENTITY NOT NULL PRIMARY KEY, 
	COUNTRY_ID INT NOT NULL,
	MAP_LINK VARCHAR(100) NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	STATUS VARCHAR(1) NOT NULL);

CREATE TABLE IF NOT EXISTS DEPLOYMENTS(
	ID IDENTITY NOT NULL PRIMARY KEY, 
	COUNTRY_ID INT NOT NULL,
	UNIT_ID INT NOT NULL,
	UNIT_QTY INT NOT NULL);
	
CREATE OR REPLACE VIEW V_MANAGE_COUNTRIES AS (
select c.id, c.country_id, c.map_link, c.name, c.status,
(select count(1) from deployments d where d.country_id = c.country_id) as deploy_count
from countries c);

CREATE OR REPLACE VIEW V_COUNTRY_DEPLOYMENTS AS (
select c.country_id,  c.name, c.map_link, count(c.country_id) as num_of_deployments, sum(unit_qty) as total_qty
from countries c
join deployments d
on d.country_id = c.country_id
group by d.country_id);
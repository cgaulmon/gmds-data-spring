CREATE TABLE IF NOT EXISTS UNITS(
	UNIT_ID IDENTITY NOT NULL PRIMARY KEY,
	ICON_LINK VARCHAR(100) NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	QTY INT NOT NULL,
	UNIT_TYPE VARCHAR(1) NOT NULL,
	STATUS VARCHAR(1) NOT NULL);
	
CREATE TABLE IF NOT EXISTS COUNTRIES(
	COUNTRY_ID IDENTITY NOT NULL PRIMARY KEY, 
	MAP_LINK VARCHAR(100) NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	STATUS VARCHAR(1) NOT NULL);

CREATE TABLE IF NOT EXISTS DEPLOYMENTS(
	ID IDENTITY NOT NULL PRIMARY KEY, 
	LOAD_DATE DATE DEFAULT NOW(),
	LOAD_DTM TIMESTAMP DEFAULT NOW(),
	USER_ID INT NOT NULL,
	COUNTRY_ID INT NOT NULL,
	UNIT_ID INT NOT NULL,
	UNIT_QTY INT NOT NULL);

CREATE TABLE IF NOT EXISTS USERS (
	ID IDENTITY NOT NULL PRIMARY KEY, 
	USER_NAME VARCHAR(50) NOT NULL,
	PASSWORD VARCHAR(200) NOT NULL
	);

CREATE INDEX IF NOT EXISTS COUNTRIES_STATUS_IDX ON COUNTRIES(STATUS);
CREATE INDEX IF NOT EXISTS UNITS_SU_IDX ON UNITS(STATUS, UNIT_TYPE);
	
CREATE OR REPLACE VIEW V_MANAGE_COUNTRIES AS (
select ROW_NUMBER() OVER (order by c.country_id) as id, c.country_id, c.map_link, c.name, c.status,
(select count(1) from deployments d where d.country_id = c.country_id) as deploy_count
from countries c);

CREATE OR REPLACE VIEW V_COUNTRY_DEPLOYMENTS AS (
select ROW_NUMBER() OVER (order by c.country_id) as id, c.country_id, c.status, c.name, c.map_link, count(c.country_id) as num_of_deployments, sum(unit_qty) as total_qty
from countries c
join deployments d
on d.country_id = c.country_id
group by d.country_id);


CREATE OR REPLACE VIEW V_COUNTRY_DEPLOYMENT_DETAILS AS (
select ROW_NUMBER() OVER (order by c.country_id) as id, c.country_id, c.status as country_status, c.name as country_name, c.map_link,
u.unit_id, u.icon_link, u.name as unit_name, u.qty as unit_qty, u.unit_type, u.status as unit_status,
d.unit_qty as deployed_qty, d.load_date as deployment_date
from countries c
join deployments d
on d.country_id = c.country_id
join units u
on u.unit_id = d.unit_id
);
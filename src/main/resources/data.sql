INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (1, 'airforce.gif', '20th Air Force', 10000, 'I', 'T', 1511);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (2, 'sub.gif', 'Pacific Submarine', 50,'A', 'E', 1344);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (3, 'marines.gif', '1st Marines', 20000, 'A', 'T', 2145);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (4, 'navy.gif', 'Navy SEALS', 3000, 'I', 'T', 2744);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (5, 'army.gif', '1st Army', 15000, 'A', 'T', 2929);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (6, 'f15.gif', '2nd Squadron', 150, 'I', 'E', 2935);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (7, 'bradley.gif', '4th Army Mech', 500, 'I', 'E', 3228);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (8, 'bradley.gif', '3rd Mechanized', 500, 'A', 'E', 3387);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (9, 'apache.gif', 'Marine Patrol', 150, 'A', 'E', 3468);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (10, 'abrams.gif', '1st Armored', 500, 'A', 'E', 4080);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (11, 'abrams.gif', '2nd Armored', 500, 'I', 'E', 4821);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (12, 'army.gif', '101st Airborne', 5000, 'I', 'T', 5168);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (13, 'navy.gif', 'Fifth Fleet', 40000, 'A', 'T', 5711);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (14, 'airforce.gif', 'NORAD', 2500, 'A', 'T', 5905);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (15, 'army.gif', '2nd Army', 20000, 'A', 'T', 6779);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (16, 'marines.gif', '4th Marine Expeditionary', 7500, 'I', 'T', 7011);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (17, 'army.gif', 'Delta Force', 1000, 'A', 'T', 7220);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (18, 'airforce.gif', '8th Air Force', 75000, 'A', 'T', 7875);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (19, 'apache.gif', '7th Cavalry', 250, 'A', 'E', 7937);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (20, 'army.gif', 'Green Berets', 1000, 'I', 'T', 7966);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (21, 'navy.gif', 'Pacific Fleet', 50000, 'I', 'T', 8047);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (22, 'hummer.gif', 'Rat Patrol', 25, 'A', 'E', 9224);
INSERT INTO units (id, icon_link, name, qty, status, unit_type, unit_id) VALUES (23, 'hummer.gif', '6th MP', 50, 'I', 'E', 9242);


INSERT INTO countries (id, country_id, map_link, name, status) VALUES (1, 1000, 'Italy.gif', 'Italy', 'A');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (2, 1578, 'Belgium.gif', 'Belgium', 'A');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (3, 2502, 'Iraq.gif', 'Iraq', 'A');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (4, 3782, 'Egypt.gif', 'Egypt', 'I');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (5, 4426, 'United_States.gif', 'United States', 'A');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (6, 4550, 'Mexico.gif', 'Mexico', 'I');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (7, 5473, 'Australia.gif', 'Australia', 'I');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (8, 5851, 'Bulgaria.gif', 'Bulgaria', 'I');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (9, 5899, 'Canada.gif', 'Canada', 'I');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (10, 7713, 'Poland.gif', 'Poland', 'I');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (11, 8090, 'Germany.gif', 'Germany', 'A');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (12, 8577, 'Saudi_Arabia.gif', 'Saudi Arabia', 'A');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (13, 8848, 'Japan.gif', 'Japan', 'I');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (14, 8859, 'Great_Britain.gif', 'Great Britain', 'A');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (15, 9428, 'Afghanistan.gif', 'Afghanistan', 'A');
INSERT INTO countries (id, country_id, map_link, name, status) VALUES (16, 9542, 'France.gif', 'France', 'A');


INSERT INTO deployments (id, country_id, unit_id, unit_qty) VALUES (1, 2502, 6779, 10000);
INSERT INTO deployments (id, country_id, unit_id, unit_qty) VALUES (2, 8090, 2744, 1000);
INSERT INTO deployments (id, country_id, unit_id, unit_qty) VALUES (3, 8090, 4080, 250);
INSERT INTO deployments (id, country_id, unit_id, unit_qty) VALUES (4, 8577, 6779, 7500);
INSERT INTO deployments (id, country_id, unit_id, unit_qty) VALUES (5, 9428, 7937, 250);
INSERT INTO deployments (id, country_id, unit_id, unit_qty) VALUES (6, 9542, 2929, 7500);

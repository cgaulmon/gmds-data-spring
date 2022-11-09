INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (1511, 'airforce.gif', '20th Air Force', 10000, 'I', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (1344, 'sub.gif', 'Pacific Submarine', 50,'A', 'E');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (2145, 'marines.gif', '1st Marines', 20000, 'A', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (2744, 'navy.gif', 'Navy SEALS', 3000, 'I', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (2929, 'army.gif', '1st Army', 15000, 'A', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (2935, 'f15.gif', '2nd Squadron', 150, 'I', 'E');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (3228, 'bradley.gif', '4th Army Mech', 500, 'I', 'E');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (3387, 'bradley.gif', '3rd Mechanized', 500, 'A', 'E');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (3468, 'apache.gif', 'Marine Patrol', 150, 'A', 'E');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (4080, 'abrams.gif', '1st Armored', 500, 'A', 'E');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (4821, 'abrams.gif', '2nd Armored', 500, 'I', 'E');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (5168, 'army.gif', '101st Airborne', 5000, 'I', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (5711, 'navy.gif', 'Fifth Fleet', 40000, 'A', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (5905, 'airforce.gif', 'NORAD', 2500, 'A', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (6779, 'army.gif', '2nd Army', 20000, 'A', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (7011, 'marines.gif', '4th Marine Expeditionary', 7500, 'I', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (7220, 'army.gif', 'Delta Force', 1000, 'A', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (7875, 'airforce.gif', '8th Air Force', 75000, 'A', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (7937, 'apache.gif', '7th Cavalry', 250, 'A', 'E');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (7966, 'army.gif', 'Green Berets', 1000, 'I', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (8047, 'navy.gif', 'Pacific Fleet', 50000, 'I', 'T');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (9224, 'hummer.gif', 'Rat Patrol', 25, 'A', 'E');
INSERT INTO units (unit_id, icon_link, name, qty, status, unit_type) VALUES (9242, 'hummer.gif', '6th MP', 50, 'I', 'E');


INSERT INTO countries (country_id, map_link, name, status) VALUES (1000, 'Italy.gif', 'Italy', 'A');
INSERT INTO countries (country_id, map_link, name, status) VALUES (1578, 'Belgium.gif', 'Belgium', 'A');
INSERT INTO countries (country_id, map_link, name, status) VALUES (2502, 'Iraq.gif', 'Iraq', 'A');
INSERT INTO countries (country_id, map_link, name, status) VALUES (3782, 'Egypt.gif', 'Egypt', 'I');
INSERT INTO countries (country_id, map_link, name, status) VALUES (4426, 'United_States.gif', 'United States', 'A');
INSERT INTO countries (country_id, map_link, name, status) VALUES (4550, 'Mexico.gif', 'Mexico', 'I');
INSERT INTO countries (country_id, map_link, name, status) VALUES (5473, 'Australia.gif', 'Australia', 'I');
INSERT INTO countries (country_id, map_link, name, status) VALUES (5851, 'Bulgaria.gif', 'Bulgaria', 'I');
INSERT INTO countries (country_id, map_link, name, status) VALUES (5899, 'Canada.gif', 'Canada', 'I');
INSERT INTO countries (country_id, map_link, name, status) VALUES (7713, 'Poland.gif', 'Poland', 'I');
INSERT INTO countries (country_id, map_link, name, status) VALUES (8090, 'Germany.gif', 'Germany', 'A');
INSERT INTO countries (country_id, map_link, name, status) VALUES (8577, 'Saudi_Arabia.gif', 'Saudi Arabia', 'A');
INSERT INTO countries (country_id, map_link, name, status) VALUES (8848, 'Japan.gif', 'Japan', 'I');
INSERT INTO countries (country_id, map_link, name, status) VALUES (8859, 'Great_Britain.gif', 'Great Britain', 'A');
INSERT INTO countries (country_id, map_link, name, status) VALUES (9428, 'Afghanistan.gif', 'Afghanistan', 'A');
INSERT INTO countries (country_id, map_link, name, status) VALUES (9542, 'France.gif', 'France', 'A');


INSERT INTO deployments (id, user_id, country_id, unit_id, unit_qty) VALUES (1, 1, 2502, 6779, 10000);
INSERT INTO deployments (id, user_id, country_id, unit_id, unit_qty) VALUES (2, 1, 8090, 2744, 1000);
INSERT INTO deployments (id, user_id, country_id, unit_id, unit_qty) VALUES (3, 1, 8090, 4080, 250);
INSERT INTO deployments (id, user_id, country_id, unit_id, unit_qty) VALUES (4, 2, 8577, 6779, 7500);
INSERT INTO deployments (id, user_id, country_id, unit_id, unit_qty) VALUES (5, 2, 9428, 7937, 250);
INSERT INTO deployments (id, user_id, country_id, unit_id, unit_qty) VALUES (6, 1, 9542, 2929, 7500);

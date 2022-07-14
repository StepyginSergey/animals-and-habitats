INSERT INTO region (id, name) VALUES (1, 'Северная америка');
INSERT INTO region (id, name) VALUES (2, 'Южная америка');
INSERT INTO region (id, name) VALUES (3, 'Евразия');
INSERT INTO region (id, name) VALUES (4, 'Австралия');
INSERT INTO region (id, name) VALUES (5, 'Северный полюс');
INSERT INTO region (id, name) VALUES (6, 'Южный полюс');

INSERT INTO skin_color (id, color_name) VALUES (1, 'Черный');
INSERT INTO skin_color (id, color_name) VALUES (2, 'Белый');
INSERT INTO skin_color (id, color_name) VALUES (3, 'Рыжий');
INSERT INTO skin_color (id, color_name) VALUES (4, 'Коричневый');

INSERT INTO animal_kind (id, kind_name) VALUES (1, 'Млекопитающие');
INSERT INTO animal_kind (id, kind_name) VALUES (2, 'Ракообразные');
INSERT INTO animal_kind (id, kind_name) VALUES (3, 'Паукообразные');
INSERT INTO animal_kind (id, kind_name) VALUES (4, 'Насекомые');
INSERT INTO animal_kind (id, kind_name) VALUES (5, 'Птицы');
INSERT INTO animal_kind (id, kind_name) VALUES (6, 'Пресмыкающиеся');
INSERT INTO animal_kind (id, kind_name) VALUES (7, 'Земноводные');
INSERT INTO animal_kind (id, kind_name) VALUES (8, 'Рыбы');

INSERT INTO animal (id, name, kind_id, skin_color_id) VALUES (1, 'Собака', 1, 1);
INSERT INTO animal (id, name, kind_id, skin_color_id) VALUES (2, 'Кошка', 1, 1);
INSERT INTO animal (id, name, kind_id, skin_color_id) VALUES (3, 'Животное3', 1, 1);
INSERT INTO animal (id, name, kind_id, skin_color_id) VALUES (4, 'Животное4', 1, 1);
INSERT INTO animal (id, name, kind_id, skin_color_id) VALUES (5, 'Животное5', 1, 1);


INSERT INTO animal_region (animal_id, region_id) VALUES (1, 1);
INSERT INTO animal_region (animal_id, region_id) VALUES (1, 2);
INSERT INTO animal_region (animal_id, region_id) VALUES (1, 3);
INSERT INTO animal_region (animal_id, region_id) VALUES (2, 1);
INSERT INTO animal_region (animal_id, region_id) VALUES (2, 2);
INSERT INTO animal_region (animal_id, region_id) VALUES (2, 3);
INSERT INTO animal_region (animal_id, region_id) VALUES (5, 4);

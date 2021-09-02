INSERT INTO Fases (nombre,prioridad) VALUES ('Convocatoria',1);
INSERT INTO Fases (nombre,prioridad) VALUES ('Juntas Electorales',2);
INSERT INTO Fases (nombre,prioridad) VALUES ('División de las circunscripciones en secciones y mesas',3);

INSERT INTO eventos(id_fase, fecha_inicio, fecha_fin,fecha_texto,titulo,ley)
SELECT id_fase,'2019-04-2','2019-04-2','2 de abril',
		'Publicación en el BOG del decreto foral de convocatoria de elecciones a JJGG y de la orden foral de convocatoria de elecciones a entidades locales menores',
		'LEY ORGÁNICA DEL RÉGIMEN ELECTORAL GENERAL : artículos 42.3 y 199; y artículo 7.1 de la Ley 1/1987'
		FROM Fases WHERE fases.nombre='Convocatoria';
		
INSERT INTO eventos(id_fase, fecha_inicio, fecha_fin,fecha_texto,titulo,ley)
SELECT id_fase,'2019-04-2','2019-04-2','2 de abril',
		'Publicación en el BOE de los reales decretos de convocatoria de elecciones locales y al Parlamento Europeo',
		'LEY ORGÁNICA DEL RÉGIMEN ELECTORAL GENERAL : artículos 42.3, 185 y 218'
		FROM Fases WHERE fases.nombre='Convocatoria';
		
INSERT INTO eventos(id_fase, fecha_inicio, fecha_fin,fecha_texto,titulo,ley)
SELECT id_fase,'2019-04-2','2019-05-26','Del 2 abril al 26 de mayo',
		'Prohibición a poderes públicos de actos que contengan alusiones a logros obtenidos y de inauguración de obras y servicios públicos',
		'LEY ORGÁNICA DEL RÉGIMEN ELECTORAL GENERAL : números 2 y 3 del artículo 50'
		FROM Fases WHERE fases.nombre='Convocatoria';
--- ------------------------------------------------------------------
INSERT INTO eventos(id_fase, fecha_inicio, fecha_fin,fecha_texto,titulo,ley)
SELECT id_fase,'2019-03-8','2019-03-12','Del 8 de marzo al 12 de marzo', 
		'Constitución inicial de la JEP y las JEZ con vocales judiciales; publicación en el BOG',
		'LEY ORGÁNICA DEL RÉGIMEN ELECTORAL GENERAL : números 1 y 3 del artículo 14 y artículo 15.3.'
		FROM Fases WHERE fases.nombre='Juntas Electorales';

INSERT INTO eventos(id_fase, fecha_inicio, fecha_fin,fecha_texto,titulo,ley)
SELECT id_fase,'2019-04-3','2019-03-12','Del 3 de abril al 9 de abril', 
		'Asignación por la JEP a las JEZ de las circunscripciones electorales para las elecciones a JJGG; publicación en el BOG',
		'Artículo 10 de la Ley 1/1987'
		FROM Fases WHERE fases.nombre='Juntas Electorales';

INSERT INTO eventos(id_fase, fecha_inicio, fecha_fin,fecha_texto,titulo,ley)
SELECT id_fase,'2019-04-1','2019-04-11','Del 1 de abril al 11 de abril', 
		'Propuesta conjunta de nombramiento de vocales no judiciales por representantes de las candidaturas',
		'LEY ORGÁNICA DEL RÉGIMEN ELECTORAL GENERAL : artículos 10.1b) y 11.1b)'
		FROM Fases WHERE fases.nombre='Juntas Electorales';
		
INSERT INTO eventos(id_fase, fecha_inicio, fecha_fin,fecha_texto,titulo,ley)
SELECT id_fase,'2019-04-1','2019-04-11','Del 1 de abril al 11 de abril ', 
		'Nombramiento por la JEC y la JEP de vocales no judiciales para la JEP y las JEZ, respectivamente',
		'LEY ORGÁNICA DEL RÉGIMEN ELECTORAL GENERAL : artículos 10.1b) y 11.1b)'
		FROM Fases WHERE fases.nombre='Juntas Electorales';
--- ------------------------------------------------------------------
INSERT INTO eventos(id_fase, fecha_inicio, fecha_fin,fecha_texto,titulo,ley)
SELECT id_fase,'2019-04-8','2019-04-8','8 de abril', 
		'Publicación por la DPOCE en el BOG y exposición al público en ayuntamientos de la relación provisional de secciones, locales y mesas ',
		'LEY ORGÁNICA DEL RÉGIMEN ELECTORAL GENERAL : artículo 24.2'
		FROM Fases WHERE fases.nombre='División de las circunscripciones en secciones y mesas';
		
INSERT INTO eventos(id_fase, fecha_inicio, fecha_fin,fecha_texto,titulo,ley)
SELECT id_fase,'2019-04-9','2019-04-14','Del 9 de abril al 14 de abril ', 
		'Reclamaciones ante la JEP contra delimitación de secciones, locales y mesas ',
		'LEY ORGÁNICA DEL RÉGIMEN ELECTORAL GENERAL : artículo 24.3'
		FROM Fases WHERE fases.nombre='División de las circunscripciones en secciones y mesas';

INSERT INTO eventos(id_fase, fecha_inicio, fecha_fin,fecha_texto,titulo,ley)
SELECT id_fase,'2019-04-15','2019-04-19','Hasta el 19 de abril (5 días)', 
		'Resolución por la JEP de reclamaciones contra delimitación efectuada',
		'LEY ORGÁNICA DEL RÉGIMEN ELECTORAL GENERAL : artículo 24.3'
		FROM Fases WHERE fases.nombre='División de las circunscripciones en secciones y mesas';
		
INSERT INTO eventos(id_fase, fecha_inicio, fecha_fin,fecha_texto,titulo,ley)
SELECT id_fase,'2019-05-16','2019-05-25','Del 16 de mayo al 25 de mayo', 
		'Difusión en Internet por la OCE y exposición al público en los ayuntamientos de la relación definitiva de secciones, locales y mesas',
		'LEY ORGÁNICA DEL RÉGIMEN ELECTORAL GENERAL : artículo 24.4 '
		FROM Fases WHERE fases.nombre='División de las circunscripciones en secciones y mesas';
		
	   
CREATE TABLE Producto (id bigint NOT NULL IDENTITY, nombre VARCHAR(150) NOT NULL, stock INT NOT NULL, detalle VARCHAR(150) NOT NULL, precio_unitario INT NOT NULL, PRIMARY KEY (id));


INSERT INTO Producto(nombre, stock, detalle, precio_unitario)
VALUES('Cubo Rubik', 5, 'Cubo Rubik 3x3 para niños', 1500);

INSERT INTO Producto(nombre, stock, detalle, precio_unitario)
VALUES('Celular Iphone 6', 2, 'Celular Iphone 6 reparado a nuevo', 18500);

INSERT INTO Producto(nombre, stock, detalle, precio_unitario)
VALUES('Mouse Inalambrico', 15, 'Mouse inalámbrico Logitech M170 negro', 1390);

INSERT INTO Producto(nombre, stock, detalle, precio_unitario)
VALUES('Portaminas', 50, 'Lapiz portamina marca "Pizzini" de minas 0.5 de espesor	', 580);





CREATE TABLE Cliente(id bigint NOT NULL IDENTITY ,nombre VARCHAR(150) NOT NULL, apellido VARCHAR(150) NOT NULL, dni INT NOT NULL, localidad VARCHAR(150) NOT NULL, direccion VARCHAR(150) NOT NULL,  PRIMARY KEY (id));


INSERT INTO Cliente(nombre, apellido, dni, localidad, direccion)
VALUES('Ramon', 'Abila', 3566895, 'Carlos Paz', 'Salguero 245');

INSERT INTO Cliente(nombre, apellido, dni, localidad, direccion)
VALUES('Miguel', 'Balangero', 40559255, 'San Francisco', 'W. PAunero 2453');

INSERT INTO Cliente(nombre, apellido, dni, localidad, direccion)
VALUES('Patricia', 'Sosa', 30265849, 'Gral. Deheza', 'Alverar 598');

INSERT INTO Cliente(nombre, apellido, dni, localidad, direccion)
VALUES('Pablo', 'Centeno', 41998658, 'Rio Cuarto', 'Bolivia 1105');

INSERT INTO Cliente(nombre, apellido, dni, localidad, direccion)
VALUES('Alexis', 'Quiroga', 40300234, 'Rio Tercero', 'Bv. Chacabuco 450');

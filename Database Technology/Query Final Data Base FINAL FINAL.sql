-- Query Final Data Base

-- Making Table
#Entity Method Payment
CREATE TABLE MethodPayment (
  PaymentMethodID CHAR(7) PRIMARY KEY CHECK (PaymentMethodID REGEXP '^(CA|DE|KR)[0-9][0-9][0-9]AH$'),
  PaymentMethod VARCHAR(10) NOT NULL
);

-- Entity MethodPayment
INSERT INTO MethodPayment (PaymentMethodID, PaymentMethod) VALUES
('CA123AH', 'Cash'),
('DE123AH', 'Debit'),
('KR123AH', 'Kredit');


#Entitiy Payment
CREATE TABLE Payment (
  PaymentID CHAR(10) PRIMARY KEY CHECK (PaymentID REGEXP '^PA[0-9][0-9][0-9]AH[0-9][0-9][0-9]$'),
  PaymentMethodID CHAR(7) CHECK (PaymentMethodID REGEXP '^(CA|DE|KR)[0-9][0-9][0-9]AH$'),
  TotalAmount INT NOT NULL,
  PaymentDate DATE,
  FOREIGN KEY (PaymentMethodID) REFERENCES MethodPayment(PaymentMethodID) ON UPDATE CASCADE ON DELETE CASCADE
);

-- Entity Payment
INSERT INTO Payment (PaymentID, PaymentMethodID, TotalAmount, PaymentDate) VALUES
('PA001AH001', 'CA123AH', 6000000, '2023-09-01'),
('PA001AH002', 'DE123AH', 2000000, '2023-11-01'),
('PA001AH003', 'CA123AH', 8000000, '2023-10-28'),
('PA001AH004', 'CA123AH', 12000000, '2023-10-12'),
('PA001AH005', 'KR123AH', 36000000, '2023-10-23'),
('PA001AH006', 'KR123AH', 8000000, '2023-09-04'),
('PA001AH007', 'DE123AH', 12000000, '2023-10-21'),
('PA001AH008', 'CA123AH', 24000000, '2023-09-16'),
('PA001AH009', 'DE123AH', 24000000, '2023-09-29'),
('PA001AH010', 'KR123AH', 32000000, '2023-11-04');


#Entity RoomType
CREATE TABLE RoomType (
  TypeID CHAR(7) PRIMARY KEY CHECK (TypeID REGEXP '^AH-(FA|TB|SP|PR)69$'),
  RoomName VARCHAR (25) NOT NULL,
  PricePerNight INT NOT NULL,
  Capacity INT NOT NULL
);

-- Entity RoomType
INSERT INTO RoomType (TypeID, RoomName, PricePerNight, Capacity) VALUES
('AH-FA69', 'Family', 4000000, 4),
('AH-TB69', 'Twin Bed', 2000000, 2),
('AH-SP69', 'Solo Player', 1000000, 1),
('AH-PR69', 'Party Room', 8000000, 8);


#Entity Room
CREATE TABLE Room (
  RoomNumber CHAR(5) PRIMARY KEY CHECK (RoomNumber REGEXP '^A[0-9][0-9][0-9][0-9]'), 
  TypeID CHAR(7) CHECK (TypeID REGEXP '^AH-(FA|TB|SP|PR)69$'),
  StatusID VARCHAR(150) NOT NULL,
  FOREIGN KEY (TypeID) REFERENCES RoomType(TypeID) ON UPDATE CASCADE ON DELETE CASCADE
);

-- Entity Room
INSERT INTO Room (RoomNumber, TypeID, StatusID) VALUES
('A0101', 'AH-SP69', 'Available'),
('A0102', 'AH-SP69', 'Available'),
('A0103', 'AH-SP69', 'Available'),
('A0104', 'AH-TB69', 'Occupied'),
('A0105', 'AH-TB69', 'Occupied'),
('A0106', 'AH-TB69', 'Available'),
('A0107', 'AH-FA69', 'Available'),
('A0108', 'AH-FA69', 'Available'),
('A0109', 'AH-PR69', 'Available'),
('A0110', 'AH-PR69', 'Occupied'),
('A0201', 'AH-SP69', 'Available'),
('A0202', 'AH-SP69', 'Available'),
('A0203', 'AH-SP69', 'Available'),
('A0204', 'AH-TB69', 'Available'),
('A0205', 'AH-TB69', 'Occupied'),
('A0206', 'AH-TB69', 'Occupied'),
('A0207', 'AH-FA69', 'Occupied'),
('A0208', 'AH-FA69', 'Available'),
('A0209', 'AH-PR69', 'Occupied'),
('A0210', 'AH-PR69', 'Available');


# Entity Guest
CREATE TABLE Guest (
  GuestID CHAR(5) PRIMARY KEY CHECK (GuestID REGEXP '^CU[0-9][0-9][0-9]$'),
  FirstName VARCHAR (25) NOT NULL,
  LastName VARCHAR (25), 
  DateOfBirthday DATE NOT NULL,
  Address VARCHAR(250) NOT NULL,
  Phone VARCHAR(50) NOT NULL,
  Email VARCHAR(250) NOT NULL CHECK (Email REGEXP '^[A-Za-z0-9._%+-]+@gmail\\.com$')
);

-- Entity Guest
INSERT INTO Guest (GuestID, FirstName, LastName, DateOfBirthday, Address, Phone, Email) VALUES
('CU001', 'Aliong', 'Gallagher', '1991-10-03', 'Jl. Melati No. 123, Kebayoran Baru, Jakarta Selatan', '81234567890', 'aliong.gallagher@gmail.com'),
('CU002', 'Mei Mei', 'Rodriguez', '1994-12-15', 'Perumahan Bunga Indah Blok C2 No. 45, Bandung', '85678901234', 'mei.rodriguez@gmail.com'),
('CU003', 'Oliver', 'Giroud', '1990-03-28', 'Jl. Kenari No. 67, Surabaya', '81112223344', 'oliver.giroud@gmail.com'),
('CU004', 'Ling Ling', 'Chang', '1993-07-09', 'Komplek Permata Hijau Blok D10, Medan', '82334455667', 'lingling.chang@gmail.com'),
('CU005', 'Sebastian', 'Vettel', '1997-09-06', 'Gang Nuri No. 22, Denpasar, Bali', '87654321098', 'sebastian.vettel@gmail.com'),
('CU006', 'Hansen', 'Tsukamoto', '1992-05-12', 'Jl. Cempaka Putih No. 88, Yogyakarta', '89876543210', 'hansen.tsukamoto@gmail.com'),
('CU007', 'Achai', 'Lawson', '1996-02-19', 'Perumahan Citra Harmoni Blok E5/12, Semarang', '83112233445', 'achai.lawson@gmail.com'),
('CU008', 'Athat', 'Harrison', '1998-11-24', 'Jl. Raya Serpong No. 55, Tangerang', '81998877665', 'athat.harrison@gmail.com'),
('CU009', 'Afung', 'Park', '1999-08-30', 'Komplek Puri Anjasmoro Blok F3/19, Solo', '82998877665', 'afung.park@gmail.com'),
('CU010', 'Dedi', 'Mason', '1995-04-07', 'Jl. Dahlia No. 33, Manado, Sulawesi Utara', '87112233445', 'dedi.mason@gmail.com');


# Entity Booking
CREATE TABLE Booking (
  BookingID CHAR (10) PRIMARY KEY CHECK (BookingID REGEXP '^BO[0-9][0-9][0-9]CU[0-9][0-9][0-9]$'),
  GuestID CHAR(5) CHECK (GuestID REGEXP '^CU[0-9][0-9][0-9]$'),
  PaymentID CHAR(10) CHECK (PaymentID REGEXP '^PA[0-9][0-9][0-9]AH[0-9][0-9][0-9]$'),
  RoomNumber CHAR(5) CHECK (RoomNumber REGEXP '^A[0-9][0-9][0-9][0-9]'),
  CheckInDate DATE NOT NULL,
  CheckOutDate DATE NOT NULL,
  DaySpend INT NOT NULL,
  TotalPrice INT NOT NULL,
  FOREIGN KEY (GuestID) REFERENCES Guest(GuestID) ON UPDATE CASCADE ON DELETE CASCADE,
  FOREIGN KEY (PaymentID) REFERENCES Payment(PaymentID) ON UPDATE CASCADE ON DELETE CASCADE,
  FOREIGN KEY (RoomNumber) REFERENCES Room(RoomNumber) ON UPDATE CASCADE ON DELETE CASCADE
);

-- Entity Booking
INSERT INTO Booking (BookingID, GuestID, PaymentID, RoomNumber, CheckInDate, CheckOutDate, DaySpend, TotalPrice) VALUES
('BO001CU001', 'CU001', 'PA001AH001', 'A0101', '2023-11-01', '2023-11-03', 2, 2000000),
('BO002CU001', 'CU001', 'PA001AH001', 'A0102', '2023-11-01', '2023-11-03', 2, 2000000),
('BO003CU001', 'CU001', 'PA001AH001', 'A0103', '2023-11-01', '2023-11-03', 2, 2000000),
('BO001CU002', 'CU002', 'PA001AH002', 'A0201', '2023-11-01', '2023-11-03', 2, 2000000),
('BO001CU003', 'CU003', 'PA001AH003', 'A0104', '2023-11-01', '2023-11-03', 2, 4000000),
('BO002CU003', 'CU003', 'PA001AH003', 'A0106', '2023-11-01', '2023-11-03', 2, 4000000),
('BO001CU004', 'CU004', 'PA001AH004', 'A0107', '2023-11-02', '2023-11-05', 3, 12000000),
('BO001CU005', 'CU005', 'PA001AH005', 'A0108', '2023-11-02', '2023-11-05', 3, 12000000),
('BO002CU005', 'CU005', 'PA001AH005', 'A0109', '2023-11-02', '2023-11-05', 3, 24000000),
('BO001CU006', 'CU006', 'PA001AH006', 'A0101', '2023-11-03', '2023-11-05', 2, 2000000),
('BO002CU006', 'CU006', 'PA001AH006', 'A0102', '2023-11-03', '2023-11-05', 2, 2000000),
('BO003CU006', 'CU006', 'PA001AH006', 'A0201', '2023-11-03', '2023-11-05', 2, 2000000),
('BO004CU006', 'CU006', 'PA001AH006', 'A0202', '2023-11-03', '2023-11-05', 2, 2000000),
('BO001CU007', 'CU007', 'PA001AH007', 'A0104', '2023-11-03', '2023-11-06', 3, 6000000),
('BO002CU007', 'CU007', 'PA001AH007', 'A0105', '2023-11-03', '2023-11-06', 3, 6000000),
('BO001CU008', 'CU008', 'PA001AH008', 'A0209', '2023-11-04', '2023-11-07', 3, 24000000),
('BO001CU009', 'CU009', 'PA001AH009', 'A0110', '2023-11-04', '2023-11-07', 3, 24000000),
('BO001CU010', 'CU010', 'PA001AH010', 'A0205', '2023-11-04', '2023-11-08', 4, 8000000),
('BO002CU010', 'CU010', 'PA001AH010', 'A0206', '2023-11-04', '2023-11-08', 4, 8000000),
('BO003CU010', 'CU010', 'PA001AH010', 'A0207', '2023-11-04', '2023-11-08', 4, 16000000);


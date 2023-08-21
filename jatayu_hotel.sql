-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 01, 2022 at 09:46 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jatayu_hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `cek_in`
--

CREATE TABLE `cek_in` (
  `No` int(10) NOT NULL,
  `Tgl_cekin` date NOT NULL,
  `Tgl_cekout` date NOT NULL,
  `No_kamar` varchar(10) NOT NULL,
  `Nama_Tamu` varchar(16) NOT NULL,
  `Total_bayar` varchar(15) NOT NULL,
  `Status_kamar` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cek_in`
--

INSERT INTO `cek_in` (`No`, `Tgl_cekin`, `Tgl_cekout`, `No_kamar`, `Nama_Tamu`, `Total_bayar`, `Status_kamar`) VALUES
(1, '2022-01-01', '2022-01-02', 'A1', 'ika', '150,000', 'Kosong'),
(2, '2022-01-01', '2022-01-02', 'B1', 'Ridwan', '100,000', 'PENUH'),
(3, '2022-01-07', '2022-01-08', 'C1', 'Ricky', '50,000', 'PENUH'),
(4, '2022-01-13', '2022-01-15', 'C1', 'Ridwan', '100,000', 'PENUH');

-- --------------------------------------------------------

--
-- Table structure for table `cek_out`
--

CREATE TABLE `cek_out` (
  `Tgl_cekout` date NOT NULL,
  `Nama_Tamu` varchar(30) NOT NULL,
  `Status_bayar` varchar(11) NOT NULL,
  `No_kamar` varchar(10) NOT NULL,
  `Status_kamar` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cek_out`
--

INSERT INTO `cek_out` (`Tgl_cekout`, `Nama_Tamu`, `Status_bayar`, `No_kamar`, `Status_kamar`) VALUES
('2022-01-02', 'ika', 'Lunas', 'A1', 'Kosong');

-- --------------------------------------------------------

--
-- Table structure for table `data_pengujung`
--

CREATE TABLE `data_pengujung` (
  `No_Ktp` varchar(20) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `User` varchar(30) DEFAULT NULL,
  `Password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_pengujung`
--

INSERT INTO `data_pengujung` (`No_Ktp`, `Nama`, `Alamat`, `jenis_kelamin`, `User`, `Password`) VALUES
('3023012503770051', 'Ridwan', 'Kepung', 'Laki-laki', NULL, ''),
('3371025812880001', 'ika', 'Sido Warek', 'Perempuan', NULL, ''),
('806302441287613', 'Ricky', 'Nganjuk', 'Laki-Laki', 'Ricky', 'republik indo');

-- --------------------------------------------------------

--
-- Table structure for table `information_kamar`
--

CREATE TABLE `information_kamar` (
  `Blok_kamar` varchar(10) NOT NULL,
  `No_kamar` varchar(10) NOT NULL,
  `Harga` varchar(15) NOT NULL,
  `Tipe` varchar(10) NOT NULL,
  `Status_kamar` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `persedian_kamar`
--

CREATE TABLE `persedian_kamar` (
  `Blok_kamar` varchar(10) NOT NULL,
  `No_kamar` varchar(10) NOT NULL,
  `Status_kamar` varchar(10) NOT NULL,
  `Harga` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `persedian_kamar`
--

INSERT INTO `persedian_kamar` (`Blok_kamar`, `No_kamar`, `Status_kamar`, `Harga`) VALUES
('A', 'A1', 'Kosong', '150,000'),
('B', 'B1', 'PENUH', '100,000'),
('C', 'C1', 'PENUH', '50,000');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cek_in`
--
ALTER TABLE `cek_in`
  ADD PRIMARY KEY (`No`),
  ADD KEY `No` (`No_kamar`),
  ADD KEY `No_Ktp` (`Nama_Tamu`);

--
-- Indexes for table `cek_out`
--
ALTER TABLE `cek_out`
  ADD KEY `No_Ktp` (`Nama_Tamu`),
  ADD KEY `No_kamar` (`No_kamar`);

--
-- Indexes for table `data_pengujung`
--
ALTER TABLE `data_pengujung`
  ADD PRIMARY KEY (`No_Ktp`);

--
-- Indexes for table `information_kamar`
--
ALTER TABLE `information_kamar`
  ADD KEY `No` (`No_kamar`);

--
-- Indexes for table `persedian_kamar`
--
ALTER TABLE `persedian_kamar`
  ADD PRIMARY KEY (`No_kamar`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cek_in`
--
ALTER TABLE `cek_in`
  MODIFY `No` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

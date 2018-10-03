-- phpMyAdmin SQL Dump
-- version 4.0.4.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 23, 2018 at 06:06 AM
-- Server version: 5.6.11
-- PHP Version: 5.5.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `nsbmdb`
--
CREATE DATABASE IF NOT EXISTS `nsbmdb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `nsbmdb`;

-- --------------------------------------------------------

--
-- Table structure for table `postgratz_details`
--

CREATE TABLE IF NOT EXISTS `postgratz_details` (
  `Std_Id` int(11) NOT NULL,
  `Full_Name` varchar(50) NOT NULL,
  `DOB` varchar(20) NOT NULL,
  `Gender` varchar(7) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Contact_No` varchar(10) NOT NULL,
  `Qualifications` varchar(200) NOT NULL,
  `Reg_Month` varchar(10) NOT NULL,
  PRIMARY KEY (`Std_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `postgratz_details`
--

INSERT INTO `postgratz_details` (`Std_Id`, `Full_Name`, `DOB`, `Gender`, `Address`, `Email`, `Contact_No`, `Qualifications`, `Reg_Month`) VALUES
(1, 'Sachini Chathurangi', '1996.08.02', 'Female', 'No.15,Marakolliya,Tangalle', 'chathurangi@gmail.com', '0774568765', 'BSC\n', 'February'),
(2, 'Sanduni Dilhara', '1995.12.02', 'Female', 'No.01,Mahawela,Dickwella', 'sanduni@gmail.com', '0778790987', 'BSc', 'July'),
(5, 'Sachini Chathurangi', '1996.08.02', 'Female', 'No.16,Marakolliya,Tangalle', 'chathurangi@gmail.com', '0776754565', 'BSc', 'February');

-- --------------------------------------------------------

--
-- Table structure for table `scfirst_semresults`
--

CREATE TABLE IF NOT EXISTS `scfirst_semresults` (
  `Std_Id` varchar(7) NOT NULL,
  `FCSubject1` varchar(10) NOT NULL,
  `FCResult1` varchar(2) NOT NULL,
  `FCSubject2` varchar(10) NOT NULL,
  `FCResult2` varchar(2) NOT NULL,
  `FCSubject3` varchar(10) NOT NULL,
  `FCResult3` varchar(2) NOT NULL,
  `CSubject1` varchar(10) NOT NULL,
  `CResult1` varchar(2) NOT NULL,
  `CSubject2` varchar(10) NOT NULL,
  `CResult2` varchar(2) NOT NULL,
  `CSubject3` varchar(10) NOT NULL,
  `CResult3` varchar(2) NOT NULL,
  `FOSubject1` varchar(10) NOT NULL,
  `FOResult1` varchar(2) NOT NULL,
  `FOSubject2` varchar(10) NOT NULL,
  `FOResult2` varchar(2) NOT NULL,
  `FOSubject3` varchar(10) NOT NULL,
  `FOResult3` varchar(2) NOT NULL,
  `FOSubject4` varchar(10) NOT NULL,
  `FOResult4` varchar(2) NOT NULL,
  `OSubject1` varchar(10) NOT NULL,
  `OResult1` varchar(2) NOT NULL,
  `OSubject2` varchar(10) NOT NULL,
  `OResult2` varchar(2) NOT NULL,
  `OSubject3` varchar(10) NOT NULL,
  `OResult3` varchar(2) NOT NULL,
  `OSubject4` varchar(10) NOT NULL,
  `OResult4` varchar(2) NOT NULL,
  PRIMARY KEY (`Std_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `scfirst_semresults`
--

INSERT INTO `scfirst_semresults` (`Std_Id`, `FCSubject1`, `FCResult1`, `FCSubject2`, `FCResult2`, `FCSubject3`, `FCResult3`, `CSubject1`, `CResult1`, `CSubject2`, `CResult2`, `CSubject3`, `CResult3`, `FOSubject1`, `FOResult1`, `FOSubject2`, `FOResult2`, `FOSubject3`, `FOResult3`, `FOSubject4`, `FOResult4`, `OSubject1`, `OResult1`, `OSubject2`, `OResult2`, `OSubject3`, `OResult3`, `OSubject4`, `OResult4`) VALUES
('2', 'SCS 1201', 'A+', 'SCS 1202', 'A+', 'SCS 1203', 'A+', 'SCS 1101', 'A+', 'SCS 1102', 'A+', 'SCS 1103', 'A+', 'SCS 1104', 'A+', 'SCS 1105', 'A+', 'SCS 1106', 'A+', 'SCS 1107', 'A+', 'SCS 1204', 'A+', 'SCS 1205', 'A+', 'SCS 1206', 'A+', 'SCS 1207', 'A+'),
('4', 'SCS 1201', 'A+', 'SCS 1202', 'A-', 'SCS 1203', 'C+', 'SCS 1101', 'A', 'SCS 1102', 'D+', 'SCS 1103', 'C+', 'SCS 1104', 'A+', 'SCS 1105', 'B+', 'SCS 1107', 'A+', 'SCS 1108', 'C+', 'SCS 1205', 'A+', 'SCS 1206', 'A-', 'SCS 1207', 'B-', 'SCS 1208', 'B');

-- --------------------------------------------------------

--
-- Table structure for table `scinstructers`
--

CREATE TABLE IF NOT EXISTS `scinstructers` (
  `Instructer_Id` int(7) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  `Sub_Code` varchar(8) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Tel_No` varchar(10) NOT NULL,
  PRIMARY KEY (`Instructer_Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `scinstructers`
--

INSERT INTO `scinstructers` (`Instructer_Id`, `Name`, `Sub_Code`, `Email`, `Tel_No`) VALUES
(1, 'Nimali Wasana', 'scs1102', 'nimali@gmail.com', '0716786543'),
(2, 'Chathurangi Amaraweera', 'scs1103', 'chathurangi@gmail.com', '0789876543'),
(3, 'Sulochana Lakamali', 'scs1104', 'sulochana@gmail.com', '0719800987');

-- --------------------------------------------------------

--
-- Table structure for table `sclectures`
--

CREATE TABLE IF NOT EXISTS `sclectures` (
  `Lec_Id` int(3) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) NOT NULL,
  `Sub_Code` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Tel_No` varchar(10) NOT NULL,
  PRIMARY KEY (`Lec_Id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `sclectures`
--

INSERT INTO `sclectures` (`Lec_Id`, `Name`, `Sub_Code`, `Email`, `Tel_No`) VALUES
(5, 'Noel Fernando', 'scs1101', 'noelfernando@gmail.com', '0715670000'),
(6, 'Jeewani Goonathilake', 'scs1103', 'jeewanigoonathilake@gmail.com', '0716780987'),
(7, 'Kapila Dias', 'scs1104', 'kapila@gmail.com', '0784567657'),
(8, 'Chathura Sooriyaarachchi', 'scs1201', 'chathura@gmail.com', '0785677654');

-- --------------------------------------------------------

--
-- Table structure for table `scsecond_semresults`
--

CREATE TABLE IF NOT EXISTS `scsecond_semresults` (
  `Std_Id` varchar(7) NOT NULL,
  `CSubject1` varchar(10) NOT NULL,
  `CResult1` varchar(2) NOT NULL,
  `CSubject2` varchar(10) NOT NULL,
  `CResult2` varchar(2) NOT NULL,
  `CSubject3` varchar(10) NOT NULL,
  `CResult3` varchar(2) NOT NULL,
  `OSubject1` varchar(10) NOT NULL,
  `OResult1` varchar(2) NOT NULL,
  `OSubject2` varchar(10) NOT NULL,
  `OResult2` varchar(2) NOT NULL,
  `OSubject3` varchar(10) NOT NULL,
  `OResult3` varchar(2) NOT NULL,
  `OSubject4` varchar(10) NOT NULL,
  `OResult4` varchar(2) NOT NULL,
  PRIMARY KEY (`Std_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `scsecond_semresults`
--

INSERT INTO `scsecond_semresults` (`Std_Id`, `CSubject1`, `CResult1`, `CSubject2`, `CResult2`, `CSubject3`, `CResult3`, `OSubject1`, `OResult1`, `OSubject2`, `OResult2`, `OSubject3`, `OResult3`, `OSubject4`, `OResult4`) VALUES
('1', 'SCS 1201', 'A+', 'SCS 1202', 'A+', 'SCS 1203', 'A+', 'SCS 1204', 'A+', 'SCS 1205', 'A+', 'SCS 1206', 'A+', 'SCS 1207', 'A+'),
('5', 'SCS 1201', 'B+', 'SCS 1202', 'A+', 'SCS 1203', 'B-', 'SCS 1205', 'A+', 'SCS 1206', 'A-', 'SCS 1207', 'C+', 'SCS 1208', 'B');

-- --------------------------------------------------------

--
-- Table structure for table `scufirst_sem`
--

CREATE TABLE IF NOT EXISTS `scufirst_sem` (
  `Std_Id` varchar(10) NOT NULL,
  `fSubject1` varchar(8) NOT NULL,
  `fSubject2` varchar(8) NOT NULL,
  `fSubject3` varchar(8) NOT NULL,
  `fSubject4` varchar(8) NOT NULL,
  `sSubject1` varchar(8) NOT NULL,
  `sSubject2` varchar(8) NOT NULL,
  `sSubject3` varchar(8) NOT NULL,
  `sSubject4` varchar(8) NOT NULL,
  PRIMARY KEY (`Std_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `scufirst_sem`
--

INSERT INTO `scufirst_sem` (`Std_Id`, `fSubject1`, `fSubject2`, `fSubject3`, `fSubject4`, `sSubject1`, `sSubject2`, `sSubject3`, `sSubject4`) VALUES
('2', 'SCS 1104', 'SCS 1105', 'SCS 1106', 'SCS 1107', 'SCS 1204', 'SCS 1205', 'SCS 1206', 'SCS 1207'),
('4', 'SCS 1104', 'SCS 1105', 'SCS 1107', 'SCS 1108', 'SCS 1205', 'SCS 1206', 'SCS 1207', 'SCS 1208');

-- --------------------------------------------------------

--
-- Table structure for table `scusecond_sem`
--

CREATE TABLE IF NOT EXISTS `scusecond_sem` (
  `Std_Id` varchar(10) NOT NULL,
  `Subject1` varchar(8) NOT NULL,
  `Subject2` varchar(8) NOT NULL,
  `Subject3` varchar(8) NOT NULL,
  `Subject4` varchar(8) NOT NULL,
  PRIMARY KEY (`Std_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `scusecond_sem`
--

INSERT INTO `scusecond_sem` (`Std_Id`, `Subject1`, `Subject2`, `Subject3`, `Subject4`) VALUES
('1', 'SCS 1204', 'SCS 1205', 'SCS 1206', 'SCS 1207'),
('3', 'SCS 1204', 'SCS 1205', 'SCS 1206', 'SCS 1207'),
('5', 'SCS 1205', 'SCS 1206', 'SCS 1207', 'SCS 1208');

-- --------------------------------------------------------

--
-- Table structure for table `undergratz_details`
--

CREATE TABLE IF NOT EXISTS `undergratz_details` (
  `Std_Id` varchar(10) NOT NULL,
  `Full_Name` varchar(100) NOT NULL,
  `DOB` varchar(20) NOT NULL,
  `Gender` varchar(7) NOT NULL,
  `Address` varchar(200) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Contact_No` varchar(10) NOT NULL,
  `Subject1` varchar(20) NOT NULL,
  `Result1` varchar(1) NOT NULL,
  `Subject2` varchar(20) NOT NULL,
  `Result2` varchar(1) NOT NULL,
  `Subject3` varchar(20) NOT NULL,
  `Result3` varchar(1) NOT NULL,
  `Island_Rank` varchar(5) NOT NULL,
  `ZScore` varchar(7) NOT NULL,
  `Index_No` varchar(10) NOT NULL,
  `Reg_Month` varchar(20) NOT NULL,
  PRIMARY KEY (`Std_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `undergratz_details`
--

INSERT INTO `undergratz_details` (`Std_Id`, `Full_Name`, `DOB`, `Gender`, `Address`, `Email`, `Contact_No`, `Subject1`, `Result1`, `Subject2`, `Result2`, `Subject3`, `Result3`, `Island_Rank`, `ZScore`, `Index_No`, `Reg_Month`) VALUES
('1', 'Hashini Nimeshika', '1890.6.12', 'Male', 'n0.67,ampara', 'hashini@gmail.com', '0718659871', 'sinhala', 'C', 'buddhist', 'B', 'history', 'A', '98', '1.9876', '123987', 'July'),
('2', 'Nimmi aththanayake', '1995.02.23', 'Female', 'No.45,Agalawaththe', 'nimmi@gmail.com', '0712342342', 'sinhala', 'A', 'English', 'A', 'tamil', 'A', '89', '1.3243', '7897652', 'February'),
('3', 'Amasa Manjari', '1998.06.07', 'Female', 'no.45/A,mahara,kadawatha', 'amasa@gmail.com', '0714568764', 'buddhist', 'A', 'chemistry', 'A', 'physics', 'A', '45', '1.4567', '2345678', 'July'),
('4', 'Leshani Isanka', '1995.09.10', 'Female', 'N0.6,matara', 'leshani@gmail.com', '0789876543', 'Maths', 'B', 'Chemistry', 'A', 'Physics', 'A', '980', '1.6788', '2176567', 'February'),
('5', 'Asangi Sathsarani', '1995.08.12', 'Female', 'Kinchigune,Madamulana', 'asangi@gmail.com', '0716787654', 'Maths', 'B', 'ICT', 'A', 'Physics', 'A', '879', '1.6789', '2156787', 'July');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

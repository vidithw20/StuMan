-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 09, 2022 at 06:08 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stuman`
--

-- --------------------------------------------------------

--
-- Table structure for table `module`
--

CREATE DATABASE stuman;
USE stuman;



CREATE TABLE `module` (
  `id` int NOT NULL,
  `modulecode` varchar(255) NOT NULL,
  `modulename` varchar(255) NOT NULL,
  `lecturerincharge` varchar(255) NOT NULL,
  `gpatype` varchar(255) NOT NULL,
  `credits` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `module`
--

INSERT INTO `module` (`id`, `modulecode`, `modulename`, `lecturerincharge`, `gpatype`, `credits`) VALUES
(13, 'IN 3100', 'Enterprise Application Development', 'Thilina Thanthriwatta', 'GPA', 4),
(14, 'CM 3310', 'Artificial Intelligence', 'Asoka Karunanda', 'GPA', 2.5),
(15, 'CM 3110', 'Computational Mathematics', 'Thilini Piyathilake', 'GPA', 2.5);

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `rid` int NOT NULL,
  `stdid` int NOT NULL,
  `rmodule` varchar(255) NOT NULL,
  `rmarks` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`rid`, `stdid`, `rmodule`, `rmarks`) VALUES
(12, 2, 'CM 3110', 4),
(13, 3, 'CM 3310', 4.2),
(14, 3, 'IN 3100', 4),
(15, 5, 'CM 3310', 4),
(16, 5, 'IN 3100', 4.2),
(17, 5, 'CM 3310', 4),
(18, 1, 'IN 3100', 3.7),
(19, 1, 'CM 3110', 3.7),
(20, 1, 'CM 3310', 4);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `sid` int NOT NULL,
  `sname` varchar(255) NOT NULL,
  `slevel` varchar(255) NOT NULL,
  `snumber` varchar(255) NOT NULL,
  `sgmail` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`sid`, `sname`, `slevel`, `snumber`, `sgmail`) VALUES
(1, 'Vidith Welihinda', 'Level 3', '0775020514', 'vidithw99@gmail.com'),
(2, 'Imalsha Liyanage', 'Level 2', '0712435787', '123@gmail.com'),
(3, 'Binuli Fernando', 'Level 3', '077123245', '234@gmail.com'),
(5, 'Uvini Illangasinghe', 'Level 3', '0775020515', '457@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `module`
--
ALTER TABLE `module`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD PRIMARY KEY (`rid`),
  ADD KEY `stdid` (`stdid`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`sid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `module`
--
ALTER TABLE `module`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `result`
--
ALTER TABLE `result`
  MODIFY `rid` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `sid` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `result`
--
ALTER TABLE `result`
  ADD CONSTRAINT `result_ibfk_1` FOREIGN KEY (`stdid`) REFERENCES `student` (`sid`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

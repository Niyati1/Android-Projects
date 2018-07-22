-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 25, 2013 at 06:10 PM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `android_api`
--

-- --------------------------------------------------------

--
-- Table structure for table `current`
--

CREATE TABLE IF NOT EXISTS `current` (
  `cid` int(10) NOT NULL AUTO_INCREMENT,
  `code` int(10) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `nav` decimal(30,2) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=70 ;

--
-- Dumping data for table `current`
--

INSERT INTO `current` (`cid`, `code`, `date`, `nav`) VALUES
(1, 1, '2013-04-15 20:14:14', 62.42),
(2, 2, '2013-04-15 20:14:14', 260.31),
(3, 3, '2013-04-15 20:14:33', 15.01),
(4, 4, '2013-04-15 20:14:33', 11.46),
(5, 5, '2013-04-15 20:15:09', 11.21),
(6, 6, '2013-04-15 20:15:09', 100.21),
(7, 7, '2013-04-15 20:15:24', 20.14),
(8, 8, '2013-04-15 20:15:24', 13.73),
(9, 9, '2013-04-15 20:15:38', 10.32),
(10, 10, '2013-04-15 20:15:38', 11.06),
(11, 11, '2013-04-15 20:15:48', 8.65),
(12, 12, '2013-04-15 20:15:48', 9.50),
(13, 13, '2013-04-15 20:15:58', 23.16),
(14, 14, '2013-04-15 20:15:58', 20.98),
(15, 15, '2013-04-15 20:16:12', 11.95),
(16, 16, '2013-04-15 20:16:12', 1001.37),
(17, 17, '2013-04-15 20:16:23', 11.27),
(18, 18, '2013-04-15 20:16:23', 12.86),
(19, 19, '2013-04-15 20:16:32', 230.64),
(20, 20, '2013-04-15 20:16:32', 12.55),
(21, 21, '2013-04-15 20:16:41', 11.26),
(22, 22, '2013-04-15 20:16:41', 36.91),
(23, 23, '2013-04-15 20:16:53', 17.20),
(24, 24, '2013-04-15 20:16:53', 14.33),
(25, 25, '2013-04-15 20:17:03', 10.02),
(26, 26, '2013-04-15 20:17:03', 26.63),
(27, 27, '2013-04-25 15:46:58', 25.91),
(28, 28, '2013-04-25 15:46:58', 17.94),
(29, 29, '2013-04-25 15:46:58', 49.18),
(30, 30, '2013-04-25 15:46:58', 40.13),
(31, 31, '2013-04-25 15:46:58', 13.00),
(32, 32, '2013-04-25 15:46:58', 10.00),
(33, 33, '2013-04-25 15:46:58', 9.98),
(34, 34, '2013-04-25 15:46:58', 14.57),
(35, 35, '2013-04-25 15:46:58', 13.58),
(36, 36, '2013-04-25 15:46:58', 16.71),
(37, 37, '2013-04-25 15:46:58', 12.66),
(38, 38, '2013-04-25 15:46:58', 18.71),
(39, 39, '2013-04-25 15:46:58', 10.01),
(40, 40, '2013-04-25 15:46:58', 10.82),
(41, 41, '2013-04-25 15:46:58', 16.41),
(42, 42, '2013-04-25 15:46:58', 10.92),
(43, 43, '2013-04-25 15:46:58', 11.53),
(44, 44, '2013-04-25 15:46:58', 11.81),
(45, 45, '2013-04-25 15:46:58', 24.11),
(46, 46, '2013-04-25 15:46:58', 10.06),
(47, 47, '2013-04-25 15:55:10', 10.69),
(48, 48, '2013-04-25 15:55:10', 12.19),
(49, 49, '2013-04-25 15:55:10', 18.50),
(50, 50, '2013-04-25 15:55:10', 18.65),
(51, 51, '2013-04-25 15:55:10', 12.53),
(52, 52, '2013-04-25 15:55:10', 74.61),
(53, 53, '2013-04-25 15:55:10', 43.32),
(54, 54, '2013-04-25 15:55:10', 34.05),
(55, 55, '2013-04-25 15:55:10', 25.82),
(56, 56, '2013-04-25 15:55:10', 11.92),
(57, 57, '2013-04-25 15:55:10', 12.43),
(58, 58, '2013-04-25 15:55:10', 11.04),
(59, 59, '2013-04-25 15:55:10', 12.80),
(60, 60, '2013-04-25 15:55:10', 12.34),
(61, 61, '2013-04-25 15:55:10', 51.73),
(62, 62, '2013-04-25 15:55:10', 24.97),
(63, 63, '2013-04-25 15:55:10', 11.92),
(64, 64, '2013-04-25 15:55:10', 61.04),
(65, 65, '2013-04-25 15:55:10', 55.74),
(66, 66, '2013-04-25 15:55:10', 85.06),
(67, 67, '2013-04-25 15:55:10', 17.38),
(68, 68, '2013-04-25 15:55:10', 10.53),
(69, 69, '2013-04-25 15:55:10', 1028.99);

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE IF NOT EXISTS `history` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `code` int(10) NOT NULL,
  `date` date NOT NULL,
  `nav` decimal(30,2) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`id`, `code`, `date`, `nav`) VALUES
(1, 1, '2013-04-01', 2.30),
(2, 1, '2013-04-02', 3.20),
(4, 1, '2013-04-03', 4.50),
(5, 1, '2013-04-05', 3.20),
(6, 2, '2013-04-01', 2.30),
(7, 2, '2013-04-02', 4.30),
(8, 2, '2013-04-03', 2.60),
(9, 2, '2013-04-04', 4.30);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE IF NOT EXISTS `products` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(100) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `Qty` int(10) NOT NULL,
  `nav` decimal(30,2) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`pid`, `sname`, `price`, `Qty`, `nav`, `created_at`, `updated_at`) VALUES
(1, 'Reliance CNX 100 fund', 50000.00, 1, 53.90, '2013-04-21 12:06:32', '0000-00-00 00:00:00'),
(2, 'Birla Equity Fund', 250000.00, 2, 2.40, '2013-04-21 13:57:38', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `schemes`
--

CREATE TABLE IF NOT EXISTS `schemes` (
  `pid` int(100) NOT NULL AUTO_INCREMENT,
  `sname` varchar(100) NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `Qty` int(11) NOT NULL,
  `comp_name` text,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  UNIQUE KEY `pid` (`pid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=71 ;

--
-- Dumping data for table `schemes`
--

INSERT INTO `schemes` (`pid`, `sname`, `price`, `Qty`, `comp_name`, `created_at`, `updated_at`) VALUES
(1, 'Birla Equity Fund', 62.42, 0, 'Birla Sun Life Mutual Fund\r\nCategory: Aggressive', '2013-03-19 13:26:24', '2013-03-22 08:51:26'),
(2, 'Birla Frontline Equity Fund', 260.31, 0, 'Birla Sun Life Mutual Fund\r\nCategory: Aggressive', '2013-03-19 13:28:01', '0000-00-00 00:00:00'),
(3, 'Birla India Opportunities', 15.01, 0, 'Birla Sun life Mutual Fund.\r\nCategory: Aggressive', '2013-03-19 13:29:37', '0000-00-00 00:00:00'),
(4, 'Birla montly Income', 11.46, 0, 'Birla Sun Life Mutual Fund.\r\nCategory: Balance', '2013-03-19 13:31:14', '0000-00-00 00:00:00'),
(5, 'Birla Capital Protection Oriented Fund', 11.21, 0, 'Birla Sun Life Mutual Fund.\r\nCategory: Balance', '2013-03-19 13:32:35', '0000-00-00 00:00:00'),
(6, 'Birla Cash Manager', 100.21, 0, 'Birla Sun Life Mutual Fund.\r\nCategory: Safe', '2013-03-19 13:34:08', '0000-00-00 00:00:00'),
(7, 'Birla Dynamic Bond Fund', 20.14, 0, 'Birla Sun Life Mutual Fund.\r\nCategory: Safe', '2013-03-19 13:35:07', '0000-00-00 00:00:00'),
(8, 'Birla Income Plus', 13.73, 0, 'Birla Sun Life Mutual Fund.\r\nCategory: Safe', '2013-03-19 13:36:16', '0000-00-00 00:00:00'),
(9, 'Birla Medium Term Plan', 10.32, 0, 'Birla Sun Life Mutual Fund.\r\nCategory: Safe', '2013-03-19 13:37:39', '0000-00-00 00:00:00'),
(10, 'DSP Equity Fund', 11.06, 0, 'DSP BlackRock Mutual Fund.\r\nCategory: Aggressive', '2013-03-19 13:39:48', '0000-00-00 00:00:00'),
(11, 'DSP India T.I.G.E.R. Fund', 8.65, 0, 'DSP BlackRock Mutual Fund.\r\nCategory: Aggressive', '2013-03-19 15:21:42', '0000-00-00 00:00:00'),
(12, 'DSP Natural Resources', 9.50, 0, 'DSP BlackRock Mutual Fund.\r\nCategory: Aggressive', '2013-03-19 15:21:42', '0000-00-00 00:00:00'),
(13, 'DSP MIP Fund', 23.16, 0, 'DSP BlackRock Mutual Fund.\r\nCategory: Balance', '2013-03-19 15:25:53', '0000-00-00 00:00:00'),
(14, 'DSP Balanced Fund', 20.98, 0, 'DSP BlackRock Mutual Fund.\r\nCategory: Balance', '2013-03-19 15:25:53', '0000-00-00 00:00:00'),
(15, 'DSP Bond Fund', 11.95, 0, 'DSP BlackRock Mutual Fund.\r\nCategory: Safe', '2013-03-19 15:26:41', '0000-00-00 00:00:00'),
(16, 'DSP Money Manager', 1001.37, 0, 'DSP BlackRock Mutual Fund.\r\nCategory: Safe', '2013-03-19 15:28:39', '0000-00-00 00:00:00'),
(17, 'DSP Short Term Fund', 11.27, 0, 'DSP BlackRock Mutual Fund.\r\nCategory: Safe', '2013-03-19 15:28:39', '0000-00-00 00:00:00'),
(18, 'FT Asian Equity Fund', 12.86, 0, 'Franklin Templeton Mutual Fund\r\nCategory: Aggressive', '2013-03-19 15:29:31', '0000-00-00 00:00:00'),
(19, 'FT India BlueChip Fund', 230.64, 0, 'Franklin Templeton Mutual Fund\r\nCategory: Aggressive', '2013-03-22 10:03:37', '0000-00-00 00:00:00'),
(20, 'FT India Oportunities Fund', 12.55, 0, 'Franklin Templeton Mutual Fund\r\nCategory: Balance', '2013-03-22 10:04:32', '0000-00-00 00:00:00'),
(21, 'FT India Monthly Income Plan', 11.26, 0, 'Franklin Templeton Mutual Fund\r\nCategory: Aggressive', '2013-03-22 10:05:22', '0000-00-00 00:00:00'),
(22, 'FT India Childrens'' Asset Plan', 36.91, 0, 'Franklin Templeton Mutual Fund\r\nCategory: Balance', '2013-03-22 10:06:08', '0000-00-00 00:00:00'),
(23, 'FT India Balanced Plan', 17.20, 0, 'Franklin Templeton Mutual Fund\r\nCategory: Balance', '2013-03-22 10:07:15', '0000-00-00 00:00:00'),
(24, 'FT India Income Fund', 14.33, 0, 'Franklin Templeton Mutual Fund\r\nCategory: Safe', '2013-03-22 10:08:04', '0000-00-00 00:00:00'),
(25, 'FT India Ultra', 10.02, 0, 'Franklin Templeton Mutual Fund\r\nCategory: Safe', '2013-03-22 10:09:09', '0000-00-00 00:00:00'),
(26, 'HDFC Long Term Equity Fund', 26.63, 0, 'HDFC Asset Management Ltd\r\nCategory: Aggressive', '2013-03-22 10:11:25', '0000-00-00 00:00:00'),
(27, 'HDFC Growth Fund', 25.91, 0, 'HDFC Aseet Management Ltd\r\nCategory: Aggressive', '2013-03-22 10:12:24', '0000-00-00 00:00:00'),
(28, 'HDFC Balanced Fund', 17.94, 0, 'HDFC Asset Management Ltd\r\nCategory: Balance', '2013-03-22 10:13:46', '0000-00-00 00:00:00'),
(29, 'HDFC Children Gift Fund', 49.18, 0, 'HDFC Asset Management Ltd\r\nCategory: Balance', '2013-03-22 10:17:05', '0000-00-00 00:00:00'),
(30, 'HDFC High Interest Fund', 40.13, 0, 'HDFC Asset Management Ltd\r\nCategory: Safe', '2013-03-22 10:17:05', '0000-00-00 00:00:00'),
(31, 'HDFC Cash Mgmt Fund', 13.00, 0, 'HDFC Asset Management Ltd\r\nCategory: Safe', '2013-03-22 10:18:45', '0000-00-00 00:00:00'),
(32, 'HDFC Floating rate Income Fund', 10.00, 0, 'HDFC Asset Management Ltd\r\nCategory: Safe', '2013-03-22 10:18:45', '0000-00-00 00:00:00'),
(33, 'ICICI Dynamic Plan', 9.98, 0, 'ICICI Prudential Asset Mgmt\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(34, 'ICICI Fusion Fund', 14.57, 0, 'ICICI Prudential Asset Mgmt\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(35, 'ICICI MidCap Fund', 13.58, 0, 'ICICI Prudential Asset Mgmt\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(36, 'ICICI Balanced Fund', 16.71, 0, 'ICICI Prudential Asset Mgmt\r\nCategory: Balance', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(37, 'ICICI MIP Plan', 12.66, 0, 'ICICI Prudential Asset Mgmt\r\nCategory: Balance', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(38, 'ICICI Bond Fund', 18.71, 0, 'ICICI Prudential Asset Mgmt\r\nCategory: Safe', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(39, 'ICICI Income Plan', 10.01, 0, 'ICICI Prudential Asset Mgmt\r\nCategory: Safe', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(40, 'ICICI Long Term Plan', 10.82, 0, 'ICICI Prudential Asset Mgmt\r\nCategory: Safe', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(41, 'IDFC Arbitrage Fund', 16.41, 0, 'IDFC Mutual Fund\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(42, 'IDFC Classic Equity Fund', 10.92, 0, 'IDFC Mutual Fund\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(43, 'IDFC Nifty Fund', 11.53, 0, 'IDFC Mutual Fund\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(44, 'IDFC Monthly Income Plan', 11.81, 0, 'IDFC Mutual Fund\r\nCategory: Balance', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(45, 'IDFC Dynamic Bond', 24.11, 0, 'IDFC Mutual Fund\r\nCategory: Safe', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(46, 'IDFC Money Manager', 10.06, 0, 'IDFC Mutual Fund\r\nCategory: Safe', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(47, 'Kotak Arbitrage Fund', 10.69, 0, 'Kotak Mahindra Mutual Fund\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(48, 'Kotak Global Emerging Market', 12.19, 0, 'Kotak Mahindra Mutual Fund\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(49, 'Kotak Monthly Income', 18.50, 0, 'Kotak Mahindra Mutual Fund\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(50, 'Kotak Balance Plan', 18.65, 0, 'Kotak Mahindra Mutual Fund\r\nCategory: Balance', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(51, 'Kotak Bond-Deposit', 12.53, 0, 'Kotak Mahindra Mutual Fund\r\nCategory: Safe', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(52, 'Reliance Growth Fund', 74.61, 0, 'Reliance Asset Mgmt LTD\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(53, 'Reliance Vision Fund', 43.32, 0, 'Reliance Asset Mgmt LTD\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(54, 'Reliance Equity Oportunity', 34.05, 0, 'Reliance Asset Mgmt LTD\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(55, 'Reliance Monthly Income', 25.82, 0, 'Reliance Asset Mgmt LTD\r\nCategory: Balance', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(56, 'Reliance Dual Advg ', 11.92, 0, 'Reliance Asset Mgmt LTD\r\nCategory: Balance', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(57, 'Reliance Income Fund', 12.43, 0, 'Reliance Asset Mgmt LTD\r\nCategory: Safe', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(58, 'Reliance Short Term', 11.04, 0, 'Reliance Asset Mgmt LTD\r\nCategory: Safe', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(59, 'SBI Magnum Equity', 12.80, 0, 'SBI Mutual Fund\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(60, 'SBI Arbitrage Opportunities', 12.34, 0, 'SBI Mutual Fund\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(61, 'SBI MSFU Pharma', 51.73, 0, 'SBI Mutual Fund\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(62, 'SBI Magnum Balanced', 24.97, 0, 'SBI Mutual Fund\r\nCategory: Safe', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(63, 'SBI Dynamic Bond Fund', 11.92, 0, 'SBI Mutual Fund\r\nCategory: Safe', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(64, 'UTI Equity Fund', 61.04, 0, 'UTI Mutual Fund\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(65, 'UTI Master Index Fund', 55.74, 0, 'UTI Mutual Fund\r\nCategory: Aggressive', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(66, 'UTI Balanced Fund', 85.06, 0, 'UTI Mutual Fund\r\nCategory: Balance', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(67, 'UTI Variable Scheme', 17.38, 0, 'UTI Mutual Fund\r\nCategory: Balance', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(68, 'UTI Dynamic Bond', 10.53, 0, 'UTI Mutual Fund\r\nCategory: Safe', '2013-04-25 14:09:38', '0000-00-00 00:00:00'),
(69, 'UTI Treasury Advtg', 1028.99, 0, 'UTI Mutual Fund\r\nCategory: Safe', '2013-04-25 14:09:38', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `unique_id` varchar(23) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `encrypted_password` varchar(80) NOT NULL,
  `salt` varchar(10) NOT NULL,
  `created_at` datetime DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `unique_id` (`unique_id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=11 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`uid`, `unique_id`, `name`, `email`, `encrypted_password`, `salt`, `created_at`, `updated_at`) VALUES
(1, '513b51be7ba0a8.97459775', 'apurva', 'apu@gmail.com', 'vwpsGij2i9AjFOVtpmxrV37zYeYwNTFlODZhYTdj', '051e86aa7c', '2013-03-09 20:44:06', NULL),
(2, '513b571731c405.46992529', 'akhi', 'akhi@gmail.com', '8iAG2v13w6Tr4fWxIZwyZ/Wntx41N2E4MWZkMzA5', '57a81fd309', '2013-03-09 21:06:55', NULL),
(4, '516d853072c212.80170875', 'achint', 'achint@gmail.com', 'NjhNHYu1CTJY4HHTtWas6Lof5F1hNTk2MWExNTc3', 'a5961a1577', '2013-04-16 22:36:56', NULL),
(5, '516d87b7309e84.83678613', 'harshini', 'shini@gmail.com', '4/lq/CY7u9c3yrzQ7r8J4PW2mlk1ZDk3NTkzMWJk', '5d975931bd', '2013-04-16 22:47:43', NULL),
(6, '516e2781e1df41.50105069', 'niyati shah', 'shahniyat1@gmail.com', 'Ib7h9b5PU2ziky7LGSYu7PcWTGswZGU2MGU3NTNl', '0de60e753e', '2013-04-17 10:09:30', NULL),
(7, '516e28086549b1.83381704', 'niya', 'niya@gmail.com', '/8HVShLrU/YS23+kKPBNxXlOGN8wOGU3NTkwYzFh', '08e7590c1a', '2013-04-17 10:11:44', NULL),
(9, '517191295df1e9.16239462', 'jinal patel', 'jinal.p@gmail.com', 'hakcO3XuJMH8UZys7rXs25dkRCk3ZDI0NTYzZmI3', '7d24563fb7', '2013-04-20 00:17:05', NULL),
(10, '517954e7cea097.98893114', 'Daisy', 'daisy@gmail.com', 'Sf4RO+63bbMiWfUBTZihSZRoaEVkNTg0M2MyNjM0', 'd5843c2634', '2013-04-25 21:38:07', NULL);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

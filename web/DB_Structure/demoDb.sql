/*
SQLyog Community Edition- MySQL GUI v8.12 
MySQL - 5.1.36-community-log : Database - demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`demo` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `demo`;

/*Table structure for table `bgw` */

DROP TABLE IF EXISTS `bgw`;

CREATE TABLE `bgw` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `date` varchar(20) DEFAULT NULL,
  `month` varchar(20) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `BGW_Open_Equipment_Page` varchar(30) DEFAULT NULL,
  `BGW_Open_Add_Aisle_Page` varchar(30) DEFAULT NULL,
  `BGW_Load_Rack_Details` varchar(30) DEFAULT NULL,
  `BGW_Path_Select_Path` varchar(30) DEFAULT NULL,
  `BGW_Path_Open_CircuitId_Details` varchar(30) DEFAULT NULL,
  `BGW_Path_Open_Circuit_View_Page` varchar(30) DEFAULT NULL,
  `BGW_Path_Open_Print_View_Page` varchar(30) DEFAULT NULL,
  `BGW_Path_Open_Circuit_Premises_Page` varchar(30) DEFAULT NULL,
  `BGW_Path_Click_Modify` varchar(30) DEFAULT NULL,
  `BGW_Site_Open_Add_New_Site_Page` varchar(30) DEFAULT NULL,
  `BGW_View_Order_OpenView_Order_Page` varchar(30) DEFAULT NULL,
  `BGW_View_Order_Open_Details_Page` varchar(20) DEFAULT NULL,
  `BGW_View_Order_Open_Audits_Tab` varchar(30) DEFAULT NULL,
  `BGW_View_Order_Open_Interface_Activity_Tab` varchar(30) DEFAULT NULL,
  `BGW_Search_Task_Record` varchar(30) DEFAULT NULL,
  `BGW_Search_Task_Open_Task_Detail_Page` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Table structure for table `ipsm` */

DROP TABLE IF EXISTS `ipsm`;

CREATE TABLE `ipsm` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `date` varchar(20) DEFAULT NULL,
  `month` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `IPSM_SITE_Select_Cloudservices_Click_Search` varchar(20) DEFAULT NULL,
  `IPSM_SITE_Search_Site_Partname` varchar(20) DEFAULT NULL,
  `IPSM_SITE_Search_Circuitid` varchar(20) DEFAULT NULL,
  `IPSM_VPN_Select_Cloudservices_Click_Search` varchar(20) DEFAULT NULL,
  `IPSM_WS_UpdateSiteInfo_Invoke` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Table structure for table `snm` */

DROP TABLE IF EXISTS `snm`;

CREATE TABLE `snm` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `date` varchar(30) DEFAULT NULL,
  `month` varchar(30) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `SNM_Advanced_Trunk_Search_Search_Trunks` varchar(20) DEFAULT NULL,
  `SNM_Circuit_Assign/Provision_Find_Ports_Field` varchar(20) DEFAULT NULL,
  `SNM_Circuit_Assign/Provision_Assign` varchar(20) DEFAULT NULL,
  `SNM_Circuit_View_Modify_Query` varchar(20) DEFAULT NULL,
  `SNM_NNIConnection_New_Search_NNI` varchar(20) DEFAULT NULL,
  `SNM_WS_find_Access_Cicuit_Capacity_At_Multiple_Sites` varchar(20) DEFAULT NULL,
  `SNM_WS_find_Path_Capacity` varchar(20) DEFAULT NULL,
  `SNM_WS_get_NNICapacity_From_SNM` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

/*Table structure for table `vdds` */

DROP TABLE IF EXISTS `vdds`;

CREATE TABLE `vdds` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `date` varchar(30) DEFAULT NULL,
  `month` varchar(30) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `VDDS_Circuit_Search_Circuit` varchar(20) DEFAULT NULL,
  `VDDS_WorkOrder_Search_Work_Order` varchar(20) DEFAULT NULL,
  `VDDS_WS_Get_PVC_Changeinfo` varchar(20) DEFAULT NULL,
  `VDDS_WS_GetCircuit_And_Pvcs_IPSM` varchar(20) DEFAULT NULL,
  `VDDS_TDM_Order_Approve` varchar(20) DEFAULT NULL,
  `VDDS_TDM_Order_Provisioning_Search_WorkOrder` varchar(20) DEFAULT NULL,
  `VDDS_TDM_Order_Provisioning_Click_Submit_Provision_Button` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;

CREATE TABLE `devices` (
                           `accountNo` varchar(255) NOT NULL,
                           `deviceId` char(36) NOT NULL,
                           `osName` varchar(255) DEFAULT NULL,
                           `osVersion` varchar(255) DEFAULT NULL,
                           `platform` varchar(255) DEFAULT NULL,
                           `state` tinyint DEFAULT '1',
                           `creationTime` datetime DEFAULT NULL,
                           `updateTime` datetime DEFAULT NULL,
                           PRIMARY KEY (`accountNo`,`deviceId`)
);

INSERT INTO `devices` VALUES ('009722008', '05f86347-44c3-49dd-ba72-85bc6047a6c1', 'Ubuntu', '20.04', 'linux', '1', '2020-10-01 11:08:50', '2020-10-01 11:08:50');
INSERT INTO `devices` VALUES ('260973608', '81e5d464-548d-4985-81bc-c72e09dee9d6', 'Windows 10', '10', 'windows', '1', '2020-10-01 11:08:50', '2020-10-01 11:08:50');
INSERT INTO `devices` VALUES ('009722008', '9e397840-c6c7-434b-ad5b-d8c9bc761b82', 'Ubuntu', '18.04', 'linux', '1', '2020-10-01 11:08:50', '2020-10-01 11:08:50');
INSERT INTO `devices` VALUES ('260973608', 'fed31d98-b54d-4ec3-864f-67c602f7afe6', 'Ubuntu', '20.10', 'linux', '1', '2020-10-01 11:08:50', '2020-10-01 11:08:50');
INSERT INTO `devices` VALUES ('009722008', 'b9cbd902-4960-41e4-a73b-7154c7bfcdc3', 'MacOS', '10.15.7', 'osx', '1', '2020-10-01 11:08:50', '2020-10-01 11:08:50');
--
-- .
-- Prepared SQL queries for 'Version' definition.
--


--
-- SELECT template for table `Version`
--
SELECT `id`, `type`, `url`, `time`, `releaseTime` FROM `Version` WHERE 1;

--
-- INSERT template for table `Version`
--
INSERT INTO `Version`(`id`, `type`, `url`, `time`, `releaseTime`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `Version`
--
UPDATE `Version` SET `id` = ?, `type` = ?, `url` = ?, `time` = ?, `releaseTime` = ? WHERE 1;

--
-- DELETE template for table `Version`
--
DELETE FROM `Version` WHERE 0;


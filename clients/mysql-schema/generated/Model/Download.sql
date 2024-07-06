--
-- .
-- Prepared SQL queries for 'Download' definition.
--


--
-- SELECT template for table `Download`
--
SELECT `sha1`, `size`, `url` FROM `Download` WHERE 1;

--
-- INSERT template for table `Download`
--
INSERT INTO `Download`(`sha1`, `size`, `url`) VALUES (?, ?, ?);

--
-- UPDATE template for table `Download`
--
UPDATE `Download` SET `sha1` = ?, `size` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `Download`
--
DELETE FROM `Download` WHERE 0;


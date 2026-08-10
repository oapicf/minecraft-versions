--
-- ""
-- Prepared SQL queries for 'Download' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'download'
--
SELECT sha1, "size", url FROM download WHERE 1=1;

--
-- INSERT template for table 'download'
--
INSERT INTO download (sha1, "size", url) VALUES (?, ?, ?);

--
-- UPDATE template for table 'download'
--
UPDATE download SET sha1 = ?, "size" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'download'
--
DELETE FROM download WHERE 1=2;


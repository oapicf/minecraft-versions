--
-- ""
-- Prepared SQL queries for 'Version' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'version'
--
SELECT "id", "type", url, "time", release_time FROM "version" WHERE 1=1;

--
-- INSERT template for table 'version'
--
INSERT INTO "version" ("id", "type", url, "time", release_time) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'version'
--
UPDATE "version" SET "id" = ?, "type" = ?, url = ?, "time" = ?, release_time = ? WHERE 1=2;

--
-- DELETE template for table 'version'
--
DELETE FROM "version" WHERE 1=2;


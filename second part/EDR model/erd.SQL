/*
Created: 06.02.2019
Modified: 06.02.2019
Model: PostgreSQL 10
Database: PostgreSQL 10
*/


-- Create tables section -------------------------------------------------

-- Table REQUEST

CREATE TABLE "REQUEST"(
 "ID" Integer NOT NULL,
 "S_NAME" Character varying,
 "D_ACTIVE_FROM" Date,
 "D_ACTIVE_TO" Date,
 "I_REQUEST_TYPE" Integer,
 "D_LAST_UPDATE" Date,
 "S_PERFORMER" Character varying
)
;

-- Add keys for table REQUEST

ALTER TABLE "REQUEST" ADD CONSTRAINT "Key1" PRIMARY KEY ("ID")
;

ALTER TABLE "REQUEST" ADD CONSTRAINT "ID" UNIQUE ("ID")
;

-- Table DIRECTION

CREATE TABLE "DIRECTION"(
 "ID" Integer NOT NULL,
 "S_NAME" Character varying,
 "I_DISTR_COMPANY" Integer,
 "I_GOODS_COUNT" Integer,
 "D_CREATED" Date,
 "D_PLANE_CLOSE" Date,
 "ID_REQUEST" Integer
)
;

-- Create indexes for table DIRECTION

CREATE INDEX "IX_Relationship5" ON "DIRECTION" ("ID_REQUEST")
;

-- Add keys for table DIRECTION

ALTER TABLE "DIRECTION" ADD CONSTRAINT "Key2" PRIMARY KEY ("ID")
;

--ALTER TABLE "DIRECTION" ADD CONSTRAINT "ID" UNIQUE ("ID")
--;

-- Table ACT

CREATE TABLE "ACT"(
 "ID" Integer NOT NULL,
 "D_CREATED" Date,
 "D_APPROVED" Bigint,
 "ID_REQUEST" Integer
)
;

-- Create indexes for table ACT

CREATE INDEX "IX_Relationship4" ON "ACT" ("ID_REQUEST")
;

-- Add keys for table ACT

ALTER TABLE "ACT" ADD CONSTRAINT "Key3" PRIMARY KEY ("ID")
;

--ALTER TABLE "ACT" ADD CONSTRAINT "ID" UNIQUE ("ID")
--;
-- Create foreign keys (relationships) section ------------------------------------------------- 

ALTER TABLE "ACT" ADD CONSTRAINT "Relationship4" FOREIGN KEY ("ID_REQUEST") REFERENCES "REQUEST" ("ID") ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE "DIRECTION" ADD CONSTRAINT "Relationship5" FOREIGN KEY ("ID_REQUEST") REFERENCES "REQUEST" ("ID") ON DELETE NO ACTION ON UPDATE NO ACTION
;





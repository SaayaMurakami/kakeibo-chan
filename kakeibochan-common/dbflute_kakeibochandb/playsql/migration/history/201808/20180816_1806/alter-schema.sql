ALTER TABLE ASSET ADD BALANCE int NOT NULL COMMENT '残高' after ASSET_NAME;
UPDATE ASSET SET BALANCE = 0;
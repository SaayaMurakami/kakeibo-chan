/* Create Tables */

-- 勘定科目
CREATE TABLE ACCOUNT_ITEM
(
	ACCOUNT_ITEM_ID bigint NOT NULL AUTO_INCREMENT COMMENT '勘定科目ID ',
	MEMBER_ID bigint NOT NULL COMMENT '会員ID',
	CATEGORY_TYPE varchar(10) NOT NULL COMMENT 'カテゴリ種別',
	ACCOUNT_TITLE varchar(200) NOT NULL COMMENT '勘定科目名',
	DEL_FLG char(1) NOT NULL COMMENT '削除フラグ',
	REGISTER_DATETIME datetime NOT NULL COMMENT '登録日時',
	REGISTER_USER varchar(200) NOT NULL COMMENT '登録ユーザー',
	UPDATE_DATETIME datetime NOT NULL COMMENT '更新日時',
	UPDATE_USER varchar(200) NOT NULL COMMENT '更新ユーザー',
	VERSION_NO bigint NOT NULL COMMENT 'バージョン番号',
	PRIMARY KEY (ACCOUNT_ITEM_ID),
	UNIQUE (ACCOUNT_ITEM_ID)
) COMMENT = '勘定科目';


-- 資産
CREATE TABLE ASSET
(
	ASSET_ID bigint NOT NULL AUTO_INCREMENT COMMENT '資産ID',
	MEMBER_ID bigint NOT NULL COMMENT '会員ID',
	ASSET_NAME varchar(200) NOT NULL COMMENT '資産名',
	DEL_FLG char(1) NOT NULL COMMENT '削除フラグ',
	REGISTER_DATETIME datetime NOT NULL COMMENT '登録日時',
	REGISTER_USER varchar(200) NOT NULL COMMENT '登録ユーザー',
	UPDATE_DATETIME datetime NOT NULL COMMENT '更新日時',
	UPDATE_USER varchar(200) NOT NULL COMMENT '更新ユーザー',
	VERSION_NO bigint NOT NULL COMMENT 'バージョン番号',
	PRIMARY KEY (ASSET_ID),
	UNIQUE (ASSET_ID)
) COMMENT = '資産';


-- 会員
CREATE TABLE MEMBER
(
	MEMBER_ID bigint NOT NULL AUTO_INCREMENT COMMENT '会員ID',
	MAIL_ADDRESS varchar(200) NOT NULL COMMENT 'メールアドレス',
	NAME varchar(200) NOT NULL COMMENT '名前',
	PASSWORD varchar(200) NOT NULL COMMENT 'パスワード',
	REGISTER_DATETIME datetime NOT NULL COMMENT '登録日時',
	REGISTER_USER varchar(200) NOT NULL COMMENT '登録ユーザー',
	UPDATE_DATETIME datetime NOT NULL COMMENT '更新日時',
	UPDATE_USER varchar(200) NOT NULL COMMENT '更新ユーザー',
	VERSION_NO bigint NOT NULL COMMENT 'バージョン番号',
	PRIMARY KEY (MEMBER_ID),
	UNIQUE (MEMBER_ID),
	UNIQUE (MAIL_ADDRESS)
) COMMENT = '会員';


-- 明細
CREATE TABLE RECORD
(
	RECORD_ID bigint NOT NULL AUTO_INCREMENT COMMENT '明細ID',
	MEMBER_ID bigint NOT NULL COMMENT '会員ID',
	ACCOUNT_ITEM_ID bigint NOT NULL COMMENT '勘定科目ID ',
	DEPOSIT_ACCOUNT_ID bigint COMMENT '入金先口座ID',
	WITHDRAWAL_ACCOUNT_ID bigint COMMENT '出金元口座ID',
	DATE date NOT NULL COMMENT '日付',
	AMOUNT int NOT NULL COMMENT '金額',
	-- 支出内容の補足説明
	MEMO varchar(200) COMMENT 'メモ : 支出内容の補足説明',
	DEL_FLG char(1) NOT NULL COMMENT '削除フラグ',
	REGISTER_DATETIME datetime NOT NULL COMMENT '登録日時',
	REGISTER_USER varchar(200) NOT NULL COMMENT '登録ユーザー',
	UPDATE_DATETIME datetime NOT NULL COMMENT '更新日時',
	UPDATE_USER varchar(200) NOT NULL COMMENT '更新ユーザー',
	VERSION_NO bigint NOT NULL COMMENT 'バージョン番号',
	PRIMARY KEY (RECORD_ID),
	UNIQUE (RECORD_ID)
) COMMENT = '明細';


-- 退会情報
CREATE TABLE WITHDRAWAL
(
	WITHDRAWAL_ID bigint NOT NULL AUTO_INCREMENT COMMENT '退会情報ID',
	MEMBER_ID bigint NOT NULL COMMENT '会員ID',
	REASON text COMMENT '退会理由',
	REGISTER_DATETIME datetime NOT NULL COMMENT '登録日時',
	REGISTER_USER varchar(200) NOT NULL COMMENT '登録ユーザー',
	UPDATE_DATETIME datetime NOT NULL COMMENT '更新日時',
	UPDATE_USER varchar(200) NOT NULL COMMENT '更新ユーザー',
	VERSION_NO bigint NOT NULL COMMENT 'バージョン番号',
	PRIMARY KEY (WITHDRAWAL_ID),
	UNIQUE (WITHDRAWAL_ID),
	UNIQUE (MEMBER_ID)
) COMMENT = '退会情報';



/* Create Foreign Keys */

ALTER TABLE RECORD
	ADD FOREIGN KEY (ACCOUNT_ITEM_ID)
	REFERENCES ACCOUNT_ITEM (ACCOUNT_ITEM_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE RECORD
	ADD FOREIGN KEY (DEPOSIT_ACCOUNT_ID)
	REFERENCES ASSET (ASSET_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE RECORD
	ADD FOREIGN KEY (WITHDRAWAL_ACCOUNT_ID)
	REFERENCES ASSET (ASSET_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE ACCOUNT_ITEM
	ADD FOREIGN KEY (MEMBER_ID)
	REFERENCES MEMBER (MEMBER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE ASSET
	ADD FOREIGN KEY (MEMBER_ID)
	REFERENCES MEMBER (MEMBER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE RECORD
	ADD FOREIGN KEY (MEMBER_ID)
	REFERENCES MEMBER (MEMBER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE WITHDRAWAL
	ADD FOREIGN KEY (MEMBER_ID)
	REFERENCES MEMBER (MEMBER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

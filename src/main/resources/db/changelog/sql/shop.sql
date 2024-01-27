CREATE TABLE Goods
(
    producer varchar(10) NOT NULL,
    model    varchar(50) NOT NULL,
    type     varchar(50) NOT NULL
)
;

CREATE TABLE Computer
(
    code      int            NOT NULL,
    model     varchar(50)    NOT NULL,
    frequency int NOT NULL,
    price     decimal(12, 2) NULL
)
;

CREATE TABLE MFP
(
    code  int            NOT NULL,
    model varchar(50)    NOT NULL,
    price decimal(12, 2) NULL
)
;

ALTER TABLE Goods
    ADD
        CONSTRAINT PK_Goods PRIMARY KEY
            (
             model
                )
;

ALTER TABLE Computer
    ADD
        CONSTRAINT PK_Computer PRIMARY KEY
            (
             code
                )
;

ALTER TABLE MFP
    ADD
        CONSTRAINT PK_MFP PRIMARY KEY
            (
             code
                )
;

ALTER TABLE Computer
    ADD
        CONSTRAINT FK_Computer_Goods FOREIGN KEY
            (
             model
                ) REFERENCES Goods (
                                    model
                )
;

ALTER TABLE MFP
    ADD
        CONSTRAINT FK_MFP_Goods FOREIGN KEY
            (
             model
                ) REFERENCES Goods (
                                    model
                )
;
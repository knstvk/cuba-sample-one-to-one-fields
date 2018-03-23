-- begin SAMPLE_CUSTOMER
create table SAMPLE_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    EMAIL varchar(255),
    DETAILS_ID varchar(36),
    --
    primary key (ID)
)^
-- end SAMPLE_CUSTOMER
-- begin SAMPLE_CUSTOMER_DETAILS
create table SAMPLE_CUSTOMER_DETAILS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ADDRESS varchar(255),
    POSTCODE varchar(255),
    --
    primary key (ID)
)^
-- end SAMPLE_CUSTOMER_DETAILS

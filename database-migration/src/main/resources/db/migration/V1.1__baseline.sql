-- Filename:  V1.1__baseline.sql
-- Assumptions:
--  1) You have a Postgres 9.3 or later database
--  2) You have created a database schema
--  3) Your default database schema is set
--     create database app1_db;
--       create user app1_user with password 'secret';
--       grant all privileges on database app1_db to app1_user;
--       alter database app1_db set search_path=app1_db;
--
--

Create sequence seq_table increment by 1 START WITH 1000;


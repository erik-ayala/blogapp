CREATE DATABASE IF NOT EXISTS blog_db;

CREATE USER blog_user@localhost IDENTIFIED BY 'p@$$w0rd';
GRANT ALL ON blog_db.* TO blog_user@localhost;
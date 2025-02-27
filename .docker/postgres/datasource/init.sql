-- Création de l'utilisateur "admin" avec un rôle spécifique
CREATE USER Admin WITH PASSWORD 'Admin123';
ALTER USER Admin WITH SUPERUSER;

-- -- Création d'un utilisateur "user1" avec un rôle spécifique
-- CREATE USER user1 WITH PASSWORD 'user1password';
-- GRANT CONNECT ON DATABASE your_database TO user1;
-- GRANT SELECT, INSERT, UPDATE, DELETE ON ALL TABLES IN SCHEMA public TO user1;
--
-- -- Création d'un rôle "readonly" pour l'utilisateur "user2"
-- CREATE ROLE readonly;
-- GRANT CONNECT ON DATABASE your_database TO readonly;
-- GRANT SELECT ON ALL TABLES IN SCHEMA public TO readonly;
--
-- -- Création de l'utilisateur "user2" avec le rôle "readonly"
-- CREATE USER user2 WITH PASSWORD 'user2password';
-- GRANT readonly TO user2;

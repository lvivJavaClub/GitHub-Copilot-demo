#  TODO: - 3.2 Add flywaydb migration script here

ALTER TABLE users
    ADD COLUMN status VARCHAR(255) NOT NULL DEFAULT 'CREATED';

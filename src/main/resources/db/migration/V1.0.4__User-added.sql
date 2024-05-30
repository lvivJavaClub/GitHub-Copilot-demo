# TODO: - 3.3 Add user table migration script here

-- Ivan 2021-07-01 CREATED
    INSERT INTO `user` (id, name, status, created_at)
    VALUE (1, 'Ivan', 'CREATED', '2021-07-01 00:00:00');
-- Ihor 2021-07-02 BLOCKED
    INSERT INTO `user` (id, name, status, created_at)
    VALUE (2, 'Ihor', 'BLOCKED', '2021-07-02 00:00:00');

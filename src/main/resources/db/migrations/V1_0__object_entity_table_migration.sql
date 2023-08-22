CREATE TABLE IF NOT EXISTS obj
(
    id        uuid NOT NULL PRIMARY KEY,
    name      varchar(255),
    last_name varchar(255),
    number    int
)
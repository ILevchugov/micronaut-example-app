CREATE TABLE IF NOT EXISTS book
(
    id     INTEGER PRIMARY KEY,
    name   varchar(200),
    author varchar(200),
);

INSERT INTO book (id, name, author)
VALUES ('1', 'The Catcher in the Rye', 'Jerome David Salinger');

INSERT INTO book (id, name, author)
VALUES ('2', 'Nineteen Eighty-Four', 'George Orwell');

INSERT INTO book (id, name, author)
VALUES ('3', 'Clean Code', 'Robert Martin');




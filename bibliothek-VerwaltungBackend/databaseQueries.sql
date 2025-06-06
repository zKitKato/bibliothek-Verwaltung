/*
=======================
 Initializing the Tables
=======================
*/

-- ========== USERS ==========
CREATE TABLE user (
                      user_id IDENTITY PRIMARY KEY,
                      first_name VARCHAR(100),
                      last_name VARCHAR(100),
                      email VARCHAR(100) UNIQUE,
                      role VARCHAR(50),
                      enabled BOOLEAN DEFAULT TRUE,
                      registration_date DATE DEFAULT CURRENT_DATE
);

-- === TEST VALUES: USERS ===
INSERT INTO user (first_name, last_name, email, role, enabled)
VALUES
    ('Alice', 'Smith', 'alice@example.com', 'member', TRUE),
    ('Bob', 'Johnson', 'bob@example.com', 'librarian', TRUE),
    ('Charlie', 'Brown', 'charlie@example.com', 'member', TRUE);

-- ========== AUTHORS ==========
CREATE TABLE author (
                        author_id IDENTITY PRIMARY KEY,
                        first_name VARCHAR(100),
                        last_name VARCHAR(100) NOT NULL
);

-- === TEST VALUES: AUTHORS ===
INSERT INTO author (first_name, last_name)
VALUES
    ('George', 'Orwell'),
    ('Isaac', 'Asimov'),
    ('Stephen', 'Hawking'),
    ('Yuval', 'Harari'),
    ('Jane', 'Austen');

-- ========== CATEGORIES ==========
CREATE TABLE category (
                          id IDENTITY PRIMARY KEY,
                          name VARCHAR(50),
                          description VARCHAR(255),
                          is_active BOOLEAN DEFAULT TRUE
);

-- === TEST VALUES: CATEGORIES ===
INSERT INTO category (name, description, is_active)
VALUES
    ('Fiction', 'Narrative literary works invented by the imagination', TRUE),
    ('Science', 'Books about physics, chemistry, biology and other sciences', TRUE),
    ('History', 'Books about historical events and figures', TRUE);
    ('Biography', 'Books detailing the lives of real people', TRUE),
    ('Technology', 'Books about modern and emerging technologies', TRUE),
    ('Philosophy', 'Books exploring fundamental questions and ideas', TRUE),
    ('Travel', 'Books about places, cultures, and travel experiences', TRUE),
    ('Children', 'Books intended for children and young readers', TRUE),
    ('Self-Help', 'Books aimed at personal improvement and motivation', TRUE),
    ('Fantasy', 'Fictional books set in magical or imaginary worlds', TRUE),
    ('Cooking', 'Books with recipes and culinary techniques', TRUE);

-- ========== BOOKS ==========
CREATE TABLE book (
                      book_id IDENTITY PRIMARY KEY,
                      title VARCHAR(255) NOT NULL,
                      author_id INT,
                      publisher VARCHAR(100),
                      isbn VARCHAR(20) UNIQUE,
                      publication_year INT,
                      category_id INT,
                      total_copies INT DEFAULT 1,
                      FOREIGN KEY (author_id) REFERENCES author(author_id),
                      FOREIGN KEY (category_id) REFERENCES category(id)
);

-- === TEST VALUES: BOOKS ===
INSERT INTO book (title, author_id, publisher, isbn, publication_year, category_id, total_copies)
VALUES
    ('1984', 1, 'Secker & Warburg', '9780451524935', 1949, 1, 3),
    ('Foundation', 2, 'Gnome Press', '9780553293357', 1951, 2, 4),
    ('A Brief History of Time', 3, 'Bantam Books', '9780553380163', 1988, 2, 2),
    ('Sapiens', 4, 'Harvill Secker', '9780099590088', 2011, 3, 5),
    ('Pride and Prejudice', 5, 'T. Egerton', '9780141439518', 1813, 1, 2);


-- === UPDATE BOOKS WITH IMAGE URLS ===
UPDATE book SET image_url = 'https://covers.openlibrary.org/b/id/7222246-L.jpg' WHERE title = '1984';
UPDATE book SET image_url = 'https://covers.openlibrary.org/b/id/8281991-L.jpg' WHERE title = 'Foundation';
UPDATE book SET image_url = 'https://covers.openlibrary.org/b/id/8165416-L.jpg' WHERE title = 'A Brief History of Time';
UPDATE book SET image_url = 'https://covers.openlibrary.org/b/id/8369254-L.jpg' WHERE title = 'Sapiens';
UPDATE book SET image_url = 'https://covers.openlibrary.org/b/id/8231852-L.jpg' WHERE title = 'Pride and Prejudice';

-- ========== LOANS ==========
CREATE TABLE loan (
                      loan_id IDENTITY PRIMARY KEY,
                      book_id INT NOT NULL,
                      user_id INT NOT NULL,
                      loan_date DATE DEFAULT CURRENT_DATE,
                      due_date DATE,
                      returned_date DATE,
                      status VARCHAR(20) DEFAULT 'borrowed',
                      FOREIGN KEY (book_id) REFERENCES book(book_id),
                      FOREIGN KEY (user_id) REFERENCES user(user_id)
);

-- === TEST VALUES: LOANS ===
INSERT INTO loan (book_id, user_id, due_date, status)
VALUES
    (1, 1, DATEADD('DAY', 14, CURRENT_DATE), 'borrowed'),
    (3, 2, DATEADD('DAY', 7, CURRENT_DATE), 'borrowed');

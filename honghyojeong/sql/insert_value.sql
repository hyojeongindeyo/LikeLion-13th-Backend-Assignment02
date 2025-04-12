USE likelion_2week;

INSERT INTO movies (title,genre) VALUES
("빅 피쉬", "판타지"),
("컨택트", "SF"),
("트루먼 쇼", "SF"),
("말할 수 없는 비밀", "멜로/로맨스");

INSERT INTO customers (customer_id, name, email, favorite_movie_id) VALUES
(1, "홍효정", "ghdgywjd@naver.com", 2),
(2, "홍봄", "spring@naver.com", 1),
(3, "홍여름", "summer@gmail.com", 2),
(4, "홍가을", "fall@naver.com", 3),
(5, "홍겨울", "winter@gmail.com", 4);
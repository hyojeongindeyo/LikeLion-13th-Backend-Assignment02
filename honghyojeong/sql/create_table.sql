USE likelion_2week; -- 사용할 데이터베이스 선택

CREATE TABLE movies (
		movie_id INTEGER AUTO_INCREMENT PRIMARY KEY,  -- 영화 고유 아이디, 자동으로 1씩 증가, 기본키
		title VARCHAR(50) NOT NULL,  -- 영화 제목은 반드시 입력, null값은 x
        genre VARCHAR(50)  -- 영화 장르
);

CREATE TABLE customers (
		customer_id INTEGER PRIMARY KEY,  -- 고객 아이디
		name VARCHAR(50) NOT NULL,  	  -- 고객 이름은 반드시 입력하게 null값은 x
        email VARCHAR(60) UNIQUE, 		  -- 고객 이메일 중복되지 않게 unique설정
		favorite_movie_id INT, 			  -- 고객이 좋아하는 영화 외래키로 영화 아이디 설정
		FOREIGN KEY (favorite_movie_id) REFERENCES movies(movie_id)
);
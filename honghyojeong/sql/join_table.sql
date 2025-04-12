USE likelion_2week;

SELECT customers.name AS 고객명, movies.title AS '좋아하는 영화 제목'
FROM customers
JOIN movies
-- 아래 주석처리한 코드를 실행했을 때 홍겨울이 안 떠서 조건을 수정
-- 조건이 영화의 아이디와 고객의 아이디가 같을때를 의미하기 때문에 아이디 5를 가진 홍겨울은 나오지 않았던 문제!
-- 영화의 아이디와 고객이 좋아하는 영화의 아이디를 매칭하면 다 나온다!
-- ON movies.movie_id = customers.customer_id;
ON customers.favorite_movie_id = movies.movie_id;
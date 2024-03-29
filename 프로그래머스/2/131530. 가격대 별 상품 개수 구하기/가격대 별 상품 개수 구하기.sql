-- 만원 단위의 가격대 별로 상품 개수 출력
-- 각 컬럼명 : PRICE_GROUP, PRODUCTS
-- 만원 단위로 컷
-- 가격대를 기준으로 ASC

SELECT TRUNCATE(PRICE, -4) AS PRICE_GROUP, COUNT(*) AS PRODUCTS
FROM PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP

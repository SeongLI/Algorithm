-- 식품분류별로 가격이 제일 비싼 식품
-- 분류, 가격, 이름 조회
-- 과자, 국, 김치, 식용유인 경우만 출력
-- 식품 가격을 기준으로 내림차순

SELECT CATEGORY, PRICE AS MAX_PRICE, PRODUCT_NAME 
FROM FOOD_PRODUCT
WHERE PRICE IN (
        SELECT MAX(PRICE) 
        FROM FOOD_PRODUCT
        GROUP BY CATEGORY
    ) AND CATEGORY IN ('과자', '국', '김치', '식용유')
ORDER BY MAX_PRICE DESC
;
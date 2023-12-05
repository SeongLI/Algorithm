-- 만원 단위의 가격대 별로 상품 개수를 출력
-- 컬럼명은 각각 PRICE_GROUP, PRODUCTS
-- 가격대 정보는 각 구간의 최소금액(10,000원 이상 ~ 20,000원 미만인 경우 10,000원)
-- 가격대 기준으로 오름차순 정렬

SELECT (
    CASE 
        WHEN PRICE < 10000 THEN 0
        ELSE TRUNCATE(PRICE, -4)
    END
    ) AS PRICE_GROUP,
    COUNT(PRODUCT_ID) AS PRODUCTS
FROM PRODUCT 
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP ASC
;

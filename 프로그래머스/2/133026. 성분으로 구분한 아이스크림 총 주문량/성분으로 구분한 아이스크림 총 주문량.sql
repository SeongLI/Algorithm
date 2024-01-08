-- 상반기 동안, 총 주문량 조회
-- 총 주문량이 작은 순서대로 
SELECT I.INGREDIENT_TYPE, SUM(F.TOTAL_ORDER) AS TOTAL_ORDER
FROM FIRST_HALF AS F JOIN ICECREAM_INFO  AS I ON F.FLAVOR = I.FLAVOR
GROUP BY INGREDIENT_TYPE 
ORDER BY TOTAL_ORDER
;
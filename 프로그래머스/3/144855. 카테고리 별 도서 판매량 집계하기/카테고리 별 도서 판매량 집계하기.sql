-- 카테고리 별 도서 판매량 합산
-- 카테고리, 총 판매량 리스트를 출력
-- 카테고리 명 기준으로 오름차순 정렬
SELECT X.CATEGORY, SUM(Y.SALES) AS TOTAL_SALES FROM 
BOOK X JOIN BOOK_SALES Y 
ON X.BOOK_ID = Y.BOOK_ID
WHERE SALES_DATE LIKE '2022-01%'
# WHERE SALES_DATE >= "2022-01-01 00:00:00" AND SALES_DATE < "2023-01-01 00:00:00"
GROUP BY X.CATEGORY
ORDER BY X.CATEGORY ASC
;
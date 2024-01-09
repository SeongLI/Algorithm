-- AUTHOR_ID가 같다.
-- 2022년 1월 기준
-- 저자별, 카테고리 별 매출액 (TOTAL_SALES = 판매량 * 판매가)
-- 저자 ID, 저자명, 카테고리, 매출액 리스트 출력
-- 저자 ID ASC => 카테고리 DESC

SELECT B.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY, SUM(S.SALES * B.PRICE) AS TOTAL_SALES
FROM BOOK AS B 
    JOIN AUTHOR AS A ON B.AUTHOR_ID = A.AUTHOR_ID
    JOIN BOOK_SALES AS S ON B.BOOK_ID = S.BOOK_ID
WHERE SALES_DATE LIKE "2022-01-%"
GROUP BY AUTHOR_ID, CATEGORY
ORDER BY AUTHOR_ID ASC, CATEGORY DESC
;

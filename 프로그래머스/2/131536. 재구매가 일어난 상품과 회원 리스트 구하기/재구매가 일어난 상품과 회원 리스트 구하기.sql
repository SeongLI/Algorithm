-- 동일한 회원이 동일한 상품을 재구매한 데이터를 구하여,
-- 재구매한 회원 ID, 재구매한 상품 ID 출력
-- 회원 ID 기준 ASC => 상품 ID 기준 DESC
SELECT USER_ID, PRODUCT_ID
FROM ONLINE_SALE
GROUP BY USER_ID, PRODUCT_ID
HAVING COUNT(*) >= 2
ORDER BY USER_ID ASC, PRODUCT_ID DESC
;
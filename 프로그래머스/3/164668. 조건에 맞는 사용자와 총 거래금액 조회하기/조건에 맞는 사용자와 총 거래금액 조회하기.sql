-- 조건 : 완료된 중고 거래
-- 조건 : 총 금액이 70만원 이상
-- 조건 : 회원 ID, 닉네임, 총거래금액
-- 결과 : 총거래금액 기준 오름차순
# WHERE A.PRICE >= 700000 AND A.STATUS = 'DONE' 이렇게하믄 안돼

SELECT B.USER_ID, B.NICKNAME, SUM(A.PRICE) AS TOTAL_SALES 
FROM USED_GOODS_BOARD AS A JOIN USED_GOODS_USER AS B
ON A.WRITER_ID = B.USER_ID
WHERE A.STATUS = 'DONE'
GROUP BY A.WRITER_ID 
HAVING TOTAL_SALES  >= 700000
ORDER BY TOTAL_SALES ASC
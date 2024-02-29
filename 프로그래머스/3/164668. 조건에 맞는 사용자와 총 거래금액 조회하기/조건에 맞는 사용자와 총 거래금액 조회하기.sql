-- 완료된 중고 거래의 총금액이 70만 원 이상인 사람
-- 회원 ID, 닉네임, 총거래금액 조회
-- 총거래금액 기준 ASC
SELECT U.USER_ID, U.NICKNAME, SUM(B.PRICE) AS TOTAL_SALES
FROM USED_GOODS_USER AS U JOIN USED_GOODS_BOARD AS B
    ON U.USER_ID = B.WRITER_ID
# WHERE B.PRICE >= 700000 AND B.STATUS = 'DONE'
WHERE B.STATUS = 'DONE'
GROUP BY B.WRITER_ID
HAVING TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES ASC
;
-- 2022년 10월 5일 등록
-- 게시글 ID, 작성자 ID, 게시글 제목, 가격, 거래상태 조회
-- 거래상태가 SALE이면 판매중, RESERVED면 예약중, DONE이면 거래완료 분류
-- 게시글 ID 기준 내림차순 정렬

SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, CASE
    WHEN STATUS = 'SALE' THEN '판매중'
    WHEN STATUS = 'RESERVED' THEN '예약중'
    ELSE '거래완료' END
 AS STATUS
FROM USED_GOODS_BOARD
WHERE CREATED_DATE = '2022-10-05'
ORDER BY BOARD_ID DESC;
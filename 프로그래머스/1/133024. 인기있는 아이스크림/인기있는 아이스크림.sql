-- 총주문량을 기준 DESC => 출하 번호를 기준으로 ASC

SELECT FLAVOR
FROM FIRST_HALF
ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID ASC 
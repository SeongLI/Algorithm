-- 2022년 10월 16일에 
-- 대여 중인 자동차인 경우 '대여중' 이라고 표시 / 대여 중이지 않은 자동차인 경우 '대여 가능'을 표시하는 컬럼 AVAILABILITY 추가
-- 자동차 ID와 AVAILABILITY 리스트 출력
-- 2022년 10월 16일인 경우에도 '대여중'으로 표시
-- 자동차 ID 기준 DESC
# SELECT CAR_ID, IF(HISTORY_ID IN (
#             SELECT HISTORY_ID 
#             FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
#             WHERE START_DATE <= '2022-10-16' AND '2022-10-16' < END_DATE
#         ), '대여중', '대여 가능') AS AVAILABILITY
SELECT CAR_ID, ( CASE
                WHEN CAR_ID IN (
                SELECT CAR_ID 
                FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
                WHERE '2022-10-16' BETWEEN START_DATE AND END_DATE
                ) THEN '대여중' 
                    ELSE '대여 가능'
                    END
                    ) AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC
;
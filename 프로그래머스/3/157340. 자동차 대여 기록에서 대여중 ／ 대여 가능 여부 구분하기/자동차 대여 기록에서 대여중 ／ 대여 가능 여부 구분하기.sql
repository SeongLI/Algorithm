-- 2022년 10월 16일에 대여 중인 자동차인 경우 '대여중' 이라고 표시하고, 대여 중이지 않은 자동차인 경우 '대여 가능'을 표시
-- 자동차 ID와 AVAILABILITY 리스트를 출력
-- 자동차 ID 기준 DESC

SELECT CAR_ID, IF(CAR_ID IN (
        SELECT CAR_ID FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE '2022-10-16' BETWEEN START_DATE AND END_DATE
        ),'대여중','대여 가능' ) AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC
;

-- 2022년 10월 16일에 대여 중인 자동차 => '대여중'
-- 대여 중이지 않은 자동차인 경우 => '대여 가능'
-- AVAILABLITY 컬럼 추가
-- 자동자 ID와 AVAILABILITY 출력
-- 반납 날짜가 2022년 10월 16일인 경우 => '대여 중'
-- 자동차 ID를 기준으로 내림차순 정렬

SELECT CAR_ID , MAX(
    CASE
        WHEN '2022-10-16' BETWEEN START_DATE AND END_DATE THEN '대여중'
        ELSE '대여 가능'
        END
    ) AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
GROUP BY CAR_ID
ORDER BY CAR_ID DESC

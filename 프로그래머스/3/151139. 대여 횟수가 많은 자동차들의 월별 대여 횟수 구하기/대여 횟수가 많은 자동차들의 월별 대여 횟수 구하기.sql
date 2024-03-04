-- 대여 시작일을 기준으로 2022년 8월부터 2022년 10월까지 총 대여 횟수가 5회 이상인 자동차들
-- 월별 자동차 ID 별 총 대여 횟수(컬럼명: RECORDS) 
-- 월 기준 ASC => 자동차 ID 기준 DESC
-- 특정 월의 총 대여 횟수가 0인 경우 결과에서 제외
# SELECT MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(CAR_ID) AS RECORDS
# FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
# WHERE CAR_ID IN (
#     SELECT CAR_ID
#     FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
#     WHERE START_DATE BETWEEN '2022-08-01' AND '2022-10-31'
#     GROUP BY CAR_ID
#     HAVING COUNT(*) >= 5
#     )
# GROUP BY MONTH, CAR_ID
# HAVING RECORDS > 0
# ORDER BY MONTH ASC, CAR_ID DESC
# ;

SELECT MONTH(START_DATE) AS MONTH, CAR_ID, COUNT(CAR_ID) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
# WHERE START_DATE LIKE '2022-08-%' OR START_DATE LIKE '2022-09-%' OR START_DATE LIKE '2022-10-%'
WHERE DATE_FORMAT(START_DATE, "%Y-%m") BETWEEN "2022-08" AND "2022-10"
    AND CAR_ID IN (
        SELECT CAR_ID FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
        WHERE DATE_FORMAT(START_DATE, "%Y-%m") BETWEEN "2022-08" AND "2022-10"
        GROUP BY CAR_ID
        HAVING COUNT(CAR_ID) >= 5 
        )
GROUP BY MONTH, CAR_ID
HAVING RECORDS > 0
ORDER BY MONTH ASC, CAR_ID DESC
;
-- 2022년 5월에 예약한 환자 수
-- 진료과코드 별로 조회
-- 컬럼명은 '진료과 코드', '5월예약건수'로 지정
-- 진료과별 예약한 환자 수를 기준으로 ASC => 진료과 코드를 기준으로 ASC
# SELECT MCDP_CD AS '진료과 코드', COUNT(APNT_NO) AS '5월예약건수'
# FROM APPOINTMENT 
# WHERE APNT_YMD LIKE '2022-05-%'
# GROUP BY MCDP_CD
# ORDER BY '5월예약건수' ASC, '진료과 코드' ASC
# ;
SELECT MCDP_CD AS "진료과코드", COUNT(MCDP_CD) AS "5월예약건수"
FROM APPOINTMENT
WHERE APNT_YMD LIKE '2022-05%'
GROUP BY MCDP_CD
ORDER BY COUNT(APNT_NO) ASC, MCDP_CD ASC 
;
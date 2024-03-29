-- 2022년 4월 13일 취소되지 않은 
-- 흉부외과(CS) 진료 예약 내역을 조회하는 SQL문
--  진료예약번호, 환자이름, 환자번호, 진료과코드, 의사이름, 진료예약일시
-- 진료예약일시 ASC 
SELECT A.APNT_NO, P.PT_NAME, P.PT_NO, D.MCDP_CD, D.DR_NAME, A.APNT_YMD
FROM APPOINTMENT AS A 
JOIN PATIENT AS P ON A.PT_NO = P.PT_NO
JOIN DOCTOR AS D ON A.MDDR_ID = D.DR_ID
WHERE A.APNT_YMD LIKE '%2022-04-13%'
    AND A.APNT_CNCL_YN = 'N'
    AND D.MCDP_CD = 'CS'
ORDER BY APNT_YMD ASC   

    
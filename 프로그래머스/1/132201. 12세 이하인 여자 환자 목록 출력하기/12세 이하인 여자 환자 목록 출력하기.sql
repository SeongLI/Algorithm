-- 12세 이하 / 여자환자
-- 환자이름, 환자번호, 성별코드, 나이, 전화번호 조회
-- 전화번호가 없는 경우, 'NONE'으로 출력
-- 나이 기준 DESC => 환자이름 기준 ASC
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IF(TLNO IS NULL, 'NONE', TLNO) AS TLNO
FROM PATIENT
WHERE AGE <= '12'
    AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME ASC
;

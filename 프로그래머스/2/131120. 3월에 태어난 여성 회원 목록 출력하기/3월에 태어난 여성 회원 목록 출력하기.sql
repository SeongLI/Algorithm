-- 생일이 3월인
-- 여성회원
-- ID. 이름. 성별, 생년월일 조회
-- 전화번호가 NULL인 경우 출력대상에서 제외
-- 회원 ID를 기준으로 오른차순 정렬

SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') FROM MEMBER_PROFILE 
WHERE GENDER = 'W' AND DATE_OF_BIRTH LIKE '%-03-%' AND TLNO IS NOT NULL
ORDER BY MEMBER_ID ASC

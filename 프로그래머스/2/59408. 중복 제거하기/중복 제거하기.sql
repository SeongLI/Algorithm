-- 동물의 이름은 몇 개인지 조회
-- 이름이 NULL인 경우는 집계하지 않는다
-- 중복되는 이름은 하나로 처리
SELECT COUNT(DISTINCT(NAME)) AS count
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
;
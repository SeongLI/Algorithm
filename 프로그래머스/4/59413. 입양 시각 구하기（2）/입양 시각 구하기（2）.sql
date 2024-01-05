-- 몇 시에 입양이 가장 활발하게 일어났는지
-- 0시부터 23시까지, 각 시간대 별로
-- 입양이 몇 건 발생했는지
-- 시간대 순으로 정렬

SET @HOUR := -1; # 변수선언

SELECT (@HOUR := @HOUR +1) AS HOUR,
(SELECT COUNT(*) FROM ANIMAL_OUTS WHERE HOUR(DATETIME) = @HOUR) AS COUNT 
FROM ANIMAL_OUTS
WHERE @HOUR < 23
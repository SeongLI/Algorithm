-- 음식종류별로 즐겨찾기수가 가장 많은 식당
-- 음식 종류, ID, 식당 이름, 즐겨찾기수 조회
-- 음식 종류 기준 DESC

# SELECT FOOD_TYPE, REST_ID, REST_NAME, MAX(FAVORITES) AS FAVORITES
# FROM REST_INFO
# GROUP BY FOOD_TYPE 
# ORDER BY FOOD_TYPE DESC
# ;
# 틀린 이유 => FOOD_TYPE으로 그룹화할 경우, 각 FOOD_TYPE 그룹 내에 여러 개의 REST_ID와 REST_NAME이 존재할 수 있다.

SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM REST_INFO
WHERE (FOOD_TYPE, FAVORITES) IN (
    SELECT FOOD_TYPE, MAX(FAVORITES) AS FAVORITES
    FROM REST_INFO
    GROUP BY FOOD_TYPE
)
ORDER BY FOOD_TYPE DESC
;
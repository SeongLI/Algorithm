-- REST_INFO : 식당 정보
-- REST_REVIEW : 식당 리뷰
-- 서울에 위치한 식당
-- 식당 ID, 식당 이름, 음식 종류, 즐겨찾기 수, 주소, 리뷰 평점
-- 평균점수는 소수점 세 번째 자리에서 반올림
-- 평균점수 기준으로 내림차순 => 즐겨찾기 수를 기준으로 내림차순
SELECT I.REST_ID, I.REST_NAME, I.FOOD_TYPE, I.FAVORITES, I.ADDRESS, ROUND(AVG(R.REVIEW_SCORE), 2) AS SCORE
FROM REST_INFO AS I JOIN REST_REVIEW AS R ON I.REST_ID = R.REST_ID
GROUP BY REST_NAME
HAVING I.ADDRESS LIKE "서울%"
ORDER BY SCORE DESC, FAVORITES DESC
;
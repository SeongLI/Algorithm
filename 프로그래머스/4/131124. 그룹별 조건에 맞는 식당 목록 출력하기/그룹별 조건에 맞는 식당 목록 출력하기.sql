-- 리뷰를 가장 많이 작성한 회원
-- 의 리뷰들을 조회
-- 회원 이름, 리뷰 텍스트, 리뷰 작성일
-- 리뷰 작성일 ASC, 리뷰 텍스트 ASC

-- 값 저장 3가지 방법 !!!
# SELECT MEMBER_ID INTO @TEMP_SAVE
# FROM REST_REVIEW
# GROUP BY MEMBER_ID
# ORDER BY COUNT(*) DESC 
# LIMIT 1;

# SELECT @TEMP_SAVE := MEMBER_ID
# FROM REST_REVIEW
# GROUP BY MEMBER_ID
# ORDER BY COUNT(*) DESC
# LIMIT 1;

SET @TEMP_SAVE = (
  SELECT MEMBER_ID
  FROM REST_REVIEW
  GROUP BY MEMBER_ID
  ORDER BY COUNT(*) DESC
  LIMIT 1
);

SELECT MEMBER_NAME, REVIEW_TEXT, DATE_FORMAT(REVIEW_DATE, "%Y-%m-%d") AS REVIEW_DATE
FROM MEMBER_PROFILE AS P JOIN REST_REVIEW AS R
ON P.MEMBER_ID = R.MEMBER_ID
WHERE P.MEMBER_ID = @TEMP_SAVE
ORDER BY REVIEW_DATE ASC, REVIEW_TEXT ASC
;

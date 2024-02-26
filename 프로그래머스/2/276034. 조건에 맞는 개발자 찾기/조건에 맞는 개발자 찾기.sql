-- Python이나 C# 스킬을 가진 개발자의 정보를 조회
-- 개발자 ID, 이메일, 이름, 성 조회
-- 개발자 ID 기준 ASC

# SET @Python = (SELECT CODE FROM SKILLCODES WHERE NAME = 'Python');
# SET @C = (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#');
-- 실패 (1064, "You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'SET @C_S = (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#');\n\nSELECT ID, EMAIL, F' at line 6")

SELECT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS
WHERE SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'Python') != 0
   OR SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#') != 0
ORDER BY ID ASC;

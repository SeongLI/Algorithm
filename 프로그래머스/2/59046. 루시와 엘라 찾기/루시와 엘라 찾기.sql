-- 동물 중 이름이 Lucy, Ella, Pickle, Rogan, Sabrina, Mitty 인 동물의
-- 아이디와 이름, 성별, 중성화 여부를 조회
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE FROM ANIMAL_INS
WHERE NAME = 'Lucy' OR
NAME = 'Ella' OR 
NAME = 'Pickle' OR
NAME = 'Rogan' OR
NAME = 'Sabrina' OR
NAME = 'Mitty'


-- 코드를 입력하세요
SELECT ANIMAL_ID,
       NAME
FROM ANIMAL_OUTS A
WHERE NOT EXISTS (SELECT ANIMAL_ID FROM ANIMAL_INS WHERE A.ANIMAL_ID = ANIMAL_ID)
ORDER BY ANIMAL_ID
# -- 코드를 입력하세요
SELECT A.NAME,
    A.DATETIME
FROM ANIMAL_INS A
WHERE NOT EXISTS (SELECT ANIMAL_ID FROM ANIMAL_OUTS WHERE A.ANIMAL_ID = ANIMAL_ID)
AND A.NAME IS NOT NULL
ORDER BY A.DATETIME  LIMIT 3

# SELECT * FROM ANIMAL_INS
# WHERE NAME IN ('Shelly','Jackie','Benji','Rogan')
# ORDER BY DATETIME



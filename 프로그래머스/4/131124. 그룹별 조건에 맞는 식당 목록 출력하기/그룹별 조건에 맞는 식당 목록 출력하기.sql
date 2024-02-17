-- 코드를 입력하세요
SELECT A.MEMBER_NAME,
       B.REVIEW_TEXT,
       DATE_FORMAT(B.REVIEW_DATE,'%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE A
JOIN REST_REVIEW B ON A.MEMBER_ID = B.MEMBER_ID
WHERE A.MEMBER_ID IN ( SELECT MEMBER_ID
                         FROM ( SELECT MEMBER_ID,COUNT(*) AS TOTAL
                                FROM REST_REVIEW 
                                GROUP BY MEMBER_ID ) A
                                WHERE A.TOTAL = (SELECT COUNT(*) 
                                                 FROM REST_REVIEW 
                                                 GROUP BY MEMBER_ID 
                                                 ORDER BY COUNT(*) DESC LIMIT 1))
GROUP BY A.MEMBER_ID, B.REVIEW_TEXT
ORDER BY B.REVIEW_DATE, B.REVIEW_TEXT
 
-- 코드를 작성해주세요
SELECT CONCAT(MAX(IFNULL(LENGTH,10)), 'cm') as MAX_LENGTH
FROM fish_info
-- https://school.programmers.co.kr/learn/courses/30/lessons/157343
-- CAR_RENTAL_COMPANY_CAR 테이블에서 '네비게이션' 옵션이 포함된 자동차 리스트를 출력하는 SQL문을 작성해주세요. 
-- 결과는 자동차 ID를 기준으로 내림차순 정렬해주세요.

SELECT 
*
from
CAR_RENTAL_COMPANY_CAR
where OPTIONS like "%네비게이션%"
order by CAR_ID desc;
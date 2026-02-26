-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, ifnull(TLNO,'NONE') as TLNO
from PATIENT
where GEND_CD = 'W' and AGE <= 12
order by age desc, PT_NAME
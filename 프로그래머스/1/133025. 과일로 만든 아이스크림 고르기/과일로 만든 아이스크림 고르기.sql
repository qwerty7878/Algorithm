-- 코드를 입력하세요
SELECT ii.FLAVOR
from ICECREAM_INFO ii
join FIRST_HALF fh on ii.flavor = fh.flavor
where ii.INGREDIENT_TYPE = 'fruit_based' and fh.TOTAL_ORDER > 3000
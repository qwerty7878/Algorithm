-- 코드를 입력하세요
SELECT ub.TITLE,
        ur.BOARD_ID,
        ur.REPLY_ID,
        ur.WRITER_ID,
        ur.CONTENTS,
        date_format(ur.CREATED_DATE, '%Y-%m-%d') as CREATED_DATE
from USED_GOODS_REPLY ur
join USED_GOODS_BOARD ub
    on ur.BOARD_ID = ub.BOARD_ID
where ub.CREATED_DATE >= '2022-10-01' and ub.CREATED_DATE < '2022-11-01'
order by ur.CREATED_DATE, ub.TITLE 
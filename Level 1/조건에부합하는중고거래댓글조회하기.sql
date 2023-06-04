select title, a.board_id, reply_id, b.writer_id, b.contents,
    to_char(b.created_date,'YYYY-MM-DD')
from used_goods_board a, used_goods_reply b
where a.board_id=b.board_id
and extract(year from a.created_date)=2022
and extract(month from a.created_date)=10
order by b.created_date, title;

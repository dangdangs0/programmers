select user_id, nickname, sum(price) as total_sales
from used_goods_board a, used_goods_user b
where status='DONE'
and a.writer_id=b.user_id
group by user_id, nickname
having sum(price)>=700000
order by total_sales;

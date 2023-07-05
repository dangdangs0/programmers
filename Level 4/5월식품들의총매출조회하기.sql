select b.product_id, b.product_name, price*amount as total_sales
from (select product_id,sum(amount) as amount
     from food_order
      where to_char(produce_date,'YYYY-MM')='2022-05'
     group by product_id) a, food_product b
where a.product_id=b.product_id
order by total_sales desc, product_id;

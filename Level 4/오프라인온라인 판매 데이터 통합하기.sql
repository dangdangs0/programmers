(select to_char(sales_date,'YYYY-MM-DD') sales_date,product_id,user_id,sales_amount
from online_sale o
where to_char(o.sales_date,'YYYY-MM')='2022-03')
union
(select to_char(sales_date,'YYYY-MM-DD') sales_date, product_id,null,sales_amount
from offline_sale f
where to_char(f.sales_date,'YYYY-MM')='2022-03')
order by sales_date, product_id,user_id;

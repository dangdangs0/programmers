select product_code,sum(sales_amount*price) as 매출액
from product, offline_sale
where product.product_id=offline_sale.product_id
group by product_code
order by 매출액 desc, product_code;

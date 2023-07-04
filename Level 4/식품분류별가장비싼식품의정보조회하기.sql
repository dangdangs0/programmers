select category, price as max_price, product_name
from food_product
where category in ('과자','국','김치','식용유')
and price in (select max(price) over (partition by category)
            from food_product)
order by price desc;

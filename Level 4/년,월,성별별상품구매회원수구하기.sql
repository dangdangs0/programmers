select extract(year from sales_date) year, 
    extract(month from sales_date) month,
    gender, count(distinct a.user_id) users
from user_info a inner join online_sale b
on a.user_id=b.user_id
where gender is not null
group by extract(year from sales_date),extract(month from sales_date), gender
order by year, month, gender;

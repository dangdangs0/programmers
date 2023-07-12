select extract(year from sales_date) year,extract(month from sales_date) month,
    count(distinct b.user_id) puchased_users,
    round(count(distinct b.user_id)/total,1) puchased_ratio
from user_info a,(select count(*) total
                 from user_info
                 where extract(year from joined)=2021),online_sale b
where a.user_id=b.user_id
and extract(year from a.joined)=2021
group by extract(year from sales_date),extract(month from sales_date), total
order by year,month;

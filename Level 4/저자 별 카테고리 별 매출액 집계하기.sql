select a.author_id, b.author_name, category ,sum(sales*price) total_sales
from (select book_id,category,author_id,sum(price) as price
     from book
     group by book_id,category,author_id) a,
     author b, (select book_id, sum(sales) as sales
                from book_sales
                where to_char(sales_date,'YYYY-MM')='2022-01'
                group by book_id) c
where a.author_id=b.author_id
and a.book_id=c.book_id
group by a.author_id,b.author_name,category
order by a.author_id, category desc;

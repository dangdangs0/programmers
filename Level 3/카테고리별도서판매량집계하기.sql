select category, sum(sales) as total_sales
from book, book_sales
where book.book_id=book_sales.book_id
and extract(year from sales_date)=2022
and extract(month from sales_date)=1
group by category
order by category;

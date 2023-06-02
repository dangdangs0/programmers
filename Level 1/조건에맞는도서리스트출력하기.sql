select book_id, to_char(published_date,'YYYY-MM-DD') published_date
from book
where substr(to_char(published_date,'YYYY-MM-DD'),1,4)='2021'
and category='인문'
order by published_date;

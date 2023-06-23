select book_id, author_name, to_char(published_date,'YYYY-MM-DD') as published_date
from book,author
where book.author_id=author.author_id
and category='경제'
order by published_date;

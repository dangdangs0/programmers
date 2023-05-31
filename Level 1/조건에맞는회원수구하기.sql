select count(*) as USERS
from user_info
where (age between 20 and 29)
and substr(to_char(joined,'YYYY-MM-DD'),1,4)='2021';

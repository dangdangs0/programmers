select to_number(to_char(datetime,'hh24')) hour, count(*) as count
from animal_outs
group by to_number(to_char(datetime,'hh24'))
having to_number(to_char(datetime,'hh24'))>=9 and
to_number(to_char(datetime,'hh24'))<=19
order by to_number(to_char(datetime,'hh24'));

select l,nvl(count,0) count
from (select to_number(to_char(datetime,'HH24')) hour, count(*) count
    from animal_outs
    group by to_char(datetime,'HH24')) a
     right outer join (select level-1 l from dual connect by level<=24) b
    on hour=l
order by l;

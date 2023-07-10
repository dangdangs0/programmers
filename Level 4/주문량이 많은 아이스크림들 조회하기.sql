select flavor
from (select f.flavor, f.total_order+j.total_order sum
     from first_half f, (select flavor,sum(total_order) as total_order
                        from july
                        group by flavor) j
      where f.flavor=j.flavor
     order by sum desc)
where rownum<=3;


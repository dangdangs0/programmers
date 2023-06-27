select name, datetime
from (select name, datetime
      from animal_ins
      where animal_id not in (select a.animal_id
                 from animal_outs a)
    order by datetime)
where rownum<=3;

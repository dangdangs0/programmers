select animal_id, name
from (select a.animal_id, a.name, b.datetime-a.datetime as 보호기간
     from animal_ins a inner join animal_outs b
     on a.animal_id=b.animal_id
     order by b.datetime-a.datetime desc)
where rownum<=2
order by 보호기간 desc;

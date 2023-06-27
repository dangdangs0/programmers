select a.animal_id, b.name
from animal_ins a inner join animal_outs b
on a.animal_id=b.animal_id
where b.datetime<a.datetime
order by a.datetime;

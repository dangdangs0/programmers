select a.animal_id, a.animal_type, a.name
from animal_ins a inner join animal_outs b
on a.animal_id=b.animal_id
where lower(a.sex_upon_intake) like '%intact%'
and (lower(b.sex_upon_outcome) like '%spayed%' or lower(b.sex_upon_outcome) like '%neutered%')
order by animal_id;

select animal_type, nvl(name,'No name') as name, sex_upon_intake
from animal_ins
order by animal_id;

select animal_id, name, sex_upon_intake
from animal_ins
where lower(name) in ('lucy','ella','pickle','rogan','sabrina','mitty')
order by animal_id;

select name, count(name) as count
from animal_ins
group by name
having count(name)>=2
order by name;

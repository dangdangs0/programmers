select food_type, rest_id, rest_name, favorites
from (select rest_id, food_type, rest_name,favorites,
        max(favorites) over(partition by food_type) as max
      from rest_info)
where favorites=max
order by food_type desc;

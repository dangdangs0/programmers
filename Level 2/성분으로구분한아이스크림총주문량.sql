select ingredient_type, sum(total_order) as total_order
from icecream_info, first_half
where first_half.flavor=icecream_info.flavor
group by ingredient_type
order by total_order;

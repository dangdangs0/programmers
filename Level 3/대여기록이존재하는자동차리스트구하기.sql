select a.car_id
from CAR_RENTAL_COMPANY_CAR a, CAR_RENTAL_COMPANY_RENTAL_HISTORY b
where car_type='세단'
and a.car_id=b.car_id
and extract(month from start_date)=10
group by a.car_id
order by a.car_id desc;

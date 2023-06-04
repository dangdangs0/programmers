select history_id, car_id,
    to_char(start_date,'YYYY-MM-DD'), to_char(end_date,'YYYY-MM-DD'),
    case when end_date-start_date+1>=30 then '장기 대여'
    else '단기 대여'
    end rent_type
from car_rental_company_rental_history
where extract(year from start_date)=2022
and extract(month from start_date)=9
order by history_id desc;

select car_id, max(availability)
from (select history_id, car_id,
      case when
      to_char(start_date,'YYYY-MM-DD')<='2022-10-16' and
      to_char(end_date,'YYYY-MM-DD')>='2022-10-16' then '대여중'
    else '대여 가능' end as availability
    from car_rental_company_rental_history)
group by car_id
order by car_id desc;

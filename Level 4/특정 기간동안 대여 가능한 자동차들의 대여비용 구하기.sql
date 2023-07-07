select a.car_id, a.car_type,daily_fee*30*(100-discount_rate)/100 fee
from car_rental_company_car a left outer join
    (select car_id, max(start_date) start_date,max(end_date) end_date
     from car_rental_company_rental_history
    group by car_id) b
on a.car_id=b.car_id
left outer join car_rental_company_discount_plan c
on a.car_type=c.car_type
where (a.car_type='세단' 
or a.car_type='SUV')
and ((to_char(start_date,'YYYY-MM-DD')<'2022-11-01' and
    to_char(end_date,'YYYY-MM-DD')<'2022-11-01' )
     or (to_char(start_date,'YYYY-MM-DD')>'2022-11-30' and
         to_char(end_date,'YYYY-MM-DD')>'2022-11-30' )or
     start_date is null) --null이면 아예 대여 기록이 없으므로
and (duration_type='30일 이상' and 
        daily_fee*30*(100-discount_rate)/100>=500000
        and daily_fee*30*(100-discount_rate)/100<2000000)
order by fee desc, car_type,car_id desc;
     

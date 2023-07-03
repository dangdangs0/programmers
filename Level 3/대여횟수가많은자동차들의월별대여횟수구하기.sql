select extract(month from start_date) month, car_id, count(*) records
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where car_id in (select car_id
        from CAR_RENTAL_COMPANY_RENTAL_HISTORY
        where to_char(start_date,'YYYY-MM-DD') between '2022-08-01' and '2022-10-31'
        group by car_id
        having count(*)>=5)
and to_char(start_date,'YYYY-MM-DD') between '2022-08-01' and '2022-10-31'
group by extract(month from start_date), car_id
having count(*)>=1
order by month, car_id desc;

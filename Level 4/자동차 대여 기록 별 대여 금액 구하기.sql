select history_id,
    case when (end_date-start_date+1)>=90
        then (select (100-discount_rate)/100 from CAR_RENTAL_COMPANY_DISCOUNT_PLAN where duration_type='90일 이상' and car_type='트럭')*daily_fee*(end_date-start_date+1)
        when (end_date-start_date+1)>=30
        then (select (100-discount_rate)/100 from CAR_RENTAL_COMPANY_DISCOUNT_PLAN where duration_type='30일 이상' and car_type='트럭')*daily_fee*(end_date-start_date+1)
        when (end_date-start_date+1)>=7
        then (select (100-discount_rate)/100 from CAR_RENTAL_COMPANY_DISCOUNT_PLAN where duration_type='7일 이상' and car_type='트럭')*daily_fee*(end_date-start_date+1)
        else daily_fee*(end_date-start_date+1)
        end fee
from CAR_RENTAL_COMPANY_CAR a, CAR_RENTAL_COMPANY_RENTAL_HISTORY b
where a.car_id=b.car_id
and car_type='트럭'
order by fee desc, history_id desc;

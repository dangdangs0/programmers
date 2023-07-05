select a.rest_id, rest_name, food_type, favorites, address, score
from rest_info a, (select rest_id, round(avg(review_score),2) as score
                  from rest_review
                   group by rest_id
                  ) b
where substr(address,1,2)='서울'
and a.rest_id=b.rest_id
order by score desc, favorites desc;

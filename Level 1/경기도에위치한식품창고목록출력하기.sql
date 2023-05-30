select warehouse_id, warehouse_name, address, nvl(freezer_yn,'N') freezer_yn
from food_warehouse
where substr(address,0,3)='경기도'
order by warehouse_id;

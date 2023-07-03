select '/home/grep/src/'||a.board_id||'/'||file_id||file_name||file_ext file_path
from used_goods_file b, used_goods_board a
where views=(select max(views)
            from used_goods_board)
and a.board_id=b.board_id
order by file_id desc;

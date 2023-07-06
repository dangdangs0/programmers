select c.apnt_no, a.pt_name, a.pt_no, b.mcdp_cd, dr_name, apnt_ymd
from patient a, doctor b, appointment c
where apnt_cncl_yn = 'N'
and b.mcdp_cd='CS'
and a.pt_no=c.pt_no
and b.dr_id=mddr_id
and to_char(apnt_ymd,'YYYY-MM-DD')='2022-04-13'
order by apnt_ymd;

# Write your MySQL query statement below
select distinct Num from
(select Num,@currtimes:=@currtimes*If(@currNum=Num,1,0)+1 as cnt,@currNum:=Num
from Logs,(select @currtimes:=0) r,(select @currNum:=null) p) temp
where cnt >= 3 


select l.lid,
       l.lname,
       c.cname,
       c.cid
from lands l
inner join categories c
on c.cid = l.cid
order by l.lid desc
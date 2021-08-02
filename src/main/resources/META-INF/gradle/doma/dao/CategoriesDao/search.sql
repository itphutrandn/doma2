SELECT * FROM categories c
WHERE c.cid > /* cat.cid */1
AND c.cname LIKE  /*@infix(cat.cname)*/'%abc%'
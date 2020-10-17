SELECT * FROM cinema
WHERE NOT description LIKE '%boring%' AND
id %2 =1
ORDER BY rating DESC;
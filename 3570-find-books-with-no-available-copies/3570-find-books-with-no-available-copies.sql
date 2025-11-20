# Write your MySQL query statement below
select L.book_id ,L.title , L.author , L.genre , L.publication_year ,  COUNT(b.record_id) AS current_borrowers 
from borrowing_records b inner join library_books L using (book_id) 
where return_date IS NULL 
Group by L.book_id ,L.title , L.author , L.genre , L.publication_year , L.total_copies
HAVING L.total_copies - COUNT(b.record_id) = 0
order by  current_borrowers desc , L.title asc ;



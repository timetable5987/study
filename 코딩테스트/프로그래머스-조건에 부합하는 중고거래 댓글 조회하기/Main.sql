-- https://school.programmers.co.kr/learn/courses/30/lessons/164673?language=mysql

-- 2022년 10월에 작성된 게시글 제목, 게시글 ID, 댓글 ID, 댓글 작성자 ID, 댓글 내용, 댓글 작성일을 조회하는 SQL문을 작성해주세요
select
    board.TITLE, board.BOARD_ID, 
    reply.REPLY_ID, reply.WRITER_ID, 
    reply.CONTENTS, DATE_FORMAT(reply.CREATED_DATE, '%Y-%m-%d')   as CREATED_DATE
from
    USED_GOODS_BOARD as board, USED_GOODS_REPLY as reply
where
    board.BOARD_ID = reply.BOARD_ID
and
    board.CREATED_DATE like "2022-10%"
order by
reply.CREATED_DATE ASC, board.TITLE ASC;
public class Database {

    //데이터베이스

    // DDL : 데이터 정의어 create, alter, drop, delete (명령어가 처리되자마자 커밋된다)
    // DML : 데이터 조작어 select, insert, update (커밋이라는 명령어를 쳐야지만 커밋된다, 그래서 롤백 가능)
    // DCL : 데이터 제어어 grant, revoke (데이터 사용 권한)

    // ex) select bookname, publisher (찾고자 하는 필드 먼저)
    // from Book (사용하는 테이블)
    // where price >= 10000; (조건)

    // as : 추출한 결과 값의 속성 이름을 바꾼다.
    // group by: ~별로
    // ex) select custid, count(*) as 총수량, sum(saleprice) as 총판매액
    // form Orders
    // group by custid;

    //insert into value
    //update


}

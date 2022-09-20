public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>(); // 왜 클래스 이름(setdemo)로 안하고 hashset으로 만들어도 만들어짐??
        A.add(1);
        A.add(2);
        A.add(3);

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(3);
        C.add(4);
        C.add(5);

        System.out.println(A.containsAll(B)); // A 안에 B의 인자가 전부 다 들어있는지?
        System.out.println(A.containsAll(C)); // A 안에 C의 인자가 전부 다 들어있는지?

        Iterator hi = A.iteraor(); //iterator라는 데이터타입의 hi라는 객체 생성 ??
        while (hi.hasNext()) { // hi라는 이터레이터 안에 값이 있으므로, hasnext 가 true가 됨.
            System.out.println(hi.next()); // hi.next() -> hi에 들어가는 값 중 하나를 리턴해준다. (이터레이터 안의 값은 리턴되고 사라지지만, 진짜 A라는 집합에는 남아있음)

        } //iterator -> collection 프레임워크 모든 곳에서 쓸 수 있는 메소드.

//        A.addAll(B); A에 B의 원소 전체를 넣는다. (합집합)
//        A.retainAll(B); A에도 있고, B에도 있는 값들만 A에 넣는다. (교집합) (교집합에 해당하는 값만 남고, 원래 A에 있던 값들도 다 사라짐)
//        A.removeAll(B); A에서 B를 뺀다. (차집합)

        //arraylist는 중복 허용, 순서 상관 있이 다 넣을 수 있음
        //set은 집합과 같은 것, 중복 불가능, 순서 상관없음.
    }
}

// hashset, arraylist = 클래스
// collection 인터페이스 -> set과 list 인터페이스를 상속 -> 각각의 실재하는 클래스를 상속 한다.
// set과 컬렉션 인터페이스는 완전히 동일한 api를 제공한다.
// 단, list 인터페이스는 컬렉션 인터페이스와 다르게 따로 제공하는 게 많음.
// 셋은 집합이기 때문에 순서가 필요 없으므로 리스트처럼 순서를 통해 인덱스 번호를 부여하는 등의 (list.get(1)) api는 가지고 있을 필요가 없다.
// https://www.youtube.com/watch?v=rHPaEJmfa98
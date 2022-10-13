public interface Flyable {
    public void fly();
    class Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("<새>가 날아갑니다!");

        }
        /* 1. fly() 메소드를 오버라이딩 하세요. */
    }

    class Helicopter implements Flyable {
        @Override
        public void fly() {
            System.out.println("<헬리콥터>가 날아갑니다!");
        }
        /* 2. fly() 메소드를 오버라이딩 하세요. */
    }

    class Rocket implements Flyable {
        @Override
        public void fly() {
            System.out.println("<로켓>이 날아갑니다!");
        }
        /* 3. fly() 메소드를 오버라이딩 하세요. */
    }
}

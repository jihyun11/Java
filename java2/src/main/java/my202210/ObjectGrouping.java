package my202210;

public class ObjectGrouping {
    public static void main(String[] args) {

        Flyable.Bird bird = new Flyable.Bird();
        Flyable.Helicopter copter = new Flyable.Helicopter();
        Flyable.Rocket rocket = new Flyable.Rocket();

        // 인터페이스 타입으로 그룹화
        Flyable[] flyableThings = { bird, copter, rocket };

        // 모든 날것들을 날림
        for (int i = 0; i < flyableThings.length; i++) {
            Flyable temp = flyableThings[i];
            temp.fly();
        }
    }
}

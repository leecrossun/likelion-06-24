public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();

        c1.maxSpeed = 10;
        c2.maxSpeed = 20;

        c1.run();
        c2.run();
    }
}
class Car {
    int maxSpeed;
    public void run(){
        System.out.println("자동차가 최고속력 " + this.maxSpeed + "로 달립니다.");
    }
}

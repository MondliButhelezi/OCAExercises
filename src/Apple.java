import food.Fruit;

public class Apple extends Fruit {

    @Override
    public void price() {
        System.out.print("It is a fruit");
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.price();
    }
}

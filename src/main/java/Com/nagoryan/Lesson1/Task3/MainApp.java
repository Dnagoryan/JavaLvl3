package Com.nagoryan.Lesson1.Task3;

public class MainApp {
    public static void main(String[] args) {
    Box<Apple> appleBox=new Box<>();
    Box<Apple> appleAnotherBox=new Box<>();
    Box<Orange> orangeBox=new Box<>();
    Box<Orange> orangeAnotherBox=new Box<>();

    System.out.println("Накидаем фруктов:");
    appleBox.addFruit(new Apple(),15, "appleBox");
    appleAnotherBox.addFruit(new Apple(),10,"appleAnotherBox");
    orangeBox.addFruit(new Orange(),5,"orangeBox");
    orangeAnotherBox.addFruit(new Orange(),10, "orangeAnotherBox");

    System.out.println("\nСравним коробки:");
    appleBox.compare(orangeAnotherBox,"appleBox","orangeAnotherBox");
    appleAnotherBox.compare(orangeBox,"appleAnotherBox","orangeBox");

    System.out.println("\nСвалим в кучу:");
    appleAnotherBox.pourItOver(appleBox,"appleAnotherBox","appleBox");
    orangeAnotherBox.pourItOver(orangeBox,"orangeAnotherBox","orangeBox");

    }
}

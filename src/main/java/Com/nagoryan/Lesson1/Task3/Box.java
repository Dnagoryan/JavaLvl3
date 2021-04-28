package Com.nagoryan.Lesson1.Task3;

import java.util.ArrayList;


public class Box <A extends Fruit> {

    private ArrayList<A> box=new ArrayList<>();

    public Box() {
    }
    public float getWeight(){
    float weight=0.0f;
    for (A obj: box){
        weight+=obj.getWeight();
        }return weight;
    }

    public boolean compare (Box anotherBox , String nameBox, String nameAnotherBox){
        if (getWeight()==anotherBox.getWeight()) {
            System.out.println("Объем коробки->"+ nameBox+" и объем коробки->"+nameAnotherBox+ " ОДИНАКОВЫй");
            return true;
        }
        System.out.println("Объем коробки->"+ nameBox+" и объем коробки->"+nameAnotherBox+ " РАЗНЫЙ");
        return false;
    }

    public void addFruit (A fruit, int amount,String nameBox){
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
        System.out.println("В коробке "+nameBox+" занятый объем->"+getWeight());

    }
    public void pourItOver (Box<A> anotherBox, String nameBox, String nameAnotherBox){
        anotherBox.box.addAll(box);
        box.clear();
        System.out.println("В коробке "+nameAnotherBox+ " занятый объем->"+anotherBox.getWeight());
        System.out.println("В коробке "+nameBox+ " занятый объем->"+getWeight());
    }
}

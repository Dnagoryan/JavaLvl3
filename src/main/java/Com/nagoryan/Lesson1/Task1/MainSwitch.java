package Com.nagoryan.Lesson1.Task1;


import java.util.ArrayList;
import java.util.Arrays;


public class MainSwitch {
    private static int iArray, jArray;

    public static void main(String[] args) {
        String[] arrays = {"1", "2", "3", "4", "5"};
        iArray = 2;
        jArray = 3;
        switchArray(arrays, iArray, jArray);
        System.out.println("ArrayList: "+switchList(arrays));
    }

    public static <A> void switchArray(A[] arrays, int iArray, int jArray) {
        try {
            A saveCell = arrays[iArray];
            arrays[iArray] = arrays[jArray];
            arrays[jArray] = saveCell;
            System.out.println(Arrays.toString(arrays));
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

    }

    public static <A> ArrayList<A> switchList(A[] array){
        ArrayList<A> aArrayList= new ArrayList<>(Arrays.asList(array));
       return aArrayList;
    }
}


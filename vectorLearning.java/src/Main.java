import java.util.Vector;

public class Main {
    public static void main(String[] args) {
    int[] age = {10,20,30};
        Vector <Integer>age2 = new Vector<Integer>(5,5);
        age2.add(10);
        age2.add(20);
        age2.add(30);
        age2.add(40);
        age2.add(50);


        //System.out.println(age);
        System.out.println(age2.capacity());
    }
}
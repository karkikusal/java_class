public class Main {
    public static void main(String[] args) {

     int[] x = new int[3];
     int[] y = {10,20,30};
     

     y[0] = 500;

     for(int element : y){
         System.out.println(element);
     }

        System.out.println(y[0]);
    }
}
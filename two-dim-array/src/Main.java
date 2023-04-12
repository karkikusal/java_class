public class Main {
    public static void main(String[] args) {
        int[] x ={20,30,50,75,87};
        int[][] y = {{20,30,50},
                {30,40,50,99},
                {50,60,70,}};
        //System.out.println(x[2]);

       // System.out.println(y[0][1]);

//        for(int i = 0;i<x.length;i++){
//            System.out.println(x[i]);
//        }

        for(int i = 0;i<y.length;i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.println(y[i][j]);
            }
        }
    }
}
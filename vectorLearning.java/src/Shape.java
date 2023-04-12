public class Shape {
//    public int width =110;
//   public  int height =20;

    public int width;
    public  int height;

    //Default constructor.

    Shape(){
        width = 10;
        width = 20;
    }
   //paramertized Constructor
   Shape(int w, int h) {
       width = w;
       height = h;
   }

    public void area(){
        System.out.println("Hello area");
        System.out.println("Hello area:" +(width*height));

    }



}

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = new  String(  "Hello" );

        System.out.println(str.equals(str2));

        //stringbuffer [Mutable]
        StringBuffer name = new StringBuffer("kusal");
        name.append("karki"); // this modify stringbuffer

        System.out.println(name);
    }
}

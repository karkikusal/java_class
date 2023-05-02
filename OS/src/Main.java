import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("kusal.txt");
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
        person person = new person();
        objectOutputStream.writeObject(person);

//object deserelize

        FileInputStream fileInputStream = new FileInputStream("kusal.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        person p2 =  (person) objectInputStream.readObject();
        p2.displayName();
    }
}
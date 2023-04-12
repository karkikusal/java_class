import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("kusal.txt");
        try{
            file.createNewFile();
            System.out.println("New File created..");
        } catch (IOException e) {
            System.out.println("File cannot be created..");
            throw new RuntimeException(e);
        }

        // write inside file
        try{
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(" this is a test\n");
            fileWriter.write("this is a test\n");
            fileWriter.write("this is a test\n");
            fileWriter.close();
            System.out.println("success on writing to files");
        } catch(IOException e){
            throw new RuntimeException(e);
        }


        try{

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while(line != null) {
                System.out.println(line);
                line = bufferedReader.readline();
            }

        }
        catch(FileNotFoundException e) {
            throw new RuntimeException(e);

        }
        //reading from the file
//        try{
//            FileReader fileReader = new FileReader(file);
//            int c= fileReader.read();
//            while(c!=-1) {
//                System.out.print((char)c);
//                c= fileReader.read();
//            }
        catch (IOException e){
            throw new IOException(e);
        }

    }
}
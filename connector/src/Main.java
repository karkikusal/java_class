import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url ="jdbc:mysql://localhost:4306/data";
        Connection conn = DriverManager.getConnection(url,"root","");
        System.out.println("connection success");



        // fetch data from the database;
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from final");
        System.out.println(resultSet);


        while(resultSet.next()){
            System.out.println(resultSet.getInt("id") + "");
            System.out.println(resultSet.getString("Name"));
            System.out.println("");

            System.out.println(resultSet.getString("address"));
            System.out.println(resultSet.getString("phone"));
            System.out.println("\n");
        }

    }
}
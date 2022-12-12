
package jdbc;

import java.util.Scanner;
import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws SQLException {
        Scanner input = new Scanner(System.in);
        Connection con = DriverManager.getConnection("jdbc:ucanaccess://G:\\DatabaseN.accdb");
        System.out.println("Connection successfully");
        int k;
        while(true){
            
            System.out.println("1 for insert");
            System.out.println("2 for delete");
            System.out.println("3 for update");
            System.out.println("4 for show data");
            System.out.println("5 for exit");
            System.out.print("Enter your choice :");
            k = input.nextInt();
            if(k==1){
                String name,id;
                int age;
                System.out.print("Enter Name : ");
                name =  input.next();
                System.out.print("Enter Id : ");
                id = input.next();
                System.out.print("Enter Age : ");
                age = input.nextInt(); 
                PreparedStatement insert = con.prepareStatement("INSERT INTO Student (Name,Id,Age) VALUES(?,?,?)");
                insert.setString(1, name);
                insert.setString(2, id);
                insert.setInt(3, age);
                insert.execute();
            
                 System.out.println("Inserted Successfully");
                
            }
            else if(k==2){
                String name;
                System.out.print("Enter Name : ");
                name =  input.next();
                PreparedStatement delete = con.prepareStatement("DELETE FROM Student WHERE Name = '"+name+"'");
                delete.execute();
                System.out.println("Delete Successfully");
                
            }
            else if(k==3){
                String name,id;
                System.out.print("Enter Name : ");
                name =  input.next();
                System.out.print("Enter New Id : ");
                id = input.next();
                PreparedStatement update = con.prepareStatement("UPDATE Student SET Id = ? WHERE Name = ?");
                update.setString(2, name);
                update.setString(1, id);
                update.execute();
            
                System.out.println("Update Successfully");
            }
            else if(k==4){
                PreparedStatement show = con.prepareStatement("SELECT * FROM Student");
                ResultSet resultSet = show.executeQuery();
            
                while(resultSet.next()){
                    System.out.println("Name : "+resultSet.getString("Name"));
                    System.out.println("Id : "+resultSet.getString("Id"));
                    System.out.println("Age : "+resultSet.getInt("Age"));
                    System.out.println("-----------------------");
                }
            }
            else{
                break;
            }
            System.out.println("------------------------");
        }
    }
}
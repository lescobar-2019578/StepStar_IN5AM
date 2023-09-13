package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
   Connection conexion;
   
   public Connection Conexion(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
<<<<<<< HEAD
           conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBStepStarIN5AM?useSSL=false", "kinal", "admin");
=======
           conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBStepStarIN5AM?useSSL=false", "admin", "root");
>>>>>>> origin/dzabala-2019001
       }catch(Exception e){
           e.printStackTrace();
       }
       
       return conexion;
   }
}
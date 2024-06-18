package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//连接数据库&加载jdbc驱动
public class DBUtil {
    private static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    public static Connection getConnection(){
        Connection dbConnection = null;
        try{
            Class.forName(jdbcDriver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentManagementSystem","root","tt123123");
            //System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dbConnection;
    }
}
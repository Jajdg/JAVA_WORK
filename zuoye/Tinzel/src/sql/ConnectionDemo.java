package sql;
import java.sql.*;

public class ConnectionDemo {
	static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static void main(String[] args){
		try {
			Class.forName(driver);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}
}

package sql;
import java.sql.*;

public class Demo3 {
	//SQL Server JDBC 连接驱动名称
	private static final String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	//SQL Server 数据库URL地址
	private static final String url="jdbc:sqlserver://127.0.0.1:143;DataBaseName=Tinzel";
	private static void main(String[] args){
		Connection con = null ;
		Statement stat = null ;
		try {
			Class.forName(driver);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

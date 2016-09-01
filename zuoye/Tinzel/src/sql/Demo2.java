package sql;
import java.sql.*;

public class Demo2 {
	private static final String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	//数据库连接地址
	private static final String url="jdbc:sqlserver://127.0.0.1:143;DataBaseName=Tinzel";
	public static void main(String[] args){
		Connection con=null;//声明连接对象
		try {
			Class.forName(driver);//加载数据驱动
			//创建数据库连接对象，“sa”为sqlserver数据库用户，“ccliu”为密码
			con=DriverManager.getConnection(url, "sa", "ccliu");
			System.out.println(con);//打印Connection对象
			con.close();//数据库使用完毕之后，一般关闭连接，以节约数据库资源
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

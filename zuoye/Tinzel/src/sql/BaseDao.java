package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

public class BaseDao {
	private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL = "jdbc:sqlserver://localhost:1433;databasename=Tinzel";
	private static final String UID = "sa";
	private static final String PWD = "123";

	/**
	 * 创建连接对象
	 * 
	 * @return
	 * @throws Exception
	 */
	public Connection getCon() throws Exception {
		Class.forName(DRIVER);
		return DriverManager.getConnection(URL, UID, PWD);
	}

	/**
	 * 关闭 连接对象 ，关闭执行 sql语句对象 ，关闭结果集对象 
	 * @param con
	 * @param stat
	 * @param rset
	 * @throws Exception
	 */
	public void closeCon(Connection con, PreparedStatement ps, ResultSet rs)
			throws Exception {
		if (rs != null) {
			rs.close();
		}
		if (ps != null) {
			ps.close();
		}
		if (con != null) {
			con.close();
		}
		rs = null;
		ps = null;
		con = null;
	}

}

package sql;
import java.sql.*;

public class Demo2 {
	private static final String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	//���ݿ����ӵ�ַ
	private static final String url="jdbc:sqlserver://127.0.0.1:143;DataBaseName=Tinzel";
	public static void main(String[] args){
		Connection con=null;//�������Ӷ���
		try {
			Class.forName(driver);//������������
			//�������ݿ����Ӷ��󣬡�sa��Ϊsqlserver���ݿ��û�����ccliu��Ϊ����
			con=DriverManager.getConnection(url, "sa", "ccliu");
			System.out.println(con);//��ӡConnection����
			con.close();//���ݿ�ʹ�����֮��һ��ر����ӣ��Խ�Լ���ݿ���Դ
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

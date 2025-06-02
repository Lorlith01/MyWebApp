import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPractice {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/DataBaseName?user=root&password=root&serverTimezone=UTC&characterEncoding=utf-8";
			Connection conn = DriverManager.getConnection(url);
			String sqlstr = "Insert Into XXXTable(clnm1, clnm2, clnm Values(?, ? ,?))";
			PreparedStatement stmt = conn.prepareStatement(sqlstr);
			stmt.setString(1, "");
			stmt.setInt(2, 800);
			stmt.setInt(3, 1000);
			stmt.execute();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

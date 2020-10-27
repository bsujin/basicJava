package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_insert {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//url 외우기
		String user = "sem"; 	//계정명 적기
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		//임의의 테이블에 insert 할 수 있는 코드를 작성해주세요.
		
		try {
			
			con= DriverManager.getConnection(url, user, password);
			
			String sql = " INSERT INTO dept VALUES (?,?,?) ";
			
			ps = con.prepareStatement(sql);
			ps.setInt(1,60);	//member가 varchar2 타입이므로 String사용 
			ps.setString(2, "TEST");
			ps.setString(3,"DAEJEON");
			
		
			//INSERT인 경우 update, int타입
			int result = ps.executeUpdate();		//결과를 얻기 위한 메서드 : 	.execute	
			System.out.println(result + "개의 행이 바뀌었습니다.");
			
						
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {	//종료 : null일때 종료				Exception이 모든 예외를 처리, SQLException보다 편의상 사용
			if(rs != null) try { rs.close(); } catch(Exception e) { }
			if(ps != null) try { ps.close(); } catch(Exception e) { }
			if(con != null) try { con.close(); } catch(Exception e) { }
		}


		
		//실행하면 끝 -> INSERT가 됨 
	}

}

package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDVC2 {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//url 외우기
		String user = "sem"; 	//계정명 적기
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		/*PreparedStatement의 추가적인 기능
			값을 ?로 넣고 값을 따로 셋팅 가능 -> ps.setString(parameterIndex, x); 매서드 사용 
		 											인덱스 에 x 값을 넣겠다는 의미*/
		
		/*ps.setDate(3, new java.sql.Date(date)) : date타입에는 sql.date를 넣어줘야함 java.util이 아님
		
		-> import java.sql.Date; 를 넣어야함  ctrl + shift + o 
		 ps.setDate(3, new Date(new java.util.Date().getTime())); : 둘다 date타입을 사용, 구분해주기 위해 하나는 패키지 풀네임 사용함 */
		
		
		
		
		
		//cart테이블 가져오기 -조회(try) : where절 사용하여 ps의 추가적인 기능 
		
		try {
			
			con= DriverManager.getConnection(url, user, password);
			
			String sql = " SELECT * FROM cart WHERE cart_member=? ";
			ps = con.prepareStatement(sql);
			ps.setString(1, "a001");	//member가 varchar2 타입이므로 String사용 
			//1번째 ?에 "" 를 넣겠다  -> 값 대신 ?를 넣고 타입에 맞게 값을 셋팅해줌
			
			// number 타입을 넣고 싶을 때 : ps.setInt(2, 10);
			//	date 타입을 넣고싶을 때 :  ps.setDate(3, new Date(new java.util.Date().getTime()));
			
			rs = ps.executeQuery();		//결과를 얻기 위한 메서드 : 	.execute	
			
			//rs.setFetchsize());	-가져올때 속도와 관련 (1건 
			
			//컬럼을 가져올때 어떤 위치, 어떤 컬럼이름이 필요 -> 편하게 전체 다 가져오는 방법
			ResultSetMetaData md = rs.getMetaData();
			// 메타데이터 .getMetaData() : 데이터에 대한 데이터  (메타데이터의 메서드-종류많음)
			
			
			
			int columnCount = md.getColumnCount(); 	//조회된 컬럼수 -> for문을 돌면서 개수 반환 
			
			while (rs.next()){
				for(int i = 1; i <= columnCount; i++){	
					Object value = rs.getObject(i);		//object (타입 상관없이 반영)
					System.out.println(value + "\t");
				}
				System.out.println();
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {	//종료 : null일때 종료				Exception이 모든 예외를 처리, SQLException보다 편의상 사용
			if(rs != null) try { rs.close(); } catch(Exception e) { }
			if(ps != null) try { ps.close(); } catch(Exception e) { }
			if(con != null) try { con.close(); } catch(Exception e) { }
		}

		
		
		
		
		
		
		
		
		
	}

}

package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class JDBC {

	public static void main(String[] args) {
		//자바와 데이터베이스 연결 
		/*
		 * JDBC(JAVA Database Connectivity)
		 * - 자바와 데이터베이스를 연결해주는 라이브러리
		 * - ojdbc : 오라클 JDBC	(다운로드 받아야함)
		 * 
		 * JDBC 작성단계
		 * 1. Connection 생성	
		 * 2. Statement 생성(쿼리)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출 (select인 경우)
		 * 5. 종료 : ResultSet, Statement, Connection 닫기 
		 *  
		 */
		
		
		//데이터베이스 접속 정보 -connection 생성
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//url 외우기
		String user = "sem"; 	//계정명 적기
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;			
		// 실행순서 Connection->PreparedStatement-> ResultSet
		//종료순서 반대로 (종료시 finally사용)
		
		//드라이버 매니저에 getConnection-매서드 로 url, user, password 받기 
		//드라이버  : 서로 다른것끼리 연결하는 중간다리역할 
		//매서드로 받아서 드라이버로 연결 -> con을 통해 연결 
		//컴파일 에러 발생 : 예외처리 해줘야함 
		
		try {
			
			//DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스 
			con = DriverManager.getConnection(url,user,password);
			//getConnection에서 드라이버 자동로드
			
			String sql = "select * from member";	//가져올 쿼리 작성 
			ps = con.prepareStatement(sql);		//sql을 만드는것
			
			//쿼리실행(조회) : 1.select인 경우, 2.insert,update,delete인 경우 
			
			//select
			rs = ps.executeQuery();	//result set 
			
			//insert,update,delete	- 쿼리로 인해서 몇개의 row가 영향을 받았는지 int타입으로 넘겨줌
			//int result = ps.executeUpdate();	
					
			//result set 에서 결과문을 추출 -while문 만들기
			//next : 조회된 결과의 row의 개수만큼 실행 
			
			
			//쿼리 조회 - > 결과 추출
			while(rs.next()){
				 
				//가져올 테이블의 데이터 타입에 따라 사용할 매서드가 달라짐
				//varchar2 - getString, date- getDate 
				
				// 컬럼의 순서지정 - varchar2타입 가져옴 - string
				String memId = rs.getString(1);		// (1) - 첫번째 있는 컬럼의 값을 가져오겠다  
				
				//컬럼의 이름지정
				String memPass = rs.getString("MEM_PASS");
				System.out.println("MEM_ID : " + memId + "/ MEM_PASS : " + memPass);
				
				
				//	rs.getInt(1);	데이터 타입이 number일 경우
				//	rs.getDate(1);	데이터 타입이 date일 경우
				
			}
			
			//쿼리를 더 하고싶으면, 쿼리 만드는것부터 다시 실행하여 작성
			//임의의 테이블 하나를 조회해서 테이블의 모든 내용을 출력해주세요.
		
			
				String sql1 = "SELECT * FROM EMP";
				ps = con.prepareStatement(sql1);	
				rs = ps.executeQuery();
				System.out.println("empno \t ename \t job \t\t mgr \t hiredate \t sal \t comm \t deptno" );	
				//컬럼명을 밖에다 써줘야 while문 영향을 안받음 -> while문에 넣으면 반복 출력
				
				while(rs.next()){
					int empno = rs.getInt(1);
					String ename = rs.getString(2);
					String job = rs.getString(3);
					int mgr = rs.getInt(4);
					Date hireDate = rs.getDate(5);
					int sal = rs.getInt(6);
					int comm = rs.getInt(7);
					int deptNo = rs.getInt(8);
				System.out.println(empno +"\t" + ename + "\t" + job +" \t"+ mgr + "\t" + hireDate + "\t" + sal+"\t"+comm +"\t" + deptNo );
					
				}
				
					
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {	//종료 : null일때 종료				Exception이 모든 예외를 처리, SQLException보다 편의상 사용
			if(rs != null) try { rs.close(); } catch(Exception e) { }
			if(ps != null) try { ps.close(); } catch(Exception e) { }
			if(con != null) try { con.close(); } catch(Exception e) { }
		}
		
		//실행 : 에러 발생 -> 이유? ojdbc 드라이버가 없기 때문(자바에 포함되어 있지 않음)
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

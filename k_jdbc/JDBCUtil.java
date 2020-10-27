package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {
	
	//싱글톤패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴 -> 객체를 하나만 생성
	
	private JDBCUtil(){	//다른 클래스에서 생성자를 만들지 못하게 함 
		
		
	}
	
	//객체-인스턴스를 보관할 변수
	private static JDBCUtil instance;
	
	//인스턴스를 빌려주는 메서드	(다른클래스에서 getInstance를 호출하면 객체를 빌릴 수 있음)
	public static JDBCUtil getInstance(){
		if(instance == null){
			instance = new JDBCUtil();
			
		}
		return instance;
	}
	
	// - 여기까지 만들면 싱글톤 패턴이 완성 
	
	
	//접속정보 가져오기 - 다른 클래스에서는 알 필요가 없음(private사용)
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "sem";
	private String password = "java";
	
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	
	//만들 매서드 (6개의 매서드를 만들어야함)
	/* 원하는 조건에 한줄만 출력
	 * Map<String, Object> selectOne(String sql)	- 쿼리안에 ?가 없는경우
	 * Map<String, Object> selectOne(String sql, List<Object>param ) - 쿼리안에 ?가 없는경우: ?에 넣을 값을 List에 넣어줌 
	 * List<Map<String, Object>> selectList(String sql)
	 * List<Map<String, Object>> selectList(String sql, List<Object>param )
	 * int update(String sql)
	 * int update(String sql, List<Object>param )
	 */
	
	// cf) ibatis : 하나의 라이브러리, 자바와 데이터베이스를 쉽게 연결해주는 매서드
	
	
	//default -> public 바꾸기
	
	public Map<String, Object> selectOne(String sql){
		
		HashMap<String, Object> row = new HashMap<>();
				
			
			try {
				con = DriverManager.getConnection(url, user, password );
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				
				ResultSetMetaData md = rs.getMetaData();	//갯수를 모를때 조회
				int columnCount = md.getColumnCount();
				
				while(rs.next()){
				for(int i = 1; i<=columnCount; i++){	
					String key = md.getColumnName(i);
					Object value = rs.getObject(i);
						row.put(key, value);
						
					}
				}System.out.println(row);
				 
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if(rs != null) try { rs.close(); } catch(Exception e) {}
				if(ps != null) try { ps.close(); } catch(Exception e) {}
				if(con != null) try { con.close(); } catch(Exception e) {}
			}
				
			return row;
	}	
		
	public Map<String, Object> selectOne (String sql, List<Object>param) {

			HashMap<String,Object>row = new HashMap<>();
		
			
			try {
				con = DriverManager.getConnection(url, user, password );
				ps = con.prepareStatement(sql);
				
				for(int i = 0; i<param.size(); i++){
					ps.setObject(i+1, param.get(i));	//파라미터의 값을 가져와서 인덱스에 넣기 
				
				}		
				
				rs = ps.executeQuery();
				ResultSetMetaData md = rs.getMetaData();
				md.getColumnCount();
				
				int columnCount = md.getColumnCount();
				
				while (rs.next()){
					for(int i = 1; i<=columnCount; i++){	
					String key = md.getColumnName(i);
						Object value = rs.getObject(i);
							row.put(key, value);				
					}
				}System.out.println(row);
					
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally { // 닫을 때는 역순으로 닫아줌
					if (rs != null)
						try { 	rs.close();	} catch (Exception e) {}
					if (ps != null)
						try {	ps.close();	} catch (Exception e) {}
					if (con != null)
						try {con.close(); 	} catch (Exception e) {
						}
			
			}
			return row; 
				
		}
		
	
	
	public List<Map<String, Object>> selectList (String sql) {
		List<Map<String,Object>> list = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(url, user, password );
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
		
			ResultSetMetaData md = rs.getMetaData();
			md.getColumnCount();
			int columnCount = md.getColumnCount();
			
			while(rs.next()){
				HashMap<String, Object> row = new HashMap<>();
				for(int i = 1; i<columnCount; i++){
					String key = md.getColumnName(i);
					Object value = rs.getObject(i);
						row.put(key,value);
				}	list.add(row);
				
			}System.out.println(list);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally { // 닫을 때는 역순으로 닫아줌
				if (rs != null)
					try { 	rs.close();	} catch (Exception e) {}
				if (ps != null)
					try {	ps.close();	} catch (Exception e) {}
				if (con != null)
					try {con.close(); 	} catch (Exception e) {
					}
		
		}	return list;	//list를 반환해줌 

	
	}
	
	
	
	public List< Map <String, Object>> selectList(String sql, List<Object>param){	//result set 을 리턴 
		
		//리턴 받을 변수 만들기
		List<Map<String,Object>> list = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(url, user, password );
			ps = con.prepareStatement(sql);
			
			for(int i = 0; i<param.size(); i++){
				//타입을 알 수 없음 = object
				//param = list => ? 값은  인덱스의 값은 (i+1)에 넣겠다는 뜻
				ps.setObject(i+1, param.get(i));
				
			}
			//result set의 결과를 얻을 수 있음
			rs = ps.executeQuery();
			
			//result set에서 결과를 가져와야함 -> 컬럼의 개수를 모름 metadata사용
			ResultSetMetaData md = rs.getMetaData();
			md.getColumnCount();
			
			//모든데이터를 출력이 아니라 담아서 반환 
			int columnCount = md.getColumnCount();
			
			//columnCount 만큼 for문을 돌아서 가져오기
			while (rs.next()){
				
				//hashmap을 만들어주기
				//한줄한줄 새로운 hashmap을 담아줘야하므로 while문 안에 있어야함 : (while문밖에있으면 똑같은 hashmap이 됨)
				Map<String, Object> row = new HashMap<>();	
				for(int i = 1; i<=columnCount; i++){	//for문을 돌면서 hashmap에 담기
					String key = md.getColumnName(i);
					Object value = rs.getObject(i);
							row.put(key, value);				//hashmap에 저장 
				}
							list.add(row);						//배열에 저장
						}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally { // 닫을 때는 역순으로 닫아줌
				if (rs != null)
					try { 	rs.close();	} catch (Exception e) {}
				if (ps != null)
					try {	ps.close();	} catch (Exception e) {}
				if (con != null)
					try {con.close(); 	} catch (Exception e) {
					}
		
		}	return list;	//list를 반환해줌 

	}
		

	public int update(String sql) {
		int result =0;
		try {
			con = DriverManager.getConnection(url, user, password );
			ps = con.prepareStatement(sql);
			result = ps.executeUpdate();
			
			if(0 < result){
				System.out.println("수정이 완료되었습니다.");
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally { // 닫을 때는 역순으로 닫아줌
				if (rs != null)
					try { 	rs.close();	} catch (Exception e) {}
				if (ps != null)
					try {	ps.close();	} catch (Exception e) {}
				if (con != null)
					try {con.close(); 	} catch (Exception e) {
					}
		
	}
		return result;
	}
	
	
	public int update(String sql, List<Object>param) {
		List<Map<String,Object>> list = new ArrayList<>();
		
		int result =0;
		
		try {
			con = DriverManager.getConnection(url, user, password );
			ps = con.prepareStatement(sql);
			
			for(int i = 0; i<param.size(); i++){
				ps.setObject(i+1, param.get(i));
			
			}
						
			result = ps.executeUpdate();
			
				
			if(0 < result){
				System.out.println("수정이 완료되었습니다.");
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally { // 닫을 때는 역순으로 닫아줌
				if (rs != null)
					try { 	rs.close();	} catch (Exception e) {}
				if (ps != null)
					try {	ps.close();	} catch (Exception e) {}
				if (con != null)
					try {con.close(); 	} catch (Exception e) {
					}
		
	}
		return 0;
	}
	
		
	
	
	
	
	
	
	
	
	
	
			
			
		}
	
		
		
		
		
		
		
	

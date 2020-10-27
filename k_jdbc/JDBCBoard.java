package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCBoard {

	private static Scanner sc;

	public static void main(String[] args) {

		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요. 테이블 : TB_JDBC_BOARD 컬럼 :
		 * BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
		 */
		
		while (true) {

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "sem";
			String password = "java";

			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;

			System.out.println("===============================");
			System.out.println("번호\t 제목 \t 내용 \t 작성자 \t 작성일");
			System.out.println("===============================");

			try {
				con = DriverManager.getConnection(url, user, password);

				String sql = "SELECT * FROM TB_JDBC_BOARD ORDER BY BOARD_NO";
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();

				while (rs.next()) {
					int BOARD_NO = rs.getInt(1);
					String TITLE = rs.getString(2);
					String CONTENT = rs.getString(3);
					String USER_ID = rs.getString(4);
					Date REG_DATE = rs.getDate(5);
					
					System.out.print(BOARD_NO + "\t");
					System.out.print(TITLE + "\t");
					System.out.print(CONTENT + "\t");
					System.out.print(USER_ID + "\t");
					System.out.print(REG_DATE);
					System.out.println();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (rs != null)
					try {
						rs.close();
					} catch (Exception e) {
					}
				if (ps != null)
					try {
						ps.close();
					} catch (Exception e) {
					}
				if (con != null)
					try {
						con.close();
					} catch (Exception e) {
					}
			}

			System.out.println("----------------------------------");
			System.out.println("1.조회\t2.등록\t3.종료");
			System.out.print("입력>");
			int input = sc.nextInt();

			switch (input) {
			case 1: // 조회
				Read();
				break;

			case 2: // 등록
				write();
				break;

			case 3: // 종료
				System.out.println("종료되었습니다.");
				System.exit(0);
				break;
			}
		}

	}

	public static void write() {

		sc = new Scanner(System.in);

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "sem";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		System.out.println("게시글 제목을 입력하세요 > ");
		String title = sc.nextLine();
		System.out.println("내용을 써주세요 > ");
		String content = sc.nextLine();
		System.out.println("작성자(이름)를 입력하세요 > ");
		String name = sc.nextLine();

		try {
			con = DriverManager.getConnection(url, user, password);

			String sql = "INSERT INTO TB_JDBC_BOARD  VALUES (NVL(MAX(board_no),0)+1,?,?,?,SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setString(3, name);

			int result = ps.executeUpdate();
			System.out.println(result + " 개의 행이 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (ps != null)
				try {
					ps.close();
				} catch (Exception e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
				}
		}

	}

	public static void Read() {

		sc = new Scanner(System.in);

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "sem";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		System.out.println("게시글 번호를 입력하세요 > ");
		int no = sc.nextInt();
		System.out.println("====================================");
		System.out.println("번호\t" + "제목\t" + "작성자\t" + "작성일");
		System.out.println("====================================");

		try {
			con = DriverManager.getConnection(url, user, password);

			String sql = "SELECT * FROM tb_jdbc_board WHERE BOARD_NO ? ORDERBY BOARD_NO ";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			rs = ps.executeQuery();

			while (rs.next()) {
				int BOARD_NO = rs.getInt(1);
				String TITLE = rs.getString(2);
				String CONTENT = rs.getString(3);
				String USER_ID = rs.getString(4);
				Date REG_DATE = rs.getDate(5);

				System.out.print(BOARD_NO + "\t");
				System.out.print(TITLE + "\t");
				System.out.print(CONTENT + "\t");
				System.out.print(USER_ID + "\t");
				System.out.print(REG_DATE);
				System.out.println();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 닫을 때는 역순으로 닫아줌
			if (rs != null)
				try {
					rs.close();
				} catch (Exception e) {
				}
			if (ps != null)
				try {
					ps.close();
				} catch (Exception e) {
				}
			if (con != null)
				try {
					con.close();
				} catch (Exception e) {
				}
		}

		System.out.println("1.삭제 \t" + "2.수정\t" + "3.종료");
		int input = sc.nextInt();
		switch (input) {

		case 1:
			delete(no);
			break;

		case 2:
			update(no);
			break;

		case 3:
			break;
		}
	}

	private static void update(int no) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "sem";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		
		System.out.println("게시글 제목을 입력하세요 > ");
		String title = sc.nextLine();
		System.out.println("내용을 써주세요 > ");
		String content = sc.nextLine();
			
		try {
			con = DriverManager.getConnection(url, user, password);

			String sql = "UPDATE tb_jdbc_board  SET (TITLE=?,CONTENT=? WHERE BOARD_NO=?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, no);

			int result = ps.executeUpdate();
			System.out.println(result + " 개의 행이 바뀌었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 닫을 때는 역순으로 닫아줌
			if (rs != null)
				try { 	rs.close();	} catch (Exception e) {}
			if (ps != null)
				try {	ps.close();	} catch (Exception e) {}
			if (con != null)
				try {con.close(); 	} catch (Exception e) {
				}
		}

	}

	private static void delete(int no) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "sem";
		String password = "java";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);

			String sql = "DELETE tb_jdbc_board  WHERE BOARD_NO=? ";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);

			int result = ps.executeUpdate();
			System.out.println(result + " 개의 행이 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 닫을 때는 역순으로 닫아줌
			if (rs != null)
				try { 	rs.close();	} catch (Exception e) {}
			if (ps != null)
				try {	ps.close();	} catch (Exception e) {}
			if (con != null)
				try {con.close(); 	} catch (Exception e) {
				}
		}

	}
}
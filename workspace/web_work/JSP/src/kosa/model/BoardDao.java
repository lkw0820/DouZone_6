package kosa.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDao {
	//singleton패턴 객체를 하나만 만드는 패턴
	private static BoardDao dao = new BoardDao();
	public static BoardDao getInstance() {
		return dao;
	}
	//JNDI DBCP 구현
	//DataSource(Connection Pool) => JNDI이름 jdbc/oracle
	public Connection getDBCPConnection() {
		DataSource ds = null;
		try {
			Context ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/oracle");
			return ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public Board detailBoard(int seq) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Board board = new Board();
		String sql="select * from board where seq = ?";
		try {
			conn=getDBCPConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContents(rs.getString("contents"));
				board.setRegdate(rs.getString("regdate"));
				board.setHitcount(rs.getInt("hitcount"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		return board;
	}
	//글목록 출력
	public List<Board> listBoard(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet re = null;
		List<Board> list = new ArrayList<Board>();
		String sql = "select * from board order by seq desc";
		try {
			conn = getDBCPConnection();
			pstmt = conn.prepareStatement(sql);
			re = pstmt.executeQuery();
			while(re.next()) {
				Board board = new Board();
				board.setSeq(re.getInt("seq"));
				board.setTitle(re.getString("title"));
				board.setWriter(re.getString("writer"));
				board.setContents(re.getString("contents"));
				board.setRegdate(re.getString("regdate"));
				board.setHitcount(re.getInt("hitcount"));
				list.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		return list;
	}
	
	public int insertBoard(Board board) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		//url, user, password
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "douzon";
		String password = "1234";
		int re =-1;
		String sql = "insert into board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			//1단계: jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2단계: DB연결(Connection 객체생성)
			conn = DriverManager.getConnection(url,user,password);
			System.out.println("conn: "+conn);
			//3단계: PreparedStatement 객체생성(SQL준비)
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,board.getTitle());
			pstmt.setString(2,board.getWriter());
			pstmt.setString(3,board.getContents());
			
			//4단계: sql문 실행 (re=> 실행된 row의 개수
			re=pstmt.executeUpdate();//insert,update,delete
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (Exception e3) {
					// TODO: handle exception
				}
			}
		}
		return re;
	}
	
	public int deleteBoard(int seq) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		//ResultSet re = null;
		int re=-1;
		String sql="delete from board where seq=?";
		try {
			conn = getDBCPConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			re=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		return re;
	}
	public int updateBoard(Board board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int re=-1;
		String sql="update board set title=?, contents=? where seq=?";
		try {
			conn=getDBCPConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContents());
			pstmt.setInt(3, board.getSeq());
			re=pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		return re;
	}
}

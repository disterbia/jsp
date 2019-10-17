package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import models.Board;

public class BoardDao {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet cursor;

	// ArrayList<Board>리턴
	public ArrayList<Board> findByAll() {
		// 1.DB연결

		conn = DBConn.getConnection();

		// 2.DB쿼리작성
		final String SQL = "SELECT  * FROM BOARD";
		ArrayList<Board> boards = new ArrayList<Board>();
		// 3.DB쿼리 완성
		try {
			pstmt = conn.prepareStatement(SQL);
			// 4.DB쿼리 실행
			cursor = pstmt.executeQuery();

			while (cursor.next()) {
				Board board = new Board();
				board.setId(cursor.getInt("id"));
				board.setTitle(cursor.getString("title"));
				board.setContent(cursor.getString(3));
				boards.add(board);
			}
			return boards;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

		return null;
	}
	
	public Board findById(int id) {
		final String SQL = "SELECT * FROM board WHERE id = ?";
		
		conn= DBConn.getConnection();
		
		try {
			pstmt=conn.prepareStatement(SQL);
			pstmt.setInt(1, id);
			cursor=pstmt.executeQuery();
			
			if(cursor.next()) {
				Board b = new Board();
				b.setId(cursor.getInt("id"));
				b.setTitle(cursor.getString("title"));
				b.setContent(cursor.getString("content"));
				
				return b;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			
		}
		
		return null;
	}
	
	public int delete(int id) {
		final String SQL = "DELETE FROM board Where id=?";
		
		conn=DBConn.getConnection();
		
		try {
			pstmt=conn.prepareStatement(SQL);
			pstmt.setInt(1, id);
			int result=pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
		return -1;
	}
	public int save(Board board) {
		final String SQL = "INSERT INTO board(id,title,content) VALUES(board_seq.nextval,?,?)";
		
		conn=DBConn.getConnection();
		try {
			pstmt=conn.prepareStatement(SQL);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getContent());
			int result=pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
		return -1;
	}
	
}

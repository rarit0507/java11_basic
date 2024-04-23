package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.database.Student;

public class MariaDBExam2 {
	public static void main(String[] args) {
		Connection con = null;	//연결
		PreparedStatement pstmt = null;	//상태 변경(ON/OFF) 하고, SQL 문장 실행
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";	//마지막거:데이터베이스명
		String userid = "root";
		String userpw = "1234";
		Student newSt = new Student(11, "Kain Bellmer", 95);
		String sql = "insert into student values (?, ?, ?)";
		
		//MariaDB의 temp 데이터베이스의 student 테이블의 newSt 내용을 레코드로 추가되도록 자바 프로그래밍을 완성하시오.
		List<Student> st = new ArrayList<>();
		int i=0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url,userid,userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, newSt.getNo());
				pstmt.setString(2, newSt.getName());
				pstmt.setInt(3, newSt.getPoint());
				i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println("레코드 정상 추가");
				} else {
					System.out.println("레코드 추가 실패");
				}
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL 처리 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
			if (pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

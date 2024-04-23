package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.database.Student;

public class MariaDBExam3 {
	public static void main(String[] args) {
		Connection con = null;	//����
		PreparedStatement pstmt = null;	//����-�������
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		Student updSt = new Student(3, "park", 88);
		String sql = "update student set name=?, point=? where no=?";
		
		//MariaDB �� temp �����ͺ��̽��� student ���̺� 3�� �л��� �����͸� updSt�� �������� 
		//���ڵ尡 ����� �� �ֵ��� �ڹ� ���α׷����� �ϼ��Ͻÿ�.
		
		int i = 0;
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, updSt.getName());
				pstmt.setInt(2, updSt.getPoint());
				pstmt.setInt(3, updSt.getNo());
				i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i+"���� ���������� ó���Ǿ����ϴ�.");
				} else {
					System.out.println("SQL ó�� ����");
				}
			} catch (SQLException e) {
				System.out.println("�����ͺ��̽� ���� ���� �Ǵ� SQL ó�� ����");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
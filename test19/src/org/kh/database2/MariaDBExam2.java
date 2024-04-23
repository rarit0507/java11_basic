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
		Connection con = null;	//����
		PreparedStatement pstmt = null;	//���� ����(ON/OFF) �ϰ�, SQL ���� ����
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";	//��������:�����ͺ��̽���
		String userid = "root";
		String userpw = "1234";
		Student newSt = new Student(11, "Kain Bellmer", 95);
		String sql = "insert into student values (?, ?, ?)";
		
		//MariaDB�� temp �����ͺ��̽��� student ���̺��� newSt ������ ���ڵ�� �߰��ǵ��� �ڹ� ���α׷����� �ϼ��Ͻÿ�.
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
					System.out.println("���ڵ� ���� �߰�");
				} else {
					System.out.println("���ڵ� �߰� ����");
				}
			} catch (SQLException e) {
				System.out.println("�����ͺ��̽� ���� ���� �Ǵ� SQL ó�� ����");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
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

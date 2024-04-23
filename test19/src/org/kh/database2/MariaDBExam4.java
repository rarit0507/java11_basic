package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MariaDBExam4 {
	public static void main(String[] args) {
		Connection con = null;	//����
		PreparedStatement pstmt = null;	//����-�������
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		int delNo = 2;
		String sql = "delete from student where no=?";
		
		//MariaDB �� temp �����ͺ��̽��� student ���̺� delNo ��ȣ�� �ش��ϴ� �л���  
		//���ڵ尡 ������ �� �ֵ��� �ڹ� ���α׷����� �ϼ��Ͻÿ�.
		int i = 0;
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, delNo);
				i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i+"���� ���������� ó���Ǿ����ϴ�.");
				} else {
					System.out.println("ó�� ����");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
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
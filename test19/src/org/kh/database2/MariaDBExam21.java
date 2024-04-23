package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.kh.database.Student;

public class MariaDBExam21 {
	public static void main(String[] args) {
		Connection con = null;	//����
		Statement stmt = null;	//����-�������
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		Student newSt = new Student(8, "������", 87);
		//insert into student values(7, 'yoon', 87);
		String sql = "insert into student values ("+newSt.getNo()+",";
		sql += "'"+newSt.getName()+"'"+","+newSt.getPoint()+")";
		System.out.println(sql);
		//MariaDB �� temp �����ͺ��̽��� student ���̺��� newSt�� ������ ���ڵ�� �߰��ǵ��� 
		//�ڹ� ���α׷����� �ϼ��Ͻÿ�.
		int i = 0;
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				stmt = con.createStatement();
				i = stmt.executeUpdate(sql);
				if(i>0) {
					System.out.println("���ڵ� ���� �߰�");
				} else {
					System.out.println("���ڵ� �߰� ����");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(stmt!=null) {
				try {
					stmt.close();
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
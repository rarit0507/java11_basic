package structural.facade;

import java.sql.Connection;

public class OracleHelper {
 
	public static Connection getOracleDBConnection(){
		// ���� Ŀ�ؼ��� �����ؾ� ������, �����̱⿡ null �� �����ϰڽ��ϴ�.
		return null;
	}
	
	public void generateOraclePDFReport(String tableName, Connection con){
		// get data from table and generate pdf report
	}
	
	public void generateOracleHTMLReport(String tableName, Connection con){
		// get data from table and generate pdf report
	}
	
}
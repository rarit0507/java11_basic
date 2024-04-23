package sec2;
//추상 클래스(인터페이스)
public interface Database {
	void connect(String url, String port, String id, String pw);
	//ㄴ모든 DB가 이 형식
	void close(Connection conn, PreparedStatement pstmt, ResultSet rs);
	void select(String tbname, String condition);
	void insert(String tbname, String field1, int field2);
	void update(String tbname, String field1, int value1, String condition);
	void delete(String tbname, String condition);
}

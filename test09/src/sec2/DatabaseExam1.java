package sec2;

public class DatabaseExam1 {
	// 인터페이스로 DB 연결 - 형변환(DB변환) 자유롭게
	public static void main(String[] args) {
		Database db;	//객체 선언. 아직 무슨 db일지 모름(connent만 다름)
		
		System.out.println("\nOracle");
		db = new Oracle();
		db.connect(Oracle.URL, Oracle.PORT+"", Oracle.ID, Oracle.PW);
		db.select("board", "where title like \'%\'+알림\'%\'");
		db.insert("board", "\'제목10\'", 10);
		
		System.out.println("\nMysql");
		db = new Mysql();
		db.connect(Mysql.URL, Mysql.PORT+"", Mysql.ID, Mysql.PW);
		db.select("board", "where title like \'%\'+알림\'%\'");
		db.insert("board", "\'제목11\'", 11);
		
		System.out.println("\nMariaDB");
		db = new MariaDB();
		db.connect(MariaDB.URL, MariaDB.PORT+"", MariaDB.ID, MariaDB.PW);
		db.select("board", "where title like \'%\'+알림\'%\'");
		db.insert("board", "\'제목12\'", 12);
		
		//db = new Database();	//추상체는 선언 불가. 구체적 내용 작성 시 이용 가능
	}

}

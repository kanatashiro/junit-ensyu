package junit.tutorial.ex02.e06;

public class Frameworks {
	//static
	public static boolean isSupport(ApplicationServer appServer, Database db) {
		//boolean出戻る
		//appServer = Apprication Servece
		switch (appServer) {
		case GlassFish:
			return true;
		case Tomcat:
			return db == Database.MySQL; //dbから持ってきた
		case JBoss:
			return db == Database.DB2 || db == Database.PostgreSQL;
		default:
			return false;
		}
	}

}

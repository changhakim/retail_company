package enums;

public enum CategorySQL {
	LIST, COUNT;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case LIST:
			query.append("SELECT D1.*\n" + 
					"FROM (SELECT ROWNUM NO1,D.*\n" + 
						  "FROM (SELECT ROWNUM NO, C.*\n" + 
						  		 "FROM CATEGORIES C\n" + 
						  		 "ORDER BY no desc) D)D1\n" + 
					"WHERE NO1 BETWEEN ? AND ?");
			break;
		case COUNT:
			query.append("SELECT COUNT(*) NUM FROM CATEGORIES");
			break;
		default:
			break;
		}
		return query.toString();
	}
}

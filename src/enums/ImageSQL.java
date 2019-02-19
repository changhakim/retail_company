package enums;

public enum ImageSQL {
	IMG_INSERT,IMG_LAST_SEQ,IMG_LAST_RETRIEVE;
	
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case IMG_INSERT:
			query.append("INSERT INTO IMAGE(IMG_SEQ,IMG_NAME,IMG_EXTENTION,OWNER)\r\n" + 
					"       VALUES(IMG_SEQ.NEXTVAL,?,?,?)");
			break;
		case IMG_LAST_SEQ:
			query.append(" SELECT IMG_SEQ LAST ,IMG_NAME\n" + 
						  "FROM IMAGE\n" + 
						  "WHERE IMG_SEQ LIKE ((SELECT MAX(IMG_SEQ)\n" + 
												"FROM IMAGE))");
			break;
		case IMG_LAST_RETRIEVE:
			query.append(" SELECT *\n" + 
					" FROM IMAGE\n" + 
					" WHERE IMG_SEQ LIKE ?");
			break;
		default:
			break;
		}
		return query.toString();
	}
}

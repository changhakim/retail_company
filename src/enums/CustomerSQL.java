package enums;

public enum CustomerSQL {
	CUSREGISTER,CUSACCESS,LIST,COUNT;
	
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case CUSREGISTER:
			query.append("INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,SSN,PHONE,CITY,ADDRESS,POSTALCODE)\n" + 
					"VALUES (?,?,?,?,?,?,?,?)");
			break;

		case CUSACCESS:
			query.append("SELECT * FROM CUSTOMERS WHERE CUSTOMER_ID LIKE ? AND  PASSWORD LIKE ?");
			
			break;
		case LIST:
			
			query.append("SELECT D1.*\n" + 
						"FROM (SELECT ROWNUM NO1,D.*\n" + 
							  "FROM (SELECT ROWNUM NO, C.*\n" + 
							  		 "FROM CUSTOMERS C\n" + 
							  		 "ORDER BY no desc) D)D1\n" + 
						"WHERE NO1 BETWEEN ? AND ?");
			break;
		case COUNT:
			query.append("SELECT COUNT(*) COUNT\n" + 
						"FROM CUSTOMERS");
		default:
			break;
		}
		
		return query.toString();
	}
	
	
}

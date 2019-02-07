package enums;

public enum CustomerSQL {
	CUSREGISTER,CUSACCESS;
	
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case CUSREGISTER:
			query.append("INSERT INTO CUSTOMERS(CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,ADDRESS,CITY,POSTALCODE,SSN)\r\n" + 
					"VALUES (?,?,?,?,?,?,?)");
			break;

		case CUSACCESS:
			query.append("SELECT CUSTOMER_ID,PASSWORD FROM CUSTOMERS WHERE CUSTOMER_ID LIKE ? AND  PASSWORD LIKE ?");
			
			break;
		default:
			break;
		}
		
		return query.toString();
	}
	
	
}

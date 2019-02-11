package enums;

public enum CustomerSQL {
	CUSREGISTER,CUSACCESS,LIST;
	
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
			query.append("SELECT * FROM CUSTOMERS");
		default:
			break;
		}
		
		return query.toString();
	}
	
	
}

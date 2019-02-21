package enums;

public enum ProductSQL {
	LIST, REGISTER, DELETE, COUNT, RETRIEVE, UPDATE;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case LIST:
			query.append("SELECT D1.*\n" + 
					"FROM (SELECT ROWNUM NO1,D.*\n" + 
						  "FROM (SELECT ROWNUM NO, C.*\n" + 
						  		 "FROM PRODUCTS C\n" + 
						  		 "ORDER BY no desc) D)D1\n" + 
					"WHERE NO1 BETWEEN ? AND ?");
			break;
		case REGISTER:
			query.append("INSERT INTO PRODUCTS(PRODUCT_ID,PRODUCT_NAME,SUPPLIER_ID,CATEGORY_ID,UNIT,PRICE)\n" + 
					"VALUES(PRODUCT_ID.NEXTVAL,?,?,?,?,?)");
			break;
		case DELETE:
			query.append("DELETE FROM PRODUCTS WHERE PRODUCT_ID LIKE ?");
			break;
		case COUNT:
			query.append("SELECT COUNT(*) TOTAL FROM PRODUCTS");
			break;
		case RETRIEVE:
			query.append("SELECT * FROM PRODUCTS WHERE PRODUCT_ID LIKE ?");
			break;
		case UPDATE:
			query.append("UPDATE PRODUCTS SET PRODUCT_NAME  = ?,\n" + 
												"UNIT = ?,\n" + 
												"PRICE = ?\n" + 
						"WHERE PRODUCT_ID LIKE ?");
			break;
		default:
			break;
		}
		return query.toString();
	}
}

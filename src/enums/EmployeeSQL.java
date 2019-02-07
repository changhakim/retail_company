package enums;
/**
 *private String employeeID,
				   manager,
				   name,
				   birthDate,
				   photo,
				   notes; 
 * */
public enum EmployeeSQL {
	REGISTER,UPDATE,ACCESS;
	
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case REGISTER:
			query.append("INSERT INTO EMPLOYEES(EMPLOYEE_ID,MANAGER,NAME,BIRTH_DATE,PHOTO,NOTES) VALUES("
					+ "EMP_SEQ.NEXTVAL,?,?,?,?,?)");
			break;

		case ACCESS:
			query.append("SELECT EMPLOYEE_ID,NAME FROM EMPLOYEES WHERE EMPLOYEE_ID LIKE ? AND  NAME LIKE ?");
			break;
		
			
		default:
			break;
		}
		return query.toString();
	}
	
}

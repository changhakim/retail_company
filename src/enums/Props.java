package enums;

import java.io.File;

public enum Props{
	ORA_DRIVER("oracle.jdbc.OracleDriver"),
	DB_USER("oracle"),
	DB_PASS("password"),
	DB_URL("jdbc:oracle:thin:@localhost:1521:xe"),
	IMAGE("C:"
			+File.separator+"Users"
			+File.separator+"hanbit"
			+File.separator+"java_basic"
			+File.separator+"jee_workspace"
			+File.separator+"BitTrader"
			+File.separator+"WebContent"
			+File.separator+"resources"
			+File.separator+"img"
			+File.separator);
	private String value;
	
	private Props(String value) {
		this.value = value;
	}
	public String getValue() {
		
		return value;
	}
	
	
	
	 
	
}

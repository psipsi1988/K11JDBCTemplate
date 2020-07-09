package springboard.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateConst {
	
	/*
	JDBCTemplate을 웹애플리케이션 어디에서나 사용할 수 있도록 
	하기 위해 static(정적)변수로 생성한다. 
	
	해당 웹 애플리케이션 전체에서 사용하기 위해 static(정적)
	변수를 가진 클래스를 하나 생성한다. 
	 */
	public static JdbcTemplate template;
}

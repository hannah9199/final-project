package dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("pmdao")
public class MypaymentDao {
	private final String namespace ="MapMypayment.";
	
	@Autowired
	SqlSessionTemplate abcd;
	
	public MypaymentDao() {}
	
}

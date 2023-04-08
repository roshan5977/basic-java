package jdbc;

import java.sql.Connection;

import com.mysql.cj.xdevapi.PreparableStatement;

public class AccountService {

	public static void main(String[] args) {
		AccountService accountService=new AccountService();
		accountService.saveAccount(new Account(1,"Roshan",1000,"RNayak","nayak"));

	}

	private void saveAccount(Account account) {
			Connection connection=DBConnection.getConnection();
			PreparableStatement statement=null;
			
			
   		
	}
	

}

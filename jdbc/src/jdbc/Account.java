package jdbc;

public class Account {
	int id;
	String Name;
	int balance;
	String userName;
	String password;
	public Account(int id, String name, int balance, String userName, String password) {
		super();
		this.id = id;
		Name = name;
		this.balance = balance;
		this.userName = userName;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", Name=" + Name + ", balance=" + balance + ", userName=" + userName
				+ ", password=" + password + "]";
	}
}

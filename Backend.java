package EmailGenerator;

public class Backend{
	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private int defaultPasswordLength = 11;
	private String companySuffix = "@email.com";
	
	public Backend(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = randomPassword(defaultPasswordLength);
		
		email = firstname.toLowerCase() + "." + lastname.toLowerCase()+ companySuffix;
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*^";
		char [] password = new char[length];
		for(int i = 0; i<length;i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "Name: " + firstname + " " + lastname + 
				"\nEmail: " + email+ "\nYour Password is: "+this.password;
	}
}
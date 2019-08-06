package comm.fahim;

import java.util.Scanner;

public class LoginApplication {
	public Boolean Login(String userName,String passWord) {
		boolean isvalid=false;
		final String loginId="fahim";
		final String logInPsw="123456";
		if(loginId.equals(userName) && logInPsw.equals(passWord) && !userName.isEmpty() && !passWord.isEmpty()) {
			isvalid=true;
		}
		else {
			isvalid=false;
		}
		return isvalid;
	}
	public static void main(String args[]) {
		LoginApplication application=new LoginApplication();
		Scanner scanner=new Scanner(System.in);
		int countLoginFailed=0;
		for(int i=0;i<=countLoginFailed;i++) {
			if(countLoginFailed>=0 && countLoginFailed<3){
		System.out.println("Enter Your UserName: ");
		String userName=scanner.nextLine();
		System.out.println("Enter Your Password: ");
		String passWord=scanner.nextLine();
		boolean result=application.Login(userName, passWord);
		if(result) {
			System.out.println("Welcome "+userName);
			scanner.close();
			break;
		}
		else {
			countLoginFailed++;
		}}
			else {
				System.out.println("Contact Admin");
				scanner.close();
			}
			}
}}

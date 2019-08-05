package comm.fahim;

import java.util.Scanner;

public class LoginApplication {
	public Boolean Login(String userName,String passWord) {
		boolean isvalid=false;
		String loginId="fahim";
		String logInPsw="123456";
		if(userName==loginId && passWord==logInPsw) {
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
		System.out.println(i+"-->"+result);
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

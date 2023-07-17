//child class
package org.tcs;

public class User extends Facebook {

	@Override
	void password() {	
		System.out.println("my password is Rana@_457");
	}

	@Override
	void dp() {
		System.out.println("my dp is mountains");
    }
	public void gitbranch() {
System.out.println("karuna branch code");
	}
	public static void main(String args[]) {
		User u=new User();
		u.userName();
		u.password();
		u.dp();
		u.gitbranch();
		
	}
	

}

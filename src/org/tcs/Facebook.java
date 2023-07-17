//partial abstraction parent class
package org.tcs;
public abstract class Facebook  {
	//non-abstract method
	void userName() { 
		System.out.println("UserName is Rana");
	}
	
	//abstract method (does not have business logic)
	abstract void password();
	abstract void dp();
}
	



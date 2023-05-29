package org.control;
public class ControlStatement {
	public static void main(String[] args) {
		//nested if
		int entrance = 80;
		int main = 90;
		int Final = 100;
		if (entrance>=80) {
			System.out.println("pass in entrance");		
			if (main>=90) {
				System.out.println("pass in mains");
				
				if (Final >=100) {
					System.out.println("passed");
				}
				else {
					System.out.println("failed");
				}
			}
			else {
				System.out.println("failed in main");
			}
		}
		else {
			System.out.println("failed in entrance");
		}

		
		System.out.println("\n\tand gate");
		
		if (entrance==80 && main >=95) {
			System.out.println("both are true");
		}
		else {
			System.out.println("both are not true");
		}
		
		System.out.println("\n\t or gate");
		
		if (entrance==80 || main >=95) {
			System.out.println("any one get true true");
		}
		else {
			System.out.println("both are not true");
		}
//for loop 
		System.out.println("===for loop===");
		for (int i = 0; i <4 ; i++) {
			// continue = skip the particular iteration
			if (i==2) {
				continue;
			}
			System.out.println(i);
		}
//nested for loop
		
		System.out.println("===nested for loop===");
		
		for (int i = 0; i < 3; i++) {
			// braek = to terminate the loop in the middle;
			//break the loop i==1 //the o/p 1 is for j
			if (i==1) {
				break;
			}
			for (int j = 0; j < 2; j++) {
				System.out.println(j);
			}
			System.out.println(i);
		}
		//system.exit terminate entire program
		//System.exit(0);
		
		System.out.println("for(system.exit)");
		
		
		
	}
}


// if it has two more condition we use (and gate , or gate)
       // and gate === both condition should be statisfied
  // and && = logical faster check the first condition and give result
  // and &  = bitwise and check the both condition sloe

        // or gate == any one condition statisfied it print if sys
   // or || = logical ==fast
   // or | = bitwise ==slow




   
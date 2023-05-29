package org.control;

public class WhileAndDoWhile {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 0;
		
		while (i<10) {
			System.out.println(i);
			i++;
		}
		
		int j = 10;
		while (j>=0) {
			System.out.println(j);
			j--;
		}
		int k=0;
		do {
			System.out.println(k);
			k++;
		} while (k<5);
		
		int h =10;
		
		do {
			System.out.println(h);
			h--;
		} while (0<h);
		
		
		
		String name = "Dh";
		
		switch (name) {
		case "di":
			System.out.println("dickner");
			break;

case "Dh":
	System.out.println("dhinesh");
	break;

default:
	System.out.println("unknown");
	
	break;
		}
		
		int add = 300;
		
		switch (add) {
		case 100:
			System.out.println("1");
			break;
			
case 30:
			System.out.println("2");
			break;
case 300:
	System.out.println("3");
	break;

			
			
			
			

		default:
			System.out.println("0");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

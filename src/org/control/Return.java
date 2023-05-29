package org.control;

public class Return {
	
	
	private int add() {
		
		
		int x = 10;
		int y =20;
		
		int z = x+y;
		
  return z;
	}
   public static void main (String[] args) {
	   
//	   int d =10;
//	   int g =10;
//	   int h = d+g;
	   
//	   System.out.println(h);
	
	   Return r = new Return();
	   
	   int a = r.add();
	  System.out.println(a);
	  
	 // reverse interview question 
	  
	  String s = "reverse";
	  
	  StringBuffer s1 = new StringBuffer();
	  
	  StringBuffer append = s1.append(s);
	  
	  StringBuffer reverse = append.reverse();
	  System.out.println(reverse);
	  
	 //example 2
	    String str = "Hello, World!";
      StringBuilder sb = new StringBuilder(str);
     sb.reverse();
     String reversedStr = sb.toString();
   System.out.println(reversedStr);
   //example 3
   String name = "Dinesh";
   
   String empty = "";
   
   for (int i= name.length()-1;  i>=0 ; i--) {
	   
         empty=empty+name.charAt(i);
         // or empty=+name.charAt();
}
   System.out.println(empty);
		    
	
 
  
	}

}

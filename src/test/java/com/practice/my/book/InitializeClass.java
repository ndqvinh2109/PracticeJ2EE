package com.practice.my.book;

class Super {
    static { System.out.print("Super "); }
    final static int taxi = 1729;
}

class One {
    static { System.out.print("One "); }
}

class Two extends Super {
    static { System.out.print("Two "); }
    final static int subTaxi = 1000;
}

public class InitializeClass {
	
	public static void main(String[] args) {
		 /*One o = null;
	     Two t = new Two();
	     System.out.println((Object)o == (Object)t);*/
		/*System.out.println(Two.taxi);*/
		
		System.out.println(Two.subTaxi);
		
	}
}

package javacore_week3_part1;
/*
 * static : outside method but inside class
 *         no need to intitlize
 *         no need to create obiect 
 *         variable must be static keyword
 *         
 *non-static -outside method but inside class
 *no need to initilize
 *need to create while calling non static variable
 */
public class A {
	static int x1=10;
	static int x2;
	
	int y1=20;
	int y2;
	
	//global
	static A g1=null;
	static A g2 = new A();
public static void main(String[] args) {
	System.out.println(A.x1);
	System.out.println(A.x2);
	
	A a =new A();
	System.out.println(a.y1);
	System.out.println(a.y2);
	/*
	 * STACK ----which actually stores address of object
	 * HEAP------Which actually creates the object
	 * Garbase collector----it will removes the object from HEAP which address is not present in STACK
	 * (ideally how it will remove means when we create object and we call methods,variable etc when main-
	 * -method ends GC will remove the object from HEAP)
	 */
	/*
	 * local variable: it is created inside method only
	 *                 and you must need to initilize
	 *                 it is limited/accessable only that method
	 */
	int localVariable=100;
	System.out.println(localVariable);
	
	/*
	 * Refference variable: 1 --local refference variable
	 * 						2 --global refference variable
	 * this refference variable data type is class name
	 * it can be a null or object address
	 * 
	 * local : it is created inside method and accesable only that method
	 * global: it is created outside method but inside class with statoc keyword only
	 * 
	 * 
	 */
	//local
	A a2 = null;
	A a3=new A();
	System.out.println(a2);
	System.out.println(a3);
	
	System.out.println(g1);
	System.out.println(g2);
}

void test1() {
//	System.out.println(localVariable); accessable only that method
}
}

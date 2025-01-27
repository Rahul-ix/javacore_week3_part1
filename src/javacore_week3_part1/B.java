package javacore_week3_part1;
/*
 * data types--primitive and non primitive
 * primitive: int ,float,chat,boolean,long,double
 * non primitive --string array etc
 */
public class B {
	//primitive
	static int x1;
	static float x2;
	static long x3;
	static double x4;
	static char x5;
	static boolean x6;
public static void main(String[] args) {
	
	System.out.println(B.x1);
	System.out.println(B.x2);
	System.out.println(B.x3);
	System.out.println(B.x4);
	System.out.println(B.x5);
	System.out.println(B.x6);
	
	
	/*
	 * method : it is a block of code we can write and these method can be reusable
	 * method can be --void,int,float ,string etc
	 * if method is void not  wtire return value keyword but you can write return keyword i.e optional
	 * other than void you need to write return value keyword
	 */
	B.test1();
	B.test2(200);

}
//void method
static void test1() {
	System.out.println("void method");
	return;//optional
//	System.out.println("Hi a i'm unreachable code"); Unreachable code
}

static int test2(int x) {
	System.out.println("int method " + x);
	return x;//compulsory write
}
/*
 * return keyword : is used only for void method and it is optional
 *                : this return will call back to method calling statement
 * return value keyword: it is used other that than void method
 *                      : you need to write return value keyword
 */
/*
 * unreachable code- whatever we write that will not execute we call it as unreachable code
 * suppose after writing return /return value keyword
 */
}



Variable:-
Variable is a name of the memory location.

Types of Variables:
1.Local Variables
2.Instance Variables
3.static variable

1.Local Variables::--
 A variable which is declared and initilized inside a block is known as Local Variable.
 Note: A Local variable must be initilized
 eg:
 {
	 int i;  // Wrong
	 int i=100; // Correct
 }
 
 Example for Local variable
   public class Local_1{
	   
	   void localvariableMethod(){
		   
		   int i=100;// declare and initilized local variable
		   System.out.println(i); //o/p 100
		   i=200;// Reinitilized local variable
		   System.out.println(i);//o/p 200
	   }
	   public static void main(String...abc){
		   Local_1 lv=new Local_1();
		   lv.localvariableMethod();
	   }
   }
   public class Local_2{
	   int i=100;// instance variable
	   void localVariableMethod2(){
		   i=200;//reinitilized instance variable
		    System.out.println(i); //o/p 200
		   int i=500;// declare and initilized local variable
		    System.out.println(i); //o/p 500
	   }
	   public static void main(String..abc){
		   Local_2 lv2=new Local_2();
		   lv2.localVariableMethod2();
	   }
   }
   
 2.Instance Variable or Non static Variable:
 A variable which is declared inside a class and outside a block is know as INstance variable .
 
 public class InstanceVariable{
	 int a=1000;
	 int b;
	 void instanceMethod_1(){
	    System.out.println(a);// o/p 1000
		System.out.println(b);// o/p 0-->because we not initilized so we will get default value
		b=2000;
		System.out.println(b)// o/p 2000  Initilized instance variable b
		b=5000;
		System.out.println(b);// o/p 5000 reinintilized instance variable b
		a=7000;
		System.out.println(a);// o/p 7000 reinintilized instance variable a
		int a=-5000;
		System.out.println(a); // it is treated as local variable
		int a=-5000;// It is a local variable becuase it is inside block with declaration and initilization
		System.out.println(a); // it is treated as local variable
		a=8000;
		System.out.println(a);
	 }
	 public static void main(String...abc){
		 InstanceVariable obj=new InstanceVariable();
		 obj.instanceMethod_1();
	 }
 }
 
 static variable:
 
 static defines sharing the single memory locaton.
 A variable which is declared in class and outside the blocks with static key word is know as static variable.
 Note: static variables can reinitilize.
 calling of static variables in to non static method in two ways
 1.direct calling
 2.call by className.variable name
 
 public class StaticVariables{
	
	static int x=123;
	       int y=456;
		   void staticMethod(){
			   
			   System.out.println(StaticVariables.x);// op  123
			   System.out.println(y);// op  456
			   x=789;
			   System.out.println(x);
		   }
	public static void main(String...abc){
		StaticVariables obj=new StaticVariables();
		obj.staticMethod();
	}
}
 
Polymorphism:

Def:Polymorphism defines that a single action can be perform in diffrent ways.

  poly ----->many   morphism ---->forms

 polymorphism in two types:
==========================
1.Static Polymorphism (or) compile time Polymorphism.
   Static polymorphism can achieve through MethodOverloading.
2.Dynamic Polymorphism (or) RunTime polymorphism.
   Dynamic polymorphism can achieve through Methodoverriding.


Method Overloading:
------------------
def:Method Overloading means providing two seperate methods in a class with same name but diffrent types of arguments and diffrent order of arguments,while the method return type  may or may not be diffrent.

Note ***:In Method Overloading the methods going to get called will be decided by compile time.
   
 public class MethodOverLoading {

	void m1(int a) {
		System.out.println("I am only int");
	}

	void m1(String a) {
		System.out.println("I am only string");
	}

	void m1(int a, String b) {
		System.out.println("I am int and String");
	}

	void m1(int a, int b) {
		System.out.println("I am int and int");
	}

	

	/*void m1(float a, float b) {
		System.out.println("I am Float and Float");
	}*/

	void m1(double a, double b) {
		System.out.println("I am Double and Double");
	}

	void m1(int a, float b) {
		System.out.println("I am int and Float");
	}

	void m1(float a, double b) {
		System.out.println("I am Float and double");
	}
		void m1(float a) {
		System.out.println("i am float ");
	}
	void m1(double a) {
		System.out.println("I am Double");
	}

	public static void main(String[] args) {

		MethodOverLoading obj = new MethodOverLoading();
		obj.m1(10, 10);//int and int
		obj.m1(10);    //int
		obj.m1("Ram");  //String
		obj.m1(10,"Raj");//int String
		obj.m1(10.1f,20.1f);// float float----> float and double -->double and double
		obj.m1(200.254f,4852.256);// double double
		obj.m1(10.2f,500.250);// float double
		obj.m1( 452.10000f);
		obj.m1(45895.256);
		
  
	}

} 
 
 
 Method Overriding:
---------------------
Declaring a method in a subclass which is already present in parent class with same name same parameter list is known as method Overriding.(After java 5, you can also use a covariant type as the return type)

Note ***:Method overriding is also known as Runtime Polymorphism and  Dynamic Method Dispatch because the method that is going to be called is decided at runtime by the JVM.

Method Overriding Rules:
=========================
Similar to method overloading, we also have some mandatory and optional rules we need to follow to override a method.

With respect to the method it overrides, the overriding method must follow following mandatory rules:

*It must have the same method name.
*It must have the same arguments.
*It must have the same return type. From Java 5 onward, the return type can also be a subclass (subclasses are a covariant     type to their parents).
*It must not have a more restrictive access modifier (if parent --> protected then child --> private is not allowed).
*It must not throw new or broader checked exceptions.

And if both overriding methods follow the above mandatory rules, then they:

--May have a less restrictive access modifier (if parent --> protected then child --> public is allowed).
--May throw fewer or narrower checked exceptions or any unchecked exception.

Apart from the above rules, there are also some facts to keep in mind:

*Only inherited methods can be overridden. That means methods can be overridden only in child classes.
*Constructors and private methods are not inherited, so they cannot be overridden.
*Abstract methods must be overridden by the first concrete (non-abstract) subclass.
*final methods cannot be overridden.
*A subclass can use super.overridden_method() to call the superclass version of an overridden method.




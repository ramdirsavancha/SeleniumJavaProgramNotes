
What is Nested Class?
Ans:-Java Program allows you to define a class within another class.such a class is known as nested Class.
eg:
class Outer{
	...
	class Inner{
		...
	}
}
Eg:2
public class StaticOuter {

	class Inner1 {
		void m1() {
			System.out.println("I am Inner 1");
		}
		
		class Inner2 {
			
			void m2() {
				System.out.println("Ia m Inner 2");
			}

			class Inner3 {
				void m1() {
					System.out.println("I am Inner 3");
					Inner2.this.m2();
					Inner1.this.m1();
				}
			}

		}
	}

	public static void main(String[] args) {
		StaticOuter obj = new StaticOuter();
		new StaticOuter().new Inner1().new Inner2().new Inner3().m1();
	}
}
Nested classes are diffrentiate in two ways:
1.Non-static Nested Class(also known as Inner class)

 1.a.Local Classes or Method Inner class:A class which declare inside the method body is known as Local Class.
 1.b.Anonymus class: A class which declare inside the method body without name is known as Anonymus class. 

2.Static Nested Classes

 
 
 1--> Non static Nested class(Inner Class):
  -----------------------------------
  Def:- A class with out static modifier which declare inside a Outer class is know as non static nested class.
  class Outer{
	  class Inner{
		  
	  }
  }
  
  
  
  A class which declare inside the method body of a Inner class is known as Local Class or method Inner class.
  
  Points about NonStatic Inner class :
 ------------------------
**We cant declare static variables and static methods inside a nonstatic innerclass.
**We can declare non-static ,private and final variables. 
**We can add public,protected,default and private methods in non static Inner class. 
**Cant declare private variables inside a nonstatic method of nonstatic inner class.(Normally it becomes local variable)
**Can access Outer class all variables
**Can access Inner class all variables except static.
** Can access final and non static local variables(Inside a method).  
 
  
  points to remember:-
  -------------------
  *We can't declare static variables or static methods inside the non static inner class,only final static variables can be declare and cant declare final static methods (if we want declare static methods the inner class must be static ).
  class Outer{
	  class Inner{
		  static int i=10;// compilation error
		  final static int j=20;// It will execute
		  static void m1(){ // compilation error
			  
		  }
	  }
  }
  *We can access static ,non-static and private variable of outer class to non static inner class.
  class outer{
	  static int i=10;
	  int j=20;
	  private int k=30;
	  class Inner{
		  void m1(){
			    Sop(i+j+k);
		  }
		
	  }
  }
  *If we want access we can instantiate OuterClass obj=new Outer();-->Outer.Inner obj2=obj.Inner();-->
  
  1.a-->Local Inner class or Method Inner Class:
     A class which is create inside a method is known as Method Inner class or Local Inner Class.
	 public class MethodInnerOuterClass {
	
	void show() {
		System.out.println("I am Outer class show method");
		class LocalInnerClass{
			void display() {
				System.out.println("I am Local Inner class display method");
			}
		}
		LocalInnerClass li=new LocalInnerClass();
		li.display();
	}
	public static void main(String[] args) {
		
		new MethodInnerOuterClass().show();
	}
	

}

  
  1.b-->Anonymous Inner Class:
  
  A class with out name is known as Anonymous Innser class
  
 Two Types:
----------
 **Annonymous class extends a class
 **Annonymous class implements an interface
 Note :
 Here we will not use keywords explicitly implicitly JVM will extends .
 **By default annomous class is final.
  class Hotel{
	void eating() {
		System.out.println("I am having lunch");
	}
}
public class AnonymousClass2 {
	public static void main(String[] args) {
		
		Hotel h=new Hotel() {
			@Override
			void eating() {
				System.out.println("I am having dinner");
				super.eating();
			}
		};
		h.eating();
		Hotel h1=new Hotel() {
			
			void eating() {
				System.out.println("I am having Tea");
				super.eating();
			}
		};
		h1.eating();
		
	
		
	}
 	
}
  -- Annonymous class implements an interface
  
  
interface StarHotel{
	void drinking();
}
public class AnonymousClass3 {
	
	public static void main(String[] args) {
		StarHotel h1=new StarHotel() {
			
			
			public void drinking() {
				System.out.println("I am having tea");
				
			}
		};
		h1.drinking();
	}
 	
}
  
  Point to remember:
  
  * For instant use we can use Anonymous inner class
  * We can instantiate at one time
  *Wecan instantiate interface using ananymous class
  * A normal class Implements many interfaces but ananymous class can implements only one interface
  *A normal class can extends a single class and implements many interfaces but ananymous class cant  acess both ata time.
  *Anonymous will not contain the constructor because it doesn't have name.
  
  
  
 
 2-->Static Nested Class:-
 ------------------------
 A Nested class which define static ,inside a class is known as static Nested Class.

  class OuterClass{
	 static class InnerClass{
		 
	 }
	 
 }
 Note:
 We cant declare or initilize static methods or static variables iside a Non static Inner class.
 
 **Static Inner class can be instantiated as below and calling static and non static methods from static Inner class.
   Outer.Inner oi=new Outer.Inner();
   oi.staticMethod();
   oi.nonStaticMethod();
 *Directly a static class cant acess the non static members and methods(it can access through using object).
     eg:Outer class non static ,private ,final methods can acces only throgh oject.
 **A nested class increases encapsulation. Consider a class A whose members are declared private, but class B needs to access them. In that case we can hide class B in A and B can access members of A in spite of the fact that they are private. Also B can be hidden from outside world when declared private.
   

Points about Static Inner Class :
--------------------
**A non static method of static inner class can acess all type of variables at static inner class level.
** Directly we cant access private ,non static and final variables we want to create an object as Outerclass.InnerClass();
**Inner class can have all variable types.


 


 
 Note:-
 we can inherit Nested Class as below.............
 
 public class OuterClass {
    static class StaticNestedClass {
        void display() {
            System.out.println("Inside StaticNestedClass");
        }
    }
    class InnerClass {
        void display() {
            System.out.println("Inside InnerClass");
        }
    }
}
The following class extends Outerclass and its nested class also extends respective nested classes:

public class OuterClassDerivedClass extends OuterClass{
    static class StaticNestedDerivedClass extends OuterClass.StaticNestedClass {
        @Override
        void display() {
            System.out.println("Inside StaticNestedDerivedClass");
        }
    }
    class InnerDerivedClass extends OuterClass.InnerClass {
        @Override
        void display() {
            System.out.println("Inside InnerDerivedClass");
        }
    }
}
Now we can test these classes as:

public class InheritanceTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
        staticNestedClass.display();

        OuterClassDerivedClass outerClassDerivedClass = new OuterClassDerivedClass();
        OuterClassDerivedClass.InnerDerivedClass innerDerivedClass = outerClassDerivedClass.new InnerDerivedClass();
        innerDerivedClass.display();
        OuterClassDerivedClass.StaticNestedDerivedClass staticNestedDerivedClass = new OuterClassDerivedClass.StaticNestedDerivedClass();
        staticNestedDerivedClass.display();
    }
}
 


-----:Constructors:----

Def:-Constructor is a special method(similar to a method) used to initialize instance variables of the current class.
Note:Constructor is used to construct the values at the time of object creation.

* Every class in java contains Constructor except an interface.

***Rules to follow to write a constructor:-***
==============================================
1. Class name and Constructor name should be similar
  eg:  class A{
	  
			A(){
			
			}
		} 
2. constructor explicitly will not have a return type ,if we provide a return type explicitly to it obviosly consider as method.
 eg:  class A{
	  
		void A(){
			
			}
		}
 Note: For implicit constructor(default constructor) there will be a returntype that is also the current class.
  eg:  public  class Test{
	      // default constructor(which is created by compiler)
		  public Test Test(){
			  return new Test();
		  }
  }
  
3. explicit Constructor will not have a return statement 
4.we can't use acess specifiers as abstract,final static and synchronized	

***Important Points in constructors:-***
=========================================
1 About super():-


* In every constructor first statement is super()--(Means calling its super class constructor)

 eg:-- class Parent{
	        Parent(){
				System.out.println("I am Parent class constructor");
			}
		}
		class Child extends Parent{
			Child(){
				
			}
			psvm(String...abc){
				Child c=new Child();
				//op is  I am PArent class Constructor
			}
		}
1 About this():-	
 * this() is used to call current class constructor.

 
* We can use only one among of Super() and this() constructors inside a constructor.	
* Super() or this() should be written in the first line of a constructor.
  eg:  A{
	  A(){
		  this();// correct
		  
		  System.out.println("Hello");
		  this();// Compilation error.
	  }
  }
 
2. Constructer can be overloaded.
  eg:  class A{
	   A(int id){
		   
	   }
	   A(String name)
  }
  
3.Constructor can't be override.
4.Constructor can't be inherited. 
5. For every object constructor will invoke.
  
***Types of constructors:-***
  ======================
  1.Default Constructor
    * Default Constructor is written by a compiler implicitly when object created (it is invisible)
	*Access Specifier for a default contructor is same as class specifier.
	*The Access Specifier of the default constructor is same as the current class specifier.
	*Default Constructor depends on the current class Access Specifier.
  2.Non-Parameterized Constructors
	* Non-Parameterized Constructors are written by a user explicitly which seems same as a defult constructor.
	* Non-Parameterized Constructor is represented as without arguments.
	* diffrence b/n default and non-parameterized constructor is we can change the acess specifiler explicitly
	*Non-parameterized Constructor will not depend on the current class Access Specifier.
  
  3.Parameterized Constructors
  *Parameterized Constructor are written by a user explicitly 


***Constructor Chaining:-***
======================
Def:- A constructor calling multiple constructors is know as constructor chaining.
 class A{

                          int id;
                          String name;
                          float sal;
		   A(int a){
			  this("Ram"); // 2.Invokes String parm
                                                 this.id=a;
		   } A(String b){
			   this(5000.0f);//3. Invokes Float param
                                                   this.name=b;
		   } A( float c){
			this.sal=c;   
		   }
		   A obj=new A(10);//1.Invokes int parm
	   }
***Recursive constructor invocation:-***
==================================
Def: A cyclic constructor chaining is know as Recurssive Constructor Invocation.

 eg: class A-->class B-->class A
       class A{
		   A(int a){
			  this("Ram"); 
		   } A(String b){
			   this(5000.0f);
		   } A( float c){
			   this(20);
		   }
		   A obj=new A(10);
	   }
 
***Copy constructor:-***

class CopyExample{
String name;
   CopyExample( String name){
   this.name=name;
   }
    CopyExample( CopyExample ce){
    name=ce.name;
   }
   void display(){
	   System.out.println("Name is"+name);
   
   public static void main(String...abc){
	   CopyExample c1=new CopyExample("Ram");
	   c1.display();
	   CopyExample c2=new CopyExample(c1);
	   c2.display();
   }
}
  

Note:

What is the Diffrence between Parameterized method and parameterized Constuctor?

Parm Method:-In Param Method the values will be initilaized when we call explicitly
Parm Const:- In parm Constructor the values will be instialized at the time of object creation only.



		
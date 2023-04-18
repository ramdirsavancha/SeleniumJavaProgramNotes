----Type Casting----
Def:
Converting One datat type to another data type is known as Type Casting.

What is a Datat Type?

A data type represents a type of data which being to store. 

eg:
  int a; -->int represents that we can store Integer value.
  
  There are Two types of Data types:
  
  1. Primitive Data Types 
  2.Non-Primitive data types (or) Refrenceced Dtat Type (or) Advanced Data types
  
  1. Primitive a Data Types:
  
  Primitive data type define which stores the single type value.
  eg: int i=10;
  byte short int long float double char boolean.
  
  2. Non Primitive Data Types:
  Non primitive data type defines which stores multiple(group) values at a time.
  eg: Arrays,String,alsss etc...,
  Note :-
  We can call Non Primitive data types through their refrence only so Non-Primitve data types also called as Refrenced Data types.
  
  eg:-  String s="Hello";
  System.out.println(s);
  
  **We can convert one primitive data type in to another primitive datat type by using casting.
  ** We can convert one Non primitive data type to another Non-primitive data type using casting
  ** But we cannot convert Primitive data type to Non primitive data type by  casting,  for this we can use wrapper classes methods.

 Casting can be done in two ways :-
  1.Widening
  2.Narrowing
 1. Widening:-
     Converting smaller data type to higher data type is known as widening
	   eg:  byte--> short--> int--> long--> float--> double
	 
	    int x=100;
		float f=(float)x;-->o/p-- 100.0 -- implicitly casting
		
		char ch='a'
		int i=(int)ch;-->97 -- implicitly casting
Note:-In widening casting will be done implicitly by the compiler so it is also called Implicit casting.
  Cast operator means writing type of data inside brackets int i=(int)ch.
** Widening is safe because there will be no data loss.

2.Narrowing:
  Converting higer data type in to smaller data types is known as Narrowing
  eg:  byte<-- short<-- int<-- long<-- float<-- double
    int x=100;
	short s=(short)x;
	
	float f=200.00f;
	
	int i=(int)f;-- o/p  200
	
	int a=65;
	
	char ch=(char)a;--o/p A.
	
Note: In Narrowing casting should be done explicitly by the user so it is called Explicit casting.
** Explicitly programmer should write the casting operator otherwise compiler throws an error.
**There will be a data loss when we perform Explicit casting

      float f=  200.125f;
      int i=(int)f;--o/p:200  .125 is the datat loss
	  So why Explicit casting is not safe because of data loss,if it require then only we want to use explicit casting.

2.--*Non_Primitive Data Type*--	  
	One class type is converting in to another class type is known as Non Primitve or refrenced data type.
Note: The classes should contain relationship between them in the form of inheritance(IS-A-Relationship).

eg:  University--->college-->branch

  
  eg:
  class First{
	  
  }
  class Second extends First{
	  
  }
  ** First f=new First();  class First refrence f is reffering class First
  ** Second s=new Second(); class Second refrence s refrening to class Second
  In above two cases we not require casting....because left hand side and right hand side same type.
  
 When we require casting?
 If an type of object(class) is refrening to another type  of Object (class) then we require casting.
 
 eg 1:
 converting child class to parent class
 First f=new Second();--- child is pointing to parent
 Here child class Object is converted to a parent class Object is kown as widening or UpCasting
 
 child() ----->Parent() --upcasting---  its done implicitly by compiler internally it looks like First f=(First)new Two();
 
 eg2:
 Converting parent class to child class
 
   Second s=(Second) new First();--Parent is pointing to child   
   Here Parent object is converted to child object forcefully by using cast operator wich defines as narrowing and called as Downcasting.
    Parent() <-----Child()-- DownCasting(Its not safe because data loss occurs).We can perform only by using with refrence of Parent.Else we will get an Runt time Class Cast Exception.
  class First {

	void m1() {
		System.out.println("I am First class m1 method");
	}

	void m3() {
		System.out.println("I am First class m3 method");
	}
}

class Second extends First {
	void m1() {
		System.out.println("I am Second class m1 method");
	}

	void m2() {
		System.out.println("I am Second class m2 Method");
	}
}

public class TypeCasting {

	public static void main(String[] args) {

		First f1 = new Second();// Implicitly casting--UpCasting--widening
		f1.m1();
		f1.m3();
		Second s1=(Second)new First();// Ecplicitly casting --DownCasting--narrowing
		s1.m1();
		s1.m2();
		s1.m3();
		// So in narrowing user cant invok any method from parent or child ,will get 0 functionality  (Runtime Exception occurs)
		//we can ahevie above error as by using refrence obj of above
		
		Second s2=(Second)f1;
		

	}

}

Generalization and Localizaton:
===============================
Generalization defines that where subclass is promoted(converting) to super class and hence becomes more general is known as generlization.
                                 <-----scooter(sub-subclass1)
           <--------- Two Wheeler(subclass 1)
   Vehical(Parent)
          <---------- Four Wheeler(subclass 2) 
                                 <----- Car(sub-subclass2)
				
**We are talking about vehicle as general term and it may represent any type of vehicle(Two wheeler or Four Wheeler).Here the scope is widening.
**If we talk about two wheeler here we came one step down and we eleminate four wheeler means we are becoming more specific,if we still come down scooter.Here we are pointing exact vehicle (scooter) more specific.
**If we are going up from sub class to super class it becomes more general 
** Because we are becomes sub class as more general and scope is widening(UpCasting).It is safe.

Localization defines that where super class is converted to sub class and hence it becomes more genral form to specific form is known as localization.
**When we come from top to down means super class to child class it will be more specific means narrowing it is called as Downcasting.
**It is not safe and we cant use directly, we want to perform with refrence of the object as shown in above example.
				 
								 
								 

 
 
  
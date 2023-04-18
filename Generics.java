
What are the Generics?
Generics which represents type-safe.

Generic class:
A generic class which enables type of data to be parameters when defining clases interface and methods.

Benifits of generics over non generics:
-----------------------------------------
1.Stronger type check at compile time
  In java compiler checks the  strong type checking to generic code and  issues error if the code violates type saftey.
  
2.Elimination of casting
  List li=new ArrayList();
  li.add("Hello");
  String s=(String)li.get(0); //compilation error
  
  using generics
  List<String> li =new ArrayList<String>();
  li.add("Hello");
  System.out.println(li.get(0));// casting is not required

Note:
----
When generic class or generic interface is written, the programmer need not rewrite the same class or interface whenever  he wants to use the class or interface with a new data type.The same class or interface can work with any type of data.


The most commonly used type parameter names are:

E - Element (used extensively by the Java Collections Framework)
K - Key
N - Number
T - Type
V - Value
points to remember:
-------------------
*Generics are designed based on Objects it will not work on primitives.
*Since generics acts on any type of data seems we should not specify particular data while desigining the class.In that place of data type we want to use generic parameter like <T> etc.
   Eg:
     class MyClass <T>{
		 T name;    //----String name(with out generic)
		 T id;     //-------Integer id(with out generic)
		 
		 MyClass<String> obj=new MyClass<>();
		 MyClass<Integer> obj2=new MyClass<>();
	 }
	 
Note:
Whenever generic class or interface written java compiler internally creates non generic  version of the class or interface by substituting the specifies data type in plce of generic parameter T.This is called erasure.	 

class MyClass<T,E>{
 T name;
 E id;
 MyClass(T name,E id){this.name=name; this.id=id;}

public String toString(){
   return "Name is"+name+"Id is"+id;
}
public static void main(String...abc){
   MyClass<String,Integer> obj=new MyClass <String,Integer>("Ram",10);
System.out.println(obj.toString());
 	 	
}
}
Generic Method:
----------------
By writing the generic parameter before method return type the method become generic method.

class MyClass1{

 static <T>void m1(T[] arr){
    for(T ele:arr){
      System.out.println(ele);
   }
}

public static void main(String...abc){
  Integer arr1[]={100,200,300};
    MyClass1.m1(arr1);
  String arr2[]={"India","Hari","Ram"};
	MyClass1.m1(arr2);
 	 	
}
}

Generic Interface:
-------------------

interface Animal<T>{

void categoryOfAnimal(T animal);
 

}


class AnyAnimal<T> implements Animal<T>{
   public void categoryOfAnimal(T animal){
	String animalName=animal.getClass().getName();

       if(animalName.equals("Cat")){
         System.out.println("Cat is pet animal");
      }else if(animalName.equals("Liom")){
 	System.out.println("Lion is wild animal");
      }
	}
}
class Cat{
}
class Lion{}

class AnimalTest<T>implements Animal<T>{

   public static void main(String...abc){
Cat c=new Cat();
AnyAnimal<Cat> obj=new AnyAnimal<>();
   obj.categoryOfAnimal(c);

}
}

Bounded Types:
==============

class Customer<T>{----unbounded type
	Customer<String> c1=new Customer<>();
	Customer<Integer> c1=new Customer<>();
}

class Customer <T extends Number>{  ---Bounded type
	
}


	We can bound parameter for a particular range by using extends keyword such types are called Bounded types
	
	** In generics we can use extends keyword for interface also.
	
	** Single <?> is called an unbounded wildcard in generic and it can represent any type
Two types:
1.Upper Bounded : <child extends parent>
upper bounded by using <? extends T> where all Types must be sub-class of T 

2.Lower bounded :
 lower bounded using <? super T> where all Types required to be the super class of T, here T represent the lower bound.
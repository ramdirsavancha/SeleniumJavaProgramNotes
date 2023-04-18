

Abstraction:-

Def1:-Abstraction is art of hiding implementation details and show the essential details require by user.
Def2:-Abstraction is to extract essential details and enclose the non-essential details.

Note:  Abstraction hides the details at Design level 
       (Encapsulation hides the details at implementation level)

Eg:-

Note :- In java we can achieve Abstraction in two ways:
1. By using Interfaces and (Fully ABstraction)
2. By using Abstract classes(Partial Abstraction)

 Abstract classes:-
 A class which specify the keyword abstract is know as Abstract class which consist of abstract and non-abstract methods.
 A class which contains atleast one abstract method then the class treatd as Abstract class
 
 points to remember:-
 ---------------------
 *Abstract classes contains the constructor(to initilize instance variables)
 *Abstract class can't create an object,only child class can create an object.
* Override method in child class should be with in the scope (Access specifier)
 *If a child method not provide any implementation for abstarct method from abstract class then the child class becomes abstract class.
 *A Child class must override all unimplemented methods from its parent class.
 
 
 Diffrence between Abstraction and Interface:-
 
Interface:-                                                                                                                      
1.By default (implicitly) variables are  public static final                                             
2.All Methods by deault (implictly)are public abstract(If we not specify explictly jvm creates implicitly public abstract)
3.A overridden method from interface to a class should be with in the scope or same.  
4. Interface can't implements abstract class or any other classes.                                                            
*5.Multiple inheritance is possible                              
6. Interface can have parameterized abstract methods            
7. Interfaces will not contain constructors                       



Abstract:-
1.Any type of variables we can use(Acess specifier)eg: public,default,private,protected,final,static and non static.
2.Explicitly we should provide abstract for a method.
3.Want to use access specifier or overriden method with in  be declare as public(mandatory).
4. Abstract class can implements interface and can extends other classes.
*5.Multiple Inheritance is not possible.
6.Abstract class can have parameterized methods.
7.Abstract classes have the constructors to initilize non static variables
8.Abstarct classcan be instantiated for its subclass.

Why Abstract class cant instantiated eventhough it is having constructor?

Becuase Abstract class having abstract methods(Un implemented methods) so calling those method there will be no use.

When we will go Abstraction?

1.When ever requirments are not fully clear 
2.When ever a method will have diffrent implemntation

Note:The requirments which are clear and which are used to give diffrent implementation in its sub class then we will choose the abstraction
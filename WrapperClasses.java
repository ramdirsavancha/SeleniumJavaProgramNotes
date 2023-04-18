
Def:-Converting primitive to non primitive data using inbuilt classes is known as  Wrapper Classes.

**All wrapper classes are represented with naming convenction as Capital letter,and they implements serializable and comparable.

Primitive data Types        Wrapper classes
byte                             Byte
short                            Short
int                              Integer
float                            Float
long                             Long
double                           Double
char                             Character
boolean                          Boolean


Auto-Boxing:

Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an int to an Integer, a double to a Double, and so on. 

OR
Auto-Boxing defines that wrapping(converting) primitve data to an corresponding object(Non primitive )known as Auto-boxing

eg:-  int--->Integer

// ways to convert primitive to wrapper
		
		//1. without valueOf():
		Integer obj=new Integer(10);
		System.out.println(obj);
		
		//2.with valueOf()
		Integer obj1=Integer.valueOf(100);
		System.out.println(obj1);
		
		//3.Implicitly java compiler performs Autoboxing
			
		int i=200;
		Integer obj2=i;
		System.out.println(obj2);



Points :--
** Up to Java 10 there are two ways to convert primitive to corespondig object
  1.Through constructors
  2.Through valueOf().
   From java 11 onwards through the constructors was depricated (not in use).So we can convert by one way.
   (Note:If we create two same objects through constructor it will allocate two diffrent memory for those objects,
   If we use method then the for two similar objects then it will allocate single memory loaction at run time.)
   
** All wrapper classes are Immutable.(Cant modify the values).
**toString()can be performed only on object data.
eg:
public class First{

     void m1(){

     System.out.println("Hello");

    }

   public String toString(){

    return "Hello_123";

   }
  public static void main(String...abc){

    
   First obj=new First();

System.out.println(obj);


 }
}
** We can use coresponding primitive value or a string value.
   eg:
      Integer i=new Integer(100);
	  Integer i=new Integer("100");
	  Integer i=new Integer("");or Integer i=new Integer("a etc");---> throws the RunTime Exception as NumberFormatException.
	  


Un-Boxing:

=========
Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value is called unboxing. The Java compiler applies unboxing when an object of a wrapper class is:

Passed as a parameter to a method that expects a value of the corresponding primitive type.
Assigned to a variable of the corresponding primitive type.

OR
-Un-Boxing defines that unwrap primitive data from wrapped object known as un boxing:
-Converts an instance of wrapper class to its corresponding primitive type.

  
eg:-  Integer--->int
When we want to unbox the binded data we will use the corresponing value

eg:-- Integer---> int   It means return the Integer value as int
   Integer--->float  It means return the Integer value as float
    Integer--->byte  It means return the Integer value as byte
	 Integer--->short  It means return the Integer value as short
	  Integer--->long  It means return the Integer value as long
	
Integer obj=new Integer(10);
		int obj2=obj.intValue();
		System.out.println(obj2);	
	  
ValueOf()--> represents the instance of an primitive
eg:-Integer.valueOf(123)--> represents as object 123

toString()-->used to represent instance of string object which declared as int.

eg:-Integer.toString("123") represents as object 123
 	  
Hirarchy:-
=========	  
	                                 Object
									 
						Charcter Boolean   Number
                                           Byte Short Integer Long Float Double						
   
Utility Methods:
===============
1.valueOf()
2.intValue()
3.parseInt()
4.toString()

1.ValueOf():-

This is one way to convert primitive to coresponding wrapper class object.
eg:
    int a=100;
	Integer obj=Integer.valueOf(a);
	
2.value():

This is to convert wrapper object to its corresponding primitive	
   Integer i=new Integer(100);
   int obj=i.intValue();
   System.out.println(obj);
   
    we can call byteValue(),shortValue(),intValue(),longValue(),floatValue(),doubleValue()....
   
3.parseInt-
  Converts Wrapper class object String related data in to coreesponding primitive value
  int i=Integer.parseInt("100");
  float f=Float.parseFloat("200.00f")
  
eg: parseByte(),parseShort()parseInt(),parseFloat(),parseDouble()....etc
   
4.toString():-

Is used to convert the object string represent data in to a string formate.
  
  
  Integer i=new Integer(100);
  Sysop(i.toString());
  or
  String s=i.toString();
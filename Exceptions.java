Exceptions:

What is an Exception?

An Exception is an event which occurs during the execution of program that disrupts(disturb) the normal flow of instructions.Exceptions can recover.(Exceptions occurs due to wrong code or assumption code wriiten or caused by program).

What is an Error?

An Error is a subclass of Throwable defines that a serious problem that a reasonable appliaction should not try to catch.Error is a non recoverable.(eg: running out of memory).

 An error is human made mistake.

Three types of errors:
1.Comple time error:-->Synatical errors;
2.Runtime  error:-->
eg:
class Hello{
	public static void main(){--> run time error
		System.out.println("I am Hello Class");
	}
}
3.Logical error:
class Banking{
	psvm(String...abc){
		double creditLimit=150000.00;
		creditLimit=creditLimit*5/100;--> wrong logic
	 // One way
		//credit+=credit*5/100;
		//System.out.println(credit);
		// Second Way
		 double finalValue=credit*5/100;
		  double AfterIntrest=credit+finalValue;
		System.out.println(AfterIntrest);
	}
}



**When an exception occurs within a method, the method creates an object and hand over it to the runtime system. The object, called an exception object, contains information about the exception, including its type and the state of the program when the exception occurred. Creating an exception object and handing it to the runtime system is called throwing an exception.

**After a method throws an exception, the runtime system attempts to find something to handle it. The set of possible ways to handle the exception is the ordered list of methods that had been called to get to the method where the error occurred. The list of methods is known as the call stack.
methodWhereErrorOccur-->

**The runtime system searches the call stack for a method that contains a block of code that can handle the exception. This block of code is called an exception handler. 


* In call stack storage will be LIFO(Last In First Out)manner.
Points

*After terminating manin method from call stack the jvm handles to default exception handler to handle the exception(print message in console) and it terminates program abnormally.

eg:
class Except{  // Program is Abnormal Terminaton
	psvm(String...abc){
	void grandFather(){
		father();
	}
	void father(){
		son();
	}
	void son(){
		Sop("I want money"+100/0);// exception occured Arthmetic Exception
	}
	}
}
class Except{  //Program is Abnormal Terminaton
	psvm(String...abc){
	void grandFather(){
		father();
	}
	void father(){
		son();
	}
	void son(){
		Sop("I want money"+100/0);// exception occured Arthmetic Exception
	}
	}
}
class Except{    // Program is normal termination
	psvm(String...abc){
	void grandFather(){ // this method only normal termination
		father();
	}
	void father(){
		son();
		Sop("I am in chennai"); // this method only normal termination
	}
	void son(){
		Sop("I am in Bangalore"); // this method only normal termination
	}
	}
}
Note :
If a single method terminates abnormally the total program become abnormal termination,if all methods terminates normally then only it clled as normal termination.

Eg:
In above example it is terminating abnormally at method son.So it is abnormal termination.
If there is no termination in any method then it is known as noramll termination.
 main-->grandFather-->father-->son
 
 in stack storage: main()-->grandFather()-->father()-->son()
 
 
 
 
 
Default Exception Handler:
=========================
It is used to print the information by using printStackTrace() and terminate the program abnormally.

***Hierarchy***
===============
                                          Object
                                        Throwable
						 Exception                                                                              Error
						 
   (Checked Exception--(Compile Time Exception)**Unchecked Exception (Run Time Exception))		



Checked Exception:(Compile Time Exception)

1.IO Exception
2.SQLException
3.ClassNotFoundException


UnChecked Exception(Run time Exception):
1.ArithmaticException
2.ClassCastException 
3.IndexOutOfBoundsException
  3.1 ArrayIndexOutOfBoundsException
  3.2 StringIndexOutOfBoundsExcepton  
4.NullPointerException  


What is diffrence between Checked and UnChecked Exception?

The Exception which is checked by the compiler for smooth execution of the program at Runtime is known as Cheked Exception(The programmer should handle).
  --When we are dealing with outside resources then we will get CheckedException
  --In program if exception occured  we should handle through try catch or throws keyword
  
  class UnChekedException{
	  ps void main(String...abc){
	  PrintWriter pw=nw PrintWriter(Java.txt);// throws the exceptions at compile time only 
	  pw.println("I am in bangalore");
	  }
  }
  
The Exceptions which are not checked by the compiler is known as Un-Checked Exceptions.(Wether the programmer handle or not) .
  --When we are dealing with internal resource then we will get an UnChecked Exception. 
   class ChekedException{
	  ps void main(String...abc){ throws FileNotFoundException 
	  PrintWriter pw=nw PrintWriter(Java.txt);// throws the exceptions at Run time  that File not found
	  pw.println("I am in bangalore");
	  }
  }
  
  Note:
  Is it Checked or UnChecked it will occur at RunTime Only not in compile time.
  
  
 
 
  
  
  class TryCatch{
	  psvm(String...abc){
		  Sop("DataBase Started");
		  try{
			  sop(10/0);
		  }catch(ArthmeticException e)
		  e.printStackTrace();
		  sop("Database Closed")
	  }
  }
  
  try-Catch():-
  =============
  try is a block which consit of statments(Exceptions may rise statements);
  try block must be follow catch or finally block
  catch block is used handle the exception by declaring the specific type of exception with its parameter raised at try block.
  The catch block must be specified after the try block,and multiple catch blocks can be written after the try block.
  
  controlFlow:
  -----------
  try{
	  1--exception and coresspoonding handle code raise 
	  2
	  3
  }catch(Exception e){
	  4
  }
  5
  o/p: 4,5
  If exception raised at 2 and not having coresponing codeop:1,5
  **In try block if exception raised remaining code in try block will not ececuted even though if we handle through catch block
  **Exception raised in catch block 
  * For Every exception should maintain seperate catch block
  class Abc{
	  try{
		 Sop(1/0) 
	  }catch(ArthmeticException ar){
		  ar.printStackTrace();
	  }catch(FileNotFound e){
		  e.printStackTrace();
	  }
	  
  }
 **If Multiple catch blocks are there then the order of the catch blocks should be from child as first and Parent as last. 
** We should note create two catch block of same exception compiler throws an error.  
  Methods to print:
  1.printStackTrace()-- we will get Name of exception and full information
  2.sop();  we will get name of exception only
  3.e.getMessage() we will get only the message which cause the exception eg: /Zero
  
  Diffrence between final and finally and finalize?
  
  If a class uses final modifier then we cant inherit the class
  If a method declared as final we cant override
  If a variable is final we cant re assign the value.
  
  Finally block is independent of an exception raised in our program(means if exception raised or not finally block will executes).Finally is related to try block.The resources which are opened in try block we can close in finally block.
  
  Finalize block Called by the garbage collector on an object when garbage collection determines that there are no more references to the objects.Finalize is related to the resourses which are assosiated to objects
  
  Eg:
  
1. try{
	  
  }catch(Exception e)  // valid 
2.try{
	  
  }catch(Exception e){
	  
  }catch(Exception e)// Invalid
3.try{
	
}catch(ArthmeticException e){
	
}catch(Exception)// valid
4.try{
	
}catch(Exception e){
	
}catch(ArthmeticException e)// In valid

5.try{
	
}catch(){
	
}finally{
	
}// valid
6.try{
	
}finally{
	
}// valid
7.try{
	
}// In valid CE
8.catch(){
	
}//Invalid CE
9.finally{
	
}//Invalid CE

 Throw Keyword:
 --------------
 *It is used to give our own userdefined exception
 *We can create an exception object explicitly and handover to JVM
 public class FirstProg3 {

	public static void main(String[] args) {
		Sop(1/0);    //Implicitly raised exception
          
	}
}
public class FirstProg3 {

	public static void main(String[] args) {
          throw new ArithmeticException();  // Explicitly throw the exception to JVM
	}
}

*we can use majorly throw keyword for user defined exceptions

class Prog5{
	
	public void findLength(String s){
		
		System.out.println("find length method");
		try{
			System.out.println(s.length());
		}catch(NullPointerException e){
			System.out.println("null is not input "+e);
			throw e;
		}
	}
	
	public static void main(String...abc){
		System.out.println("main method");
		
		Prog5 p5=new Prog5();
		p5.findLength("Hello");
		p5.findLength(null);
		System.out.println("Completed");// will not print
	}
}
* Once we write throw exception then next statments after that will not compile,it throws compile time error.
  
  Throws Keyword:
  -------------
  *It bypass the  exception from user to JVM(may be client) through method
  public class FirstProg3 {

	public static void main(String[] args) throws ArithmaticException{
		Sop(1/0);    
          
	}
}
*Throws Keyword is only for checked Exceptions
*without try catch we can use throws keyword on method level
Eg:
public class FirstProg5 {
public static void main(String[] args) throws FileNotFoundException {

		PrintWriter pWriter =new PrintWriter("c:desktop");
	
	
	System.out.println("Completed");
}
}
*We can use throws keyword for method and constructor level but not at class level
*we can prefer for try catch istead of throws
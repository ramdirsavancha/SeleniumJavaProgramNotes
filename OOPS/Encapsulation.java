Encapsulation:--
def:-Encapsulating(combining) or binding data (variables)and methods in to a single unit is called Partilally Encapsulation
def2:- A class is fully encapsulated when data and method are comibined in to single unit as well data should be hide(by providing private we can hide).

Note: Encapsulation hide the details at implementation level

 Rules to follow for fully Encapsulated:-
 
 1. non static Variables should be declared as private
 2.Should maintain the class in POJO(Plain Old Java Object) design pattren
    eg: providing setters and getters
	Note: Depending on requirment basis only we can provide setters(Write Operation) or else we can provide getters(Read operation)
Q:-How can we make a class as encapsulated?
  By making class with POJO design pattren(means providing setters and getters) and declaring variables as private we can make a class encapsulated.
   
   Benifits:
   1 we can provide read only or write only operation,we can acheive through setters and getters
   2.We can restrict the users on access
Eg:
public class Employee{
	private String name;
	private int id;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
}

class EmployeeTest{
	public static void main(){
		Employee e1=new Employee();
		e1.setName("Ram");
		System.out.println(e1.getName());
		e1.setId(101);
		System.out.println(e1.getId());
	}
}	
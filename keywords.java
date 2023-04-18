static keyword:
-------------
In java static is a reserved keyword which shares the single memory allocation.
*static keyword is related to memory managment
*If we want to use memory efficiently we can use static keyword
*static can be given to variables methods and nested classes
*cant given static to outer class.

When we need use static?

When ever we are having common properites then we want provide static fields.

eg: without static:
------------------

class A{

     String comp_name="TCS";
     String emp_name;
     int emp_id;

    A(String name,int id){
      this.emp_name=name;
      this.emp_id=id;

   }
void display(){

  System.out.println("Emp_Name is:"+emp_name+"Emp_Id is:"+emp_id+"company Name is:"+comp_name);
}

public static void main(String...abc){
   	A emp1=new A("Hari",101);
	A emp2=new A("Tom",200);
	A emp3=new A("John",300);

   emp1.display();//o/p->Hari 101  TCS

 }
}

In the Above class for every object it will create name of emp and id of emp as well company name of emp(Actually here companay is common property so internally jvm allocate memory for all three properties every time when we create an object).
To overcome that problem(memory managemnt) we will declare common fields as static(Then that static filed creates memory at once and all objects reuse the commaon property field).

eg:  static String comp_name="TCS";
  

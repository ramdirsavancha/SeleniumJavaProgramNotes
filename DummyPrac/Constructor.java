public class Constructor{
     Constructor(){
    super();
      System.out.println("I am outside main method");

   }

          public static void main(String...abc){
            System.out.println("I am Main method Constructor");
    
        Constructor c=new Constructor();
         


}




}
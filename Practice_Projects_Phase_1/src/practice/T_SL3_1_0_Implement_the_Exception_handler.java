package practice;

public class T_SL3_1_0_Implement_the_Exception_handler {
	 public static void main(String args[]){
			try{
				System.out.println("Starting of try block");
				// I'm throwing the custom exception using throw
				throw new MyException("This is My error Message");
			}
			catch(MyException exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}}}
	class MyException extends Exception{
		   String str1;
		   MyException(String str2) {
			str1=str2;
		   }
		   public String toString(){ 
			return ("MyException Occurred: "+str1) ;
		   }
		}
		
		  



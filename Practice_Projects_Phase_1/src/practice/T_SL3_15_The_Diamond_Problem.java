package practice;

interface First 
{  
    default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
} 
public class T_SL3_15_The_Diamond_Problem implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 


	 
	
	    public static void main(String args[]) 
	    { 
	    	T_SL3_15_The_Diamond_Problem ob = new T_SL3_15_The_Diamond_Problem(); 
	        ob.show(); 
	    } 
	

}

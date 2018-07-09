package mypackage;
import java.util.*;

public class pallindrome {
   
	public String sample;
	private ArrayList<Character> literals;
	

	pallindrome()
	{
		literals = new ArrayList<Character>();
		//this.sample = sample;
	}
    
	public void setSample(String sample)
	{
    	this.sample = sample;

    }
   public void getSample()
   {
      System.out.println("Your String : " + sample);
   }
   
   public void Lite()
   {   
	   for( int i= 0; i<sample.length();i++)
	   {
		   //System.out.println(sample.charAt(i));
		   literals.add(sample.charAt(i));		   
	   }	   
   }
   
   
   public void testPallindrome()
   {
	   int i = 0;
	   //System.out.println(literals.size());
	   for(; i<=literals.size()/2;i++)
	   {
		   if(literals.get(i)!=literals.get(literals.size()-1-i))
			   break;
	   }
	   
	   if(i>literals.size()/2)
		   System.out.println("String is a Pallindrome!");
	   else
		   System.out.println("String is not a Pallindrome");
   }
}
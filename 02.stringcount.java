import java.util.*;
class string
	{
    	public static void main(String args[]){
    	String s="";
    	int count=0;
    	Scanner obj=new Scanner(System.in);
    	System.out.println("enter a string");
    	s=obj.nextLine();
    	System.out.println("enter a character");
    	char c=obj.nextLine().charAt(0);
    	for(int i=0;i<s.length();i++)
	    {
		    if(c==s.charAt(i))
	      	{
		      	count++;
		      }
	    }
    	System.out.println(count);
  }
}

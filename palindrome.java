import java.util.*;
class palindrome
	{
	public static void main(String args[]){
	String s="";
	int Len=0,flag=0,j=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter a string");
	s=obj.nextLine();
	Len=s.length();
	for(int i=Len-1;i>=0;i--)
		{
			if(s.charAt(i)!=s.charAt(j))
		{
			System.out.println("not palindrome");
			flag=1;
			break;
		}
		j++;
	}
	if(flag==0)
		{
			System.out.println("entered string is a palindrome");
		}
}
	
}

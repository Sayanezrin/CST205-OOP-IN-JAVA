import java.util.*;


class employe
	{
	String name;
	int age;
	int ph;
	String address;
	int salary;
	employe(String a,int b,int c,String add,int sal)
{
		name=a;
		age=b;
		ph=c;
		address=add;
		salary=sal;
}
		void printsalary()
		{
			System.out.println("SALARY"+salary);
		}
	  }
class officer extends employe
	  {
		String specialization;
                officer(String name,int age,int ph,String address,int salary,String specialization)
	{
		super(name,age,ph,address,salary);
		this.specialization=specialization;
	}

void print()
	{
		System.out.println("OFFICER\t");
		System.out.println("NAME\t"+name);
		System.out.println("AGE\t"+age);
		System.out.println("PH\t"+ph);
		System.out.println("ADDRESS\t"+address);
		super.printsalary();
		System.out.println("SPECIALIZATION\t"+specialization);
		
	}
}
class manager extends employe
	{
	String deapartment;
	manager(String name,int age,int ph,String address,int salary,String deapartment)	
	{
		super(name,age,ph,address,salary);
		this.deapartment=deapartment;
	}
	void printm()
	{
		System.out.println("MANAGER\t");
		System.out.println("NAME\t"+name);
		System.out.println("AGE\t"+age);
		System.out.println("PH\t"+ph);
		System.out.println("ADDRESS\t"+address);
		printsalary();
		System.out.println("DEPARTMENT\t"+deapartment);
	}
}
class A
	{
	public static void main(String args[])
{
        String name;
	int age;
	int ph;
	String address;
	int salary;
	String specialization;
	String department;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the name of manager:");
	name=input.nextLine();
	System.out.println("Enter the age of manager:");
	age=input.nextInt();
	System.out.println("Enter the ph of manager:");
	ph=input.nextInt();
	System.out.println("Enter the salary of manager:");
	salary=input.nextInt();
	System.out.println();
	System.out.println("Enter the address of manager:");
	input.nextLine();
	address=input.nextLine();
	
	
	System.out.println("Enter the department of manager:");
	
	department=input.nextLine();
	System.out.println("Enter the name of officer:");
	name=input.nextLine();
	System.out.println("Enter the age of officer:");
	age=input.nextInt();
	System.out.println("Enter the ph of officer:");
	ph=input.nextInt();
	System.out.println("Enter the address of officer:");
	address=input.nextLine();
	address=input.nextLine();
	System.out.println("Enter the salary of officer:");
	salary=input.nextInt();
	System.out.println("Enter the specialization of officer:");
	specialization=input.nextLine();
	specialization=input.nextLine();

	manager man=new manager(name,age,ph,address,salary,department);
	man.printm();
	officer off=new officer(name,age,ph,address,salary,specialization);
	off.print();
}}

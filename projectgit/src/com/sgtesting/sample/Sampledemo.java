package com.sgtesting.sample;
abstract class Employee
{
	Employee(String ename)
	{
		System.out.println("Employee Name:"+ename);
	}
}
class Department extends Employee
{
	Department(String name)
	{
		super(name);
	}
}
public class Sampledemo {

	public static void main(String[] args)
	{
		Department oh=new Department("Arun");
		

	}

}

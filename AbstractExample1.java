package myprogramz;

public class AbstractExample1
{
	
	public static void main(String args[])
	{
	Racoon racoon=new Racoon("Racoon");
	racoon.eat();		
	racoon.breathe();
	}
	abstract class Food{//abstract class
	private String name;
	public Food  (String name) 
	{
	this.name=name;
	}
	public abstract void eat();//abstract method
	public abstract void breathe();//abstract method
	public String getName()
	{
	return name;
	}
}
	class Racoon extends Food
	{
	public Racoon(String name)
	{
	super(name);//call superclass 
	}
	public void eat()
	{
	System.out.println(getName()+" is eating");
	}
	public void breathe(){
	System.out.println("breathe in,breathe out,repeat");
	}
	}







package org.totalbeginner.tutorial;

public class Person {
	
	//hello I am test 
    //fields
	private String name; //name of the person
	private int maximumBooks; //most book person can check out
	//constructor
	public Person()
	{
		name ="unknown name";
		maximumBooks = 3;
	}
	//Methods
	public String getName()
	{
		return name;
	}
	public void setName(String anyName) {
		name= anyName;
		
		
	}
	public int getMaximumBooks() {
		return maximumBooks;
	}
	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
}

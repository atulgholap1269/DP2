package com.containmentAssignment;
 class Person
 {
	 String name;
	 char gender;
	 int age;
	 Address ad;
	 static void display()
	 {
		 System.out.println("person static method");
	 }
//	 public Person( String name,char gender,int age, Address ad )
//	 {
//		 this.name=name;
//		 this.gender=gender;
//		 this.age=age;
//		 this.ad=ad;
//	 }
	 public String toString()
	 {
		 return name+" "+gender+" "+age+" "+ad;
	 }
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 public void setGender(char gender)
	 {
		 this.gender=gender;
	 }
	 public void setAge(int age)
	 {
		 this.age=age;
	 }
	 public void setAddress(Address ad)
	 {
		 this.ad=ad;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public char getGender()
	 {
		 return gender;
	 }
	 public int getAge()
	 {
		 return age;
	 }
	 public Address getAddress()
	 {
		 return ad;
	 }
 }
public class Address extends Person
{
	 String city;
	 String state;
	 String country;
	 static void display()
	 {
		 System.out.println("Address static method");
	 }
//	 Address(String city, String state, String country )
//	 {
//		this.city=city;
//		this.country=country;
//		this.state=state;
//	 }
	 public String toString()
	 {
		 return city+" "+state+" "+country;
	 }
     public void setCity(String city)
     {
    	 this.city=city;
     }
     public void setState(String state)
     {
    	 this.state=state;
    	
     }
     public void setCountry(String country)
     {
    	 this.country=country;
     }
     public String getCity()
     {
    	 return city;
     }
     public String getState()
     {
    	 return state;
     }
     public String getCountry()
     {
    	 return country;
     }
     public static void main(String[] args) {
//		Person p= new Person("Atul Gholap", 'M', 27,new Address("Parner", "Maharastra", "India") );
//	    System.out.println(p);
    	Person p= new Person();
	    p.setName("Atul Gholap");
	    p.setGender('M');
	    p.setAge(27);
	    p.setAddress(new Address());
	    Address a= p.getAddress();
	    a.setCity("Parner");
	    a.setState("Maharastra");
	    a.setCountry("India");
	    System.out.println(p.getName());
	    System.out.println(p.getGender());
	    System.out.println(p.getAge());
	    System.out.println(a.getCity());
	    System.out.println(a.getState());
	    System.out.println(a.getCountry());
	    Address.display();
	    Person.display();
	    
	}
}

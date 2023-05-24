package com.containmentAssignment;

class Institute
{
	int id=11;
	String name="Trinity Academy";
	
}
class Branch
{
	int id =12;
	String name="Mech";
}
class Subject
{
	int id =13;
	String name="SOM";
}
class Topic
{
	int id =14;
	String name="Shear force";
}
class Question
{
	int id=15;
	String name=" What is shear force";
}
public class ContainmentUse {
	public static void main(String[] args) {
//One class object utilize other class object for its creation/execution.
//It shows ‘has-a’ relationship between classes.
//To achieve containment: Inside your class you have to define one of the attribute-type of other class

		Institute i= new Institute();
		System.out.println(i.id+" "+i.name);
		Branch b= new Branch();
		System.out.println(b.id+" "+b.name);
		Subject s= new Subject();
		System.out.println(s.id+" "+s.name);
		Topic t= new Topic();
		System.out.println(t.id+" "+t.name);	
		Question q= new Question  ();
		System.out.println(q.id+" "+q.name);
	}

}

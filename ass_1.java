class student
{

	int roll;
	String name;
	float marks;
	void input()
	{
		roll=55;
		name="SASI";
		marks=98.5f;
	}
	void display()
	{
		System.out.println("Rolll no:"+roll);
		System.out.println("Name is:"+name);
		System.out.println("Marks :"+marks);
	}
}
class ass_1
{
	public static void main(String args[])
	{
	student s1=new student();
	s1.input();
	s1.display();
	}
}
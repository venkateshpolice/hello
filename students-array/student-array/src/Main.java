import java.util.Date;
public class Main {

	public static void main(String[] args) {
		
	Date currentD=new Date();
	StudentGroup s=new StudentGroup(5);
	String g="venkatesh";
	Student s1=new Student(121293,g,currentD,9.7);
	Student s2=new Student(123456,"ganesh",currentD,10);
	//s.add(s1,0);
	//s.add(s1,1);
	Student[] sg=new Student[2];
	sg[0]=s1;
	sg[1]=s2;
	s.setStudents(sg);
	Student a[]=s.getStudents();
	System.out.println(a.length);
	for(int i=0;i<a.length;i++)
	{
	Student b=a[i];
	System.out.println(b.getId());
	}
	Student ex=s.getStudent(1);
	System.out.println(ex.getId());
	}

}

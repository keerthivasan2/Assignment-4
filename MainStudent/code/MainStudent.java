import java.util.*;
class Student implements Comparator<Student>{
	String stname;
	int stid;
	double att;
		public int compare(Student s1, Student s2){
		return s1.stname.compareTo(s2.stname);
	}
	Student(String stname,int stid,double att)
	{
		this.stname=stname;
		this.stid=stid;
		this.att=att;
			}
	Student(){
	}
	public String toString()
	{
		return "Student Name :"+stname+",Student ID :"+stid+",Attendance :"+att;
	}
}
class MainStudent
{
	public static void main(String...args)
	{
		LinkedList<Student> s=new LinkedList<Student>();
		Student s1= new Student("Keerthivasan",410,88.8);
		Student s2=new Student("Anbu",400,98.8);
		Student s3=new Student("Naveen",420,56.6);
		s.add(s1);
		s.add(s2);
		s.add(s3);
		Collections.sort(s,new Student());
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
package TreeSort;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student{
	int sid;
	String sname;
	float sfees;
	public Student(int sid, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
}

class SortId implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.sid<s2.sid)
		return -1;
		else if(s1.sid>s2.sid)
			return 1;
		else
			return 0;
	}
	
}

public class StudentMain {

	public static void main(String[] args) {
		SortId sob=new SortId();
		TreeSet<Student> st=new TreeSet<>(sob);
		Student s1=new Student(4,"Jeba",8768);
		Student s2=new Student(1,"Gokul",18768);
		Student s3=new Student(9,"Shiv",165768);
		Student s4=new Student(2,"Gopika",436576);
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		
		System.out.println(st);
		
		System.out.println("Using Iterator");
		Iterator<Student> it=st.iterator();
		
		System.out.println("SID\tSNAME\tSFEES");
		while(it.hasNext()){
			Student ob=it.next();
			System.out.println(ob.sid+"\t"+ob.sname+"\t"+ob.sfees);
		}
				
		
	}

}

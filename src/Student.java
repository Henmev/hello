import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;


public class Student{
	int id;
	int grade;
	public Student(int i,int j){
		id = i;
		grade = j;
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}


	public String toString(){
		String s = new Integer(id).toString();
		String s2 = new Integer(grade).toString();
		return s + " " + s2;
	}

	public static void main(String[] args){
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student b1 = new Student(123,23);
		Student b2 = new Student(234,21);
		Student b3 = new Student(334,100);
		Student b4 = new Student(100,95);
		Student b5 = new Student(100,93);
		arrayList.add(b1);
		arrayList.add(b2);
		arrayList.add(b3);
		arrayList.add(b4);
		arrayList.add(b5);

		Collections.sort(arrayList, new Comparator<Student>() {
			public int compare(Student arg0, Student arg1) {

				if(arg0.id > arg1.id)
					return 1;
				else
				return -1;
			}
		});
		
		
		for(Student student: arrayList){
			System.out.println(student.id + " " + student.grade);
		}

	}
}



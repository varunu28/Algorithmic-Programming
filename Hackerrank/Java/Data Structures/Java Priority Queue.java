import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * Create the Student and Priorities classes here.
 */

class Student {
    int id;
    String name;
    double cgpa;
    
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getCGPA() {
        return this.cgpa;
    }
}

class Priorities {
    PriorityQueue<Student> queue =
                          new PriorityQueue<Student>(new PriorityQueue<Student>(Comparator.
					                        		    							comparing(Student::getCGPA).
					                        		    							reversed()
					                        		    							.thenComparing(Student::getName)
					                        		    							.thenComparing(Student::getID)));
    List<Student> ans = new ArrayList<>();
    
	public List<Student> getStudents(List<String> events) {
		for (String event : events) {
			if ("SERVED".equals(event)) {
				queue.poll();
			}
			else {
				String[] strs = event.split("\\s+");
				Student s = new Student(Integer.parseInt(strs[3]), strs[1], Double.parseDouble(strs[2]));
				queue.add(s);
			}
		}
		
		Student s = queue.poll();
		if (s == null) {
			return ans;
		}
		else {
			while (s != null) {
				ans.add(s);
				s = queue.poll();
			}
		}
		
		return ans;
	}
	
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}


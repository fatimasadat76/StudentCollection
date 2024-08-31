package Student;

	
public class Student {
	

	    String firstName;
	    String lastName;
	    int age;
	    double grade;

	    public Student(String firstName, String lastName, int age, double grade) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	        this.grade = grade;
	    }

	    

		@Override
	    public String toString() {
	        return firstName + " " + lastName + ", Age: " + age + ", Grade: " + grade;
	    }
	}

	


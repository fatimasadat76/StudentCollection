package Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class Main {

	public static void main(String[] args) {
		
		        List<Student> students = new ArrayList<>();
		        students.add(new Student("Fatemeh", "Mousavi", 26, 20));
		        students.add(new Student("Sara", "Hendo", 19, 9.0));
		        students.add(new Student("Kourosh", "Zarandooz", 18, 14.5));
		        students.add(new Student("Sama", "Jafari", 17, 19.5));
		        students.add(new Student("Reza", "Karimi", 18, 15.0));
		        students.add(new Student("Farzad", "Omidy", 16, 9.0));
		        students.add(new Student("Neda", "Hosseini", 20, 8.5));
		        students.add(new Student("Iman", "Alaleh", 17, 8.75));
		        students.add(new Student("Mina", "Jafari", 16, 11.0));
		        students.add(new Student("Mahsa", "Azadi", 15, 14.75));
		        students.add(new Student("Elnaz", "Hemati", 16, 13.90));
		        students.add(new Student("David", "Elahi", 18, 18.0));
		        students.add(new Student("karoon", "Esmaeely", 17, 17.5));
		        students.add(new Student("Farhad", "Asady", 16, 12.5));

		        
		        students.sort(Comparator.comparingDouble(student -> student.grade));
		        System.out.println("Sorted by Grade:");
		        students.forEach(System.out::println);

		        
		        students.sort(Comparator.comparingInt(student -> -student.age));
		        System.out.println("\nSorted by Age (Desc):");
		        students.forEach(System.out::println);

		        
		        Map<Boolean, List<Student>> groupedByGrade = students.stream()
		                .collect(Collectors.partitioningBy(student -> student.grade > 10));
		        System.out.println("\nGrouped by Grade:");
		        System.out.println("Grades above 10:");
		        groupedByGrade.get(true).forEach(System.out::println);
		        System.out.println("Grades below or equal to 10:");
		        groupedByGrade.get(false).forEach(System.out::println);

		       
		        Map<Integer, List<Student>> groupedByAge = (Map<Integer, List<Student>>) students.stream().collect(Collectors.groupingBy(student -> student.age));
		        System.out.println("\nGrouped by Age:");
		        groupedByAge.forEach((age, studentList) -> {
		            System.out.println("Age " + age + ":");
		            studentList.forEach(System.out::println);
		        });

		        
		        double averageGrade = students.stream()
		                .mapToDouble(student -> student.grade)
		                .average()
		                .orElse(0.0);
		        System.out.println("\nAverage Of Grads: " + averageGrade);

		        
		        double averageGradeAbove18 = students.stream()
		                .filter(student -> student.age > 18)
		                .mapToDouble(student -> student.grade)
		                .average()
		                .orElse(0.0);
		        System.out.println("Average Grade of Students above 18: " + averageGradeAbove18);
		    }

	

	}



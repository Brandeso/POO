public class Student {
	private String name;
	private String address;
	private double gpa;

	public Student(String studentName) {
		name = studentName;
	}

	public void setName(String studentName) {
		name = studentName;
	}

	public void setAddress(String studentAddress) {
		address = studentAddress;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public double getGpa() {
		return gpa;
	}
	public void printName(){
		System.out.println(name);
	}
	public void computeGPA(Course newCourse, char grade) {
	// use the grade and course to update gpa

	}

}

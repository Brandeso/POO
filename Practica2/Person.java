public class Person {

	private String name;

	public void setName(String name) {

	this.name = name;

	} // Fin setName

	public String getName() {

	return this.name;

	} // Fin getName

	public void swapPerson(Person otherPerson) {

	String temp;
	temp = otherPerson.name;
	otherPerson.name = this.name;
	this.name = temp;

	} // Fin swapPerson

	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person();
		person1.setName("Jonathan");
		person2.setName("Benji");
		System.out.println(person1.getName() + ", " +
			person2.getName());

		person1.swapPerson(person2);
		System.out.println(person1.getName() + ", " +
			person2.getName());

	} // Fin main

} // Fin de clase Person

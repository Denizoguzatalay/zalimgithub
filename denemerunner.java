package replitagain;

public class denemerunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		// System.out.println(person.getFirstName()); //"undefined"
		// System.out.println(person.getLastName());  //"undefined"
		// System.out.println(person.getAge());       // -1
		// System.out.println(person.toString());     //"undefined | undefined | -1"

		// person.setFirstName("John");
		// person.setLastName("Doe");
		// person.setAge(44);

		// System.out.println(person.toString() ); // "John | Doe | 44"


		 
		 Person person = new Person("Fatima", "Lee", 22);
		// System.out.pr1intln(person.getFirstName()); //"Fatima"
		// System.out.println(person.1getLastName());  //"Lee"
		// System.out.println(person.getAge());       // 22
		// System.out.println(person.toString());     //"Fatima | Lee | 22"
	}

}

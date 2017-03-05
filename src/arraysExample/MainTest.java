package arraysExample;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonDatabase<Person> persons = new PersonDatabase<>();
		Person p1 = new Person("Jan", "Kowalski", "125");
		Person p2 = new Person("Janusz", "Testowy", "625526");
		persons.addPerson(p1);
	
		persons.printPersons();
		
		System.out.println("Dodaje kolejn¹ osobê: ");
		
		persons.addPerson(p2);
		
		persons.printPersons();
		
		System.out.println("Sortujê tablicê ");
		
		persons.printPersons();
		
		System.out.println("Szukam pozycji dla testowy");
		
		persons.findPerson("Testowy");
		
		
		
	}

}

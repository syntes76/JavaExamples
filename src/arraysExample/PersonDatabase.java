package arraysExample;

import java.util.Arrays;

public class PersonDatabase<T> {

	// represents simple database , dedicated to collect informations about
	// person from class Person

	// methods add(Person p), remove(Person p), getPerson(int index)
	private Person[] persons;
	int count = 0;

	public Person[] getPersons() {
		return persons;
	}

	public void setPersons(Person[] persons) {
		this.persons = persons;
	}

	public void addPerson(Person p) {

		if (count == 0) {
			persons = new Person[1];
			persons[count] = p;
			count++;

		}

		else {

			persons = Arrays.copyOf(persons, count + 1);
			persons[count] = p;
			count++;

		}

	}

	public void findPerson(String myperson) {

		for (int i = 0; i <= persons.length; i++) {

			if (persons[i].getLastName().equals(myperson))
				
			{
				System.out.println(persons[i]);
			}
			System.out.println("Person not founded");

		}

	}

	public void printPersons() {

		for (int i = 0; i < persons.length; i++) {
			int id = i + 1;
			System.out.println("Id Person " + id + " " + persons[i]);

		}

	}

}

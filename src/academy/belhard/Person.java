package academy.belhard;

public final class Person {
    private final String firstName;
    private final String lastName;
    private final Gender gender;


    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return person.firstName.equals(firstName) &&
                person.lastName.equals(lastName) &&
                gender == person.gender;
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + gender.hashCode();
    }

    @Override
    public String toString() {
        return "Name: " + firstName + ';' +
                " Surname: " + lastName + ';' +
                " Gander: " + gender + "\n";
    }

}

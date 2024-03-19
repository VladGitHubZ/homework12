public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return  firstName + " " + lastName;
    }

    public boolean equals(Object o) {
        Author author = (Author) o;
        return (firstName == author.firstName || (firstName != null && firstName.equals(author.firstName))) &&
                (lastName == author.lastName || (lastName != null && lastName.equals(author.lastName)));
    }

    public int hashCode() {
        int result = 1;
        result = 27 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 27 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}

package employee.version3;

public class Name {
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String suffix;

    //Constructors
    public Name(){

    }

    public Name(String firstName, String lastName, String middleName, String suffix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.suffix = suffix;
    }

    public Name(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        suffix = suffix;
    }

    @Override
    public String toString(){
        return "Name{" + "firstName = " + firstName + ", middle";
    }
}

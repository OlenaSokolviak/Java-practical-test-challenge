public class Users {
    long id;
    String firstName;
    String lastName;
    double amountOfMoney;

    public Users(long id, String firstName, String lastName, double amountOfMoney) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountOfMoney = amountOfMoney;
    }

    public long getId() {
        if (id <= 0) throw new IllegalArgumentException();
        else return id;
    }

    public void setId(long id) {
        if (id <= 0) throw new IllegalArgumentException();
        else this.id = id;
    }

    public String getFirstName() {
        if (firstName == "") throw new IllegalArgumentException();
        else return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == "") throw new IllegalArgumentException();
        else this.firstName = firstName;
    }

    public String getLastName() {
        if (lastName == "") throw new IllegalArgumentException();
        else return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == "") throw new IllegalArgumentException();
        else this.lastName = lastName;
    }

    public double getAmountOfMoney() {
        if (amountOfMoney <= 0) throw new IllegalArgumentException();
        else return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        if (amountOfMoney <= 0) throw new IllegalArgumentException();
        else this.amountOfMoney = amountOfMoney;
    }



    // Method for displaying list of all users
    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", amountOfMoney=" + amountOfMoney +
                '}';
    }




}

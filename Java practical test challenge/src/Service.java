import java.util.Scanner;

public class Service {
    private Products [] listOfProducts;
    private Users [] listOfUsers;

    public Service(Users [] listOfUsers){
        this.listOfUsers = listOfUsers;
    }
    public Service(Products [] listOfProducts){
        this.listOfProducts = listOfProducts;
    }
    public void printUsers() {
        for (int i = 0; i < listOfUsers.length; i++) {
            System.out.println(listOfUsers[i]);
        }
    }
    public void printProducts() {
        for (int i = 0; i < listOfProducts.length; i++) {
            System.out.println(listOfProducts[i]);
        }
    }


}
class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}
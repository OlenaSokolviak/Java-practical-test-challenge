import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Products product1 = new Products(100, "apple", 10);
        Products product2 = new Products(200, "banana", 20);
        Products product3 = new Products(300, "cherry", 30);

        Products[] listOfProducts = {product1, product2, product3};

        Users user1 = new Users(300100, "Agent", "Smith", 1_000);
        Users user2 = new Users(200200, "Iron", "Man", 5_000);
        Users user3 = new Users(100300, "Julia", "Roberts", 10_000);

        Users[] listOfUsers = {user1, user2, user3};

        //
        String [] user1ShopList = new String[0];
        String [] user2ShopList = new String[0];
        String [] user3ShopList = new String[0];


        String [] product1UserList = new String[0];
        String [] product2UserList = new String[0];
        String [] product3UserList = new String[0];


        // System has menu that supports next operations:

        //1. Display list of all users
        Service userService = new Service(listOfUsers);
        userService.printUsers();

        System.out.println();

        //2. Display list of all products
        Service productService = new Service(listOfProducts);
        productService.printProducts();


        System.out.println();

        int answer;

        do {


        //3. User should be able to buy product, to do this operation we should enter:
        Scanner scan = new Scanner(System.in);

        // id of user who want to buy product
        System.out.println("Enter user Id:");
        long userId = scan.nextLong();
        if (userId == user1.id || userId == user2.id || userId == user3.id) System.out.println();
        else throw new IllegalArgumentException("You've entered incorrect number!");

        System.out.println();

        // id of product which user want to buy
        System.out.println("Enter product Id: ");
        long productId = scan.nextLong();
        if (productId == product1.id || productId == product2.id || productId == product3.id) System.out.println();
        else throw new IllegalArgumentException("You've entered incorrect number!");
        System.out.println();


        if (userId == user1.id && productId == product1.id) {
            if (user1.amountOfMoney < product1.price)
                throw new IllegalArgumentException(user1.firstName + " " + user1.lastName + " has not enough money to buy " + product1.name);
            else {
                System.out.println("Congratulation! You've got " + product1.name);
                user1.amountOfMoney -= product1.price;

                int index = user1ShopList.length-1;
                user1ShopList = Arrays.copyOf(user1ShopList, user1ShopList.length+1);
                user1ShopList[++index] = product1.name;

                int productIndex = product1UserList.length-1;
                product1UserList = Arrays.copyOf(product1UserList, product1UserList.length+1);
                product1UserList[++productIndex] = user1.firstName + " " + user1.lastName;
            }
        } else if (userId == user1.id && productId == product2.id) {
            if (user1.amountOfMoney < product2.price)
                throw new IllegalArgumentException(user1.firstName + " " + user1.lastName + " has not enough money to buy " + product2.name);
            else {
                System.out.println("Congratulation! You've got " + product2.name);
                user1.amountOfMoney -= product2.price;
                int index = user1ShopList.length - 1;
                user1ShopList = Arrays.copyOf(user1ShopList, user1ShopList.length+1);
                user1ShopList[++index] = product2.name;

                int productIndex = product1UserList.length-1;
                product2UserList = Arrays.copyOf(product2UserList, product2UserList.length+1);
                product2UserList[++productIndex] = user1.firstName + " " + user1.lastName;
            }
        } else if (userId == user1.id && productId == product3.id) {
            if (user1.amountOfMoney < product3.price)
                throw new IllegalArgumentException(user1.firstName + " " + user1.lastName + " has not enough money to buy " + product3.name);
            else {
                System.out.println("Congratulation! You've got " + product3.name);
                user1.amountOfMoney -= product3.price;
                int index = user1ShopList.length - 1;
                user1ShopList = Arrays.copyOf(user1ShopList, user1ShopList.length+1);
                user1ShopList[++index] = product3.name;

                int productIndex = product3UserList.length-1;
                product3UserList = Arrays.copyOf(product3UserList, product3UserList.length+1);
                product3UserList[++productIndex] = user1.firstName + " " + user1.lastName;
            }




        } else if (userId == user2.id && productId == product1.id) {
            if (user2.amountOfMoney < product1.price)
                throw new IllegalArgumentException(user2.firstName + " " + user2.lastName + " has not enough money to buy " + product1.name);
            else {
                System.out.println("Congratulation! You've got " + product1.name);
                user2.amountOfMoney -= product1.price;

                int index = user2ShopList.length-1;
                user2ShopList = Arrays.copyOf(user2ShopList, user2ShopList.length+1);
                user2ShopList[++index] = product1.name;

                int productIndex = product1UserList.length-1;
                product1UserList = Arrays.copyOf(product1UserList, product1UserList.length+1);
                product1UserList[++productIndex] = user2.firstName + " " + user2.lastName;
            }
        } else if (userId == user2.id && productId == product2.id) {
            if (user2.amountOfMoney < product2.price)
                throw new IllegalArgumentException(user2.firstName + " " + user2.lastName + " has not enough money to buy " + product2.name);
            else {
                System.out.println("Congratulation! You've got " + product2.name);
                user2.amountOfMoney -= product2.price;

                int index = user2ShopList.length-1;
                user2ShopList = Arrays.copyOf(user2ShopList, user2ShopList.length+1);
                user2ShopList[++index] = product2.name;

                int productIndex = product2UserList.length-1;
                product2UserList = Arrays.copyOf(product2UserList, product2UserList.length+1);
                product2UserList[++productIndex] = user2.firstName + " " + user2.lastName;
            }
        } else if (userId == user2.id && productId == product3.id) {
            if (user2.amountOfMoney < product3.price)
                throw new IllegalArgumentException(user2.firstName + " " + user2.lastName + " has not enough money to buy " + product3.name);
            else {
                System.out.println("Congratulation! You've got " + product3.name);
                user2.amountOfMoney -= product3.price;
                int index = user2ShopList.length-1;
                user2ShopList = Arrays.copyOf(user2ShopList, user2ShopList.length+1);
                user2ShopList[++index] = product3.name;

                int productIndex = product3UserList.length-1;
                product3UserList = Arrays.copyOf(product3UserList, product3UserList.length+1);
                product3UserList[++productIndex] = user2.firstName + " " + user2.lastName;
            }




        } else if (userId == user3.id && productId == product1.id) {
            if (user3.amountOfMoney < product1.price)
                throw new IllegalArgumentException(user3.firstName + " " + user3.lastName + " has not enough money to buy " + product1.name);
            else {
                System.out.println("Congratulation! You've got " + product1.name);
                user3.amountOfMoney -= product1.price;

                int index = user3ShopList.length-1;
                user3ShopList = Arrays.copyOf(user3ShopList, user3ShopList.length+1);
                user3ShopList[++index] = product1.name;

                int productIndex = product1UserList.length-1;
                product1UserList = Arrays.copyOf(product1UserList, product1UserList.length+1);
                product1UserList[++productIndex] = user3.firstName + " " + user3.lastName;
            }
        } else if (userId == user3.id && productId == product2.id) {
            if (user3.amountOfMoney < product2.price)
                throw new IllegalArgumentException(user3.firstName + " " + user3.lastName + " has not enough money to buy " + product2.name);
            else {
                System.out.println("Congratulation! You've got " + product2.name);
                user3.amountOfMoney -= product2.price;

                int index = user3ShopList.length-1;
                user3ShopList = Arrays.copyOf(user3ShopList, user3ShopList.length+1);
                user3ShopList[++index] = product2.name;

                int productIndex = product2UserList.length-1;
                product2UserList = Arrays.copyOf(product2UserList, product2UserList.length+1);
                product2UserList[++productIndex] = user3.firstName + " " + user3.lastName;
            }
        } else if (userId == user3.id && productId == product3.id) {
            if (user3.amountOfMoney < product3.price)
                throw new IllegalArgumentException(user3.firstName + " " + user3.lastName + " has not enough money to buy " + product3.name);
            else {
                System.out.println("Congratulation! You've got " + product3.name);
                user3.amountOfMoney -= product3.price;

                int index = user3ShopList.length-1;
                user3ShopList = Arrays.copyOf(user3ShopList, user3ShopList.length+1);
                user3ShopList[++index] = product3.name;

                int productIndex = product3UserList.length-1;
                product3UserList = Arrays.copyOf(product3UserList, product3UserList.length+1);
                product3UserList[++productIndex] = user3.firstName + " " + user3.lastName;
            }
        }

            System.out.println("Do you want to stop shopping? (Yes - enter 1 / No - enter 0 )");
            answer = scan.nextInt();
            if (answer == 0 || answer == 1) System.out.println();
            else throw new IllegalArgumentException("You've entered incorrect number!");

        } while (answer != 1);



        //4. Display list of user products by user id (If user didn't buy anything yet, don't show anything)
        if (user1ShopList.length > 0) System.out.println("Shop list of " + user1.firstName + " " + user1.lastName + ": " + Arrays.toString(user1ShopList));

        if (user2ShopList.length > 0) System.out.println("Shop list of " + user2.firstName + " " + user2.lastName + ": " + Arrays.toString(user2ShopList));

        if (user3ShopList.length > 0) System.out.println("Shop list of " + user3.firstName + " " + user3.lastName + ": " + Arrays.toString(user3ShopList));




        //5. Display list of users that bought product by product id (If nobody bought this product yet, don't show anything)
        if (product1UserList.length > 0) System.out.println("User list of " + product1.name + ": " + Arrays.toString(product1UserList));

        if (product2UserList.length > 0) System.out.println("User list of " + product2.name + ": " + Arrays.toString(product2UserList));

        if (product3UserList.length > 0) System.out.println("User list of " + product3.name + ": " + Arrays.toString(product3UserList));


    }
}

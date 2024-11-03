public class Main {
    public static void main(String[] args) {
        // FIRST PART
        String firstName = "John";
        String lastName = "Doe";
        int age = 24;
        int someNumber = 178;
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        System.out.println(someNumber);
        boolean married = true;
        double amount = 30;
        String deposit = "Deposit";
        String withdraw = "Withdraw";
        System.out.printf("The amount is %.0fKD%n", amount);
        System.out.printf("Would you like to %s or %s the amount?%n", deposit, withdraw);

        // SECOND PART

        int amount2 = 5;
        System.out.println(amount2 + " plus " + amount2 + " makes " + (amount2 + amount2));
        String fullName = "John doe";
        String[] splitName = fullName.split(" ");
        int nameLength = splitName[1].length();
        String firstName2 = splitName[0];
        System.out.printf("My name is %s and my last name length is %d%n", firstName2.toUpperCase(), nameLength);
        boolean isNameStartsWithD = splitName[1].startsWith("d");
        System.out.println(isNameStartsWithD);
    }
}
//7. Given a user's email address: john_smith@example.com. Create two strings "login" and "domain" which will be substrings of full email address.
// The First Name and Last Name of the user should be in the following format: "Name Surname".

public class EmailAddress {
    public static void main(String[] args) {

        String email = "john_smith@example.com";
        String FirstName = email.substring(0, 4);
        String LastName = email.substring(5, 10);

        FirstName = FirstName.substring(0,1).toUpperCase() + FirstName.substring(1,4);
        LastName = LastName.substring(0,1).toUpperCase() + LastName.substring(1,5);

        System.out.println(FirstName + " " + LastName);
        System.out.println(email.substring(11, 22));

    }
}

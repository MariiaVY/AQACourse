//7. Given a user's email address: john_smith@example.com. Create two strings "login" and "domain" which will be substrings of full email address.
// The First Name and Last Name of the user should be in the following format: "Name Surname".

public class EmailAddress {
    public static void main(String[] args) {

        String email = "john_smith@example.com";
        String login = email.substring(0, 10);
        String domain = email.substring(11, 22);
        System.out.println(login);
        System.out.println(domain);

    }
}

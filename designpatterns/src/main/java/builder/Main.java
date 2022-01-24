package builder;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Anjana", "Shankar")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Random", "User1")
                .age(40)
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Random", "User2")
                .age(40)
                .email("randomuser2@email.com")
                .build();

        System.out.println(user3);
    }
}

package MediatorPattern;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();

        User user1 = new RegularUser(chatMediator, "FlyingCat");
        User user2 = new PremiumUser(chatMediator, "AnimeGirl");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);

        user1.send("Hello everynyan!");
        user2.send("Wa-a-a");
    }
}

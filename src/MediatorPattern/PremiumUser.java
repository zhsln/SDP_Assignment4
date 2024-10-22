package MediatorPattern;

public class PremiumUser extends User {

    public PremiumUser(ChatMediator mediator, String userName) {
        super(mediator, userName);
    }

    @Override
    public void send(String message) {
        System.out.println(this.userName + " (Premium) sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.userName + " (Premium) receives: " + message);
    }
}

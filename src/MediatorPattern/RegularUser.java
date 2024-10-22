package MediatorPattern;

public class RegularUser extends User {

    public RegularUser(ChatMediator mediator, String userName) {
        super(mediator, userName);
    }

    @Override
    public void send(String message) {
        System.out.println(this.userName + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.userName + " receives: " + message);
    }
}

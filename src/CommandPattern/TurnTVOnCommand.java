package CommandPattern;

public class TurnTVOnCommand implements Command {
    private TV tv;

    public TurnTVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void undo() {
        tv.turnOff();
    }
}

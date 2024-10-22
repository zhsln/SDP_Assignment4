package CommandPattern;

public class TurnTVOffCommand implements Command {
    public TV tv;

    public TurnTVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOff();
    }

    @Override
    public void undo() {
        tv.turnOn();
    }
}

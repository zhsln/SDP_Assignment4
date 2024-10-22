package CommandPattern;

public class BrightenLightsCommand implements Command {
    private Light light;

    public BrightenLightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.brighten();
    }

    @Override
    public void undo() {
        light.dim();
    }
}

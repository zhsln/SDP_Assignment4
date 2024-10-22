package CommandPattern;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();

        Command tvOn = new TurnTVOnCommand(tv);
        Command tvOff = new TurnTVOffCommand(tv);
        Command stereoOn = new SetVolumeCommand(stereo, 50);
        Command stereoOff = new SetVolumeCommand(stereo, 0);
        Command lightsDim = new DimLightsCommand(light);
        Command lightsBright = new BrightenLightsCommand(light);

        // Настройка команд в пульте
        remoteControl.setCommand(0, tvOn, tvOff);
        remoteControl.setCommand(1, stereoOn, stereoOff);
        remoteControl.setCommand(2, lightsDim, lightsBright);

        // Управление устройствами
        remoteControl.pressOnButton(0);  // Включаем телевизор
        remoteControl.pressOffButton(0);  // Выключаем телевизор
        remoteControl.pressOnButton(1);  // Включаем стерео с громкостью 10
        remoteControl.pressUndoButton();  // Отменяем последнее действие (стерео выключено)
        remoteControl.pressOnButton(2);  // Затемняем свет
        remoteControl.pressUndoButton();  // Отменяем затемнение света
    }
}


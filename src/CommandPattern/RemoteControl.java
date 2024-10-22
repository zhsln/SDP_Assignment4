package CommandPattern;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        undoCommand = null;
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void pressOnButton(int index){
        if (onCommands[index] != null){
            onCommands[index].execute();
            undoCommand = onCommands[index];
        }
    }

    public void pressOffButton(int index){
        if (offCommands[index] != null){
            offCommands[index].execute();
            undoCommand = offCommands[index];
        }
    }

    public void pressUndoButton(){
        if (undoCommand != null)
            undoCommand.undo();
    }
}

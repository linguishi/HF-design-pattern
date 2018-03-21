import command.LightOnCommand;
import receiver.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
    }
}

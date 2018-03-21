import command.*;
import receiver.Light;
import receiver.Stereo;

public class RemoteLoaderWithMacro {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light("living room");
        Stereo stereo = new Stereo();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOffCommand stereoOffCommand =  new StereoOffCommand(stereo);

        Command[] partyOn = {lightOnCommand, stereoOnWithCDCommand};
        Command[] partyOff = {lightOffCommand, stereoOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("===== Push Macro On =====");
        remoteControl.onButtonWasPushed(0);
        System.out.println("===== Push Macro Off =====");
        remoteControl.offButtonWasPushed(0);
    }
}

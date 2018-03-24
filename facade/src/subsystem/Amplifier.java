package subsystem;

public class Amplifier {
    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void setDvd() {
        System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
    }

    public void setVolume(int i) {
        System.out.println("Top-O-Line Amplifier setting setting volume to "+i);
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }
}

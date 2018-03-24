import subsystem.*;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        CdPlayer cdPlayer = new CdPlayer();
        DvdPlayer dvdPlayer = new DvdPlayer();
        PopcornPopper popper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        Tuner tuner = new Tuner();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, cdPlayer, projector, screen, lights, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}

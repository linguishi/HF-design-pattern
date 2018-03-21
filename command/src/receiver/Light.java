package receiver;

public class Light {
    private String name;
    public Light(String name){
        this.name = name;
    }

    public Light() {
        name = "";
    }

    public void on(){
        System.out.println(name + " Light is On...");
    }

    public void off() {
        System.out.println(name + " Light is Off...");
    }
}

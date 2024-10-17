import javax.sound.midi.Soundbank;

public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("jack");
        sayHello("james","bond");
    }

    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    static void sayHello(String name, String lastName){
        System.out.println("Hello " + name + " " + lastName);
    }
}

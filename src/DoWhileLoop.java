public class DoWhileLoop {
    public static void main(String[] args) {
        doWhileLoop();
    }
    public static void doWhileLoop() {
        var counter =100;
        do{
            System.out.println("perulangan Do While Loop" + counter);
            counter++;
        }while (counter < 10);
    }
}

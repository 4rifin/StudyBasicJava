public class ForLoop {
    public static void main(String[] args) {
        //infiniteLoop();
        conditionLoop();
        initStatementLoop();

    }

    private static void initStatementLoop() {
        for (int counter = 1; counter < 10; counter++) {
            System.out.println("Hello World with initStatement loop" + counter);
        }
    }

    private static void conditionLoop() {
        var counter = 1;
        for (; counter < 10; ) {
            System.out.println("Hello World with infinite loop" + counter);
            counter++;
        }
    }

    private static void infiniteLoop() {
        for (; ; ) {
            System.out.println("Hello World with infinite loop");
        }
    }
}

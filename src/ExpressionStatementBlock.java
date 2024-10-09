import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
        expresion();
        statement();
        block();
    }

    private static void block() {
        System.out.println("hello world1");
        System.out.println("hello world2");
        System.out.println("hello world3");
        {
            System.out.println("hello world4");
            System.out.println("hello world5");
            System.out.println("hello world6");

        }
    }

    private static void statement() {
        //assignment statement
        double aValue = 9999.235;
        //increment statement
        aValue++;
        // method invocation statement
        System.out.println(aValue);
        //Object creation statement
        Date date = new Date();
    }

    private static void expresion() {
        //expression
        int value;
        value = 10;

        System.out.println(value = 10);

    }
}

public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 5;
        var b = 6;
        var sum = sum(a,b);
        var add = multiple(a,b);
        System.out.println(sum);
        System.out.println(add);
        System.out.println(calculate(a,"+",b));
        System.out.println(calculate(a,"-",b));
        System.out.println(calculate(a,"*",b));
        System.out.println(calculate(a,"/",b));
    }

    static int sum(int a, int b) {
        var sum = a + b;
        return sum;
    }

    static int multiple(int a, int b) {
        var sum = a * b;
        return sum;
    }

    static int calculate(int a, String operation, int b) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 0;
        }

    }
}

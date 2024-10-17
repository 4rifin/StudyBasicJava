public class MethodVariableArgument {
    public static void main(String[] args) {
        var name = "John";
        int [] values = {80,80,80,88,99};
        sayCongrats(name,values);
    }
    static void sayCongrats(String name, int... values){
        var total =0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total/values.length;

        if(finalValue >= 75){
            System.out.println("Congrats! "+ name);
        }else {
            System.out.println("Not Congrats! "+ name);
        }
    }
}

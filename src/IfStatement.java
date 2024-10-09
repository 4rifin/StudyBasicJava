public class IfStatement {
    public static void main(String[] args) {
        var assigment = 70;
        var attending = 90;

        var resultAssigment = assigment >= 75;
        var resultAttending = attending >= 90;

        var resultGraduation = resultAssigment && resultAttending;
        var resultNotGraduation = !resultAssigment && resultAttending;

        if(resultGraduation){
            System.out.println("Congratulations!");
        }else if(resultNotGraduation){
            System.out.println("Please fix attending :(");
        }else{
            System.out.println("Please Try Again :(");
        }

    }
}

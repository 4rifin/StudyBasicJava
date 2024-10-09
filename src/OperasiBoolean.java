public class OperasiBoolean {
    public static void main(String[] args) {
        var attending = 75;
        var lastAssignment = 80;

        boolean resultAttanding = attending >= 75;
        boolean resultLastAssigment = lastAssignment >= 75;

        var lulus = resultAttanding && resultLastAssigment;
        System.out.println(lulus);

    }
}

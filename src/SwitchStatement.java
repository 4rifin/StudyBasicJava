public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";
        switchStatement(nilai);
        switchLambda(nilai);
        switchYield(nilai);
    }

    private static void switchYield(String nilai) {
        String ucapan = switch (nilai) {
            case "A":
                yield "Please Yield back to Gate A";
            case "B":
                yield "Please Yield back to Gate B";
            case "C":
                yield "Please Yield back to Gate C";
            default:
                yield nilai;
        };

        System.out.println(ucapan);
    }

    private static void switchLambda(String nilai) {
        switch (nilai) {
            case "A" -> System.out.println("Please back to Gate A");
            case "B" -> System.out.println("Please back to Gate B");
            case "C" -> System.out.println("Please back to Gate C");
            default -> {
                System.out.println("Please back to Gate D");
            }
        }
    }

    private static void switchStatement(String nilai) {
        switch (nilai) {
            case "A":
                System.out.println("Please come over to Gate A");
                break;
            case "B":
                System.out.println("Please come over to Gate B");
                break;
            case "C":
                System.out.println("Please come over to Gate C");
                break;
            default:
                break;
        }
    }
}

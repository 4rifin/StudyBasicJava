public class TipeArray {
    public static void main(String[] args) {
        String [] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Apple";
        stringArray[1] = "Banana";
        stringArray[2] = "Orange";

        System.out.println(stringArray[0]);

        String [] stringArray2 = new String[2];
        stringArray2[0] = "right";
        stringArray2[1] = "left";
        System.out.println(stringArray2[0]);

        String [] stringArray3 =  {"A","B","C"};

        System.out.println(stringArray3[2]);

        String [] stringArray4 = new String[]{"AA","BB","CC"};
        System.out.println(stringArray4[2]);

        System.out.println(stringArray4.length);

        String [][] memberStrings = {
                {"A","B"},
                {"C","D"},
                {"E"}
        };
        System.out.println(memberStrings[2][0]);

    }
}

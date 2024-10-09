public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer integerNumber = 100;
        Long longNumber = 100L;

        Byte byteNumber;
        byteNumber = 100;
        System.out.println(byteNumber);

        //konversi tipeDataBukanPrimitif to primitif

        int age = 30;
        Integer ageObject = age;
        System.out.println(ageObject);

        short shortNumber = ageObject.shortValue();
        System.out.println(shortNumber);
        long longNumber2 = ageObject.longValue();
        System.out.println(longNumber2);
        float floatNumber = ageObject.floatValue();
        System.out.println(floatNumber);

        Long amount = 1000L;

    }
}

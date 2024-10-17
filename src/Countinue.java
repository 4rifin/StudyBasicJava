public class Countinue {
    public static void main(String[] args) {
        for (var counter = 1; counter <= 100; counter++){
            if(counter %2 == 1){
                continue;
            }
            if(counter %2 == 0){
                System.out.println("perulangan genap" + counter);
            }
        }
    }
}

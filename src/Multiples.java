public class Multiples {
    public static void main(String[] args) {
        int num = 0;

        for (int i = 0; i<1000; i++ ){
            if (i % 3 == 0){
                num += 1;
            } else if (i % 5 == 0){
                num += 1;
            }
        }
        System.out.println(num);
    }
}

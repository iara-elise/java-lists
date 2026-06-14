public class Q12 {
    public static void main(String[] args) {
        
        String num = "";

        for(int i = 1000; i <= 3000; i++) {

            if(i % 7 == 0 && i % 5 != 0) {
                num += i + "; ";
            }
        }

        System.out.println(num);
    }
}

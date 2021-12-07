public class SumCalculator {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 4; i <= 20 ; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("Tong cac so chan tu 4 den 20 la: " + sum);
    }
}

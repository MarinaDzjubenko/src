package homeworks;

import java.util.Scanner;

public class CallingHW14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter price");
        float priceBefDisc = scanner.nextFloat();

        System.out.println("Please enter discount");
        float discount = scanner.nextFloat();

        HW14 price1 = new HW14();

        price1.setPrice(priceBefDisc);
        price1.setDiscount(discount);

        double result = price1.priceAftDis();
        System.out.printf("Price after discount %.2f", result);

    }
}


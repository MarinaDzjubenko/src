package homeworks;

public class HW14 {
            private float priceBefDisc;
            private float discount;

            public void setPrice (float price){this.priceBefDisc=price;}
            public void setDiscount(float discount) {this.discount = discount;}

            public float priceAftDis(){
                float priceAftDisc = 0;
                priceAftDisc = priceBefDisc - (priceBefDisc * discount / 100);
                System.out.println("Price after discount: " + priceAftDisc);
                return priceAftDisc;
    }
}

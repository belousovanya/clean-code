package homework_1.task_2;

public class DiscountCalculator {
    public static void main(String[] args) {
        System.out.println(calculateDiscount(100.0, true, true, true));
        System.out.println(calculateDiscount(100.0, false, true, true));
        System.out.println(calculateDiscount(100.0, false, false, true));
        System.out.println(calculateDiscount(100.0, false, false, false));
    }

    // до KISS
//    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
//        double discount = 0.0;
//
//        if (isLoyalCustomer) {
//            if (isFirstPurchase) {
//                discount = price * 0.10;
//            } else {
//                discount = price * 0.05;
//            }
//        } else {
//            if (hasCoupon) {
//                discount = price * 0.07;
//            } else {
//                discount = price * 0.02;
//            }
//        }
//        return price - discount;
//    }

    // с KISS
    public static double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discount;

        if (isLoyalCustomer && isFirstPurchase) {
            discount = price * 0.10;
        } else if (isLoyalCustomer) {
            discount = price * 0.05;
        } else if (hasCoupon) {
            discount = price * 0.07;
        } else {
            discount = price * 0.02;
        }
        return price - discount;
    }
}

package pl.fakturownia.modfx.calculator;

public class InvoiceCalculator {

    public static Double netPriceAfterDiscountCalc(Double netPrice, Double discount) {
        return netPrice * (discount/100);
    }

    public static Double netAmountCalc(Double netPriceAfterDiscount, Long amount) {
        return netPriceAfterDiscount * amount;
    }

    public static Double vatAmountCalc(Double netPriceAfterDiscount, Integer vat) {
        return netPriceAfterDiscount * ((double)vat/100);
    }

    public static Double grossAmountCalc(Double netPriceAfterDiscount, Double vatAmount) {
        return netPriceAfterDiscount + vatAmount;
    }
}

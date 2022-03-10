package Accountant;
import Accountant.Taxes.*;
import Accountant.Bills.*;

public class Bill {
    protected double amount;
    protected TaxType taxType;
    protected TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
   }

    public void payTaxes() {
        // TODO вместо 0.0 посчитать размер налога исходя из TaxType
        double taxAmount = amount * taxType.calculateTaxFor(amount);

        taxService.payOut(taxAmount);
    }
}
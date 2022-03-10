package Accountant.Bills;

import Accountant.Bill;
import Accountant.TaxService;
import Accountant.Taxes.*;
import Accountant.Taxes.ProgressiveTaxType;


public class rent extends Bill {


    public rent(double amount, TaxType taxType, TaxService taxService) {
        super(amount, taxType, taxService);
    }

}

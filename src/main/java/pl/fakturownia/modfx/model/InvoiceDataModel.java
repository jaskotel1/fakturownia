package pl.fakturownia.modfx.model;

import java.time.LocalDate;

public class InvoiceDataModel {

    private final  String invoiceNr;
    private final  String issuePlace;
    private final  LocalDate issueDate;
    private final  LocalDate sellDate;
    private final  String companyNameSeller;
    private final  String companyNameBuyer;
    private final  Long nipSeller;
    private final  Long nipBuyer;
    private final  String emailSeller;
    private final  String emailBuyer;
    private final  String accountNrSeller;
    private final  String accountNrBuyer;
    private final  String addressSeller;
    private final  String addressBuyer;

    public InvoiceDataModel(String invoiceNr, String issuePlace, LocalDate issueDate, LocalDate sellDate, String companyNameSeller, String companyNameBuyer,
                            Long nipSeller, Long nipBuyer, String emailSeller, String emailBuyer, String accountNrSeller, String accountNrBuyer,
                            String addressSeller, String addressBuyer) {
        this.invoiceNr = invoiceNr;
        this.issuePlace = issuePlace;
        this.issueDate = issueDate;
        this.sellDate = sellDate;
        this.companyNameSeller = companyNameSeller;
        this.companyNameBuyer = companyNameBuyer;
        this.nipSeller = nipSeller;
        this.nipBuyer = nipBuyer;
        this.emailSeller = emailSeller;
        this.emailBuyer = emailBuyer;
        this.accountNrSeller = accountNrSeller;
        this.accountNrBuyer = accountNrBuyer;
        this.addressSeller = addressSeller;
        this.addressBuyer = addressBuyer;
    }

    public String getInvoiceNr() {
        return invoiceNr;
    }

    public String getIssuePlace() {
        return issuePlace;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getSellDate() {
        return sellDate;
    }

    public String getCompanyNameSeller() {
        return companyNameSeller;
    }

    public String getCompanyNameBuyer() {
        return companyNameBuyer;
    }

    public Long getNipSeller() {
        return nipSeller;
    }

    public Long getNipBuyer() {
        return nipBuyer;
    }

    public String getEmailSeller() {
        return emailSeller;
    }

    public String getEmailBuyer() {
        return emailBuyer;
    }

    public String getAccountNrSeller() {
        return accountNrSeller;
    }

    public String getAccountNrBuyer() {
        return accountNrBuyer;
    }

    public String getAddressSeller() {
        return addressSeller;
    }

    public String getAddressBuyer() {
        return addressBuyer;
    }

    @Override
    public String toString() {
        return "InvoiceDataModel{" +
                "invoiceNr=" + invoiceNr +
                ", issuePlace=" + issuePlace +
                ", issueDate=" + issueDate +
                ", sellDate=" + sellDate +
                ", companyNameSeller=" + companyNameSeller +
                ", companyNameBuyer=" + companyNameBuyer +
                ", nipSeller=" + nipSeller +
                ", nipBuyer=" + nipBuyer +
                ", emailSeller=" + emailSeller +
                ", emailBuyer=" + emailBuyer +
                ", accountNrSeller=" + accountNrSeller +
                ", accountNrBuyer=" + accountNrBuyer +
                ", addressSeller=" + addressSeller +
                ", addressBuyer=" + addressBuyer +
                '}';
    }
}

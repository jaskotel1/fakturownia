package pl.fakturownia.modfx.controller;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import pl.fakturownia.modfx.creator.TaskCreator;
import pl.fakturownia.modfx.factory.InvoiceItemFactory;
import pl.fakturownia.modfx.model.InvoiceDataModel;
import pl.fakturownia.modfx.model.InvoiceItemModel;

import java.util.List;

import static pl.fakturownia.modfx.calculator.InvoiceCalculator.*;

public class SimpleInvoiceController {

    @FXML
    private TextField invoiceNr;
    @FXML
    private TextField issuePlace;
    @FXML
    private DatePicker issueDate;
    @FXML
    private DatePicker sellDate;
    @FXML
    private TextField companyNameSeller;
    @FXML
    private TextField companyNameBuyer;
    @FXML
    private TextField nipSeller;
    @FXML
    private TextField nipBuyer;
    @FXML
    private TextField emailSeller;
    @FXML
    private TextField emailBuyer;
    @FXML
    private TextField accountNrSeller;
    @FXML
    private TextField accountNrBuyer;
    @FXML
    private TextArea addressSeller;
    @FXML
    private TextArea addressBuyer;
    @FXML
    private TableView<InvoiceItemModel> invoiceItem;
    @FXML
    private TableColumn<InvoiceItemModel, Long> ordinalNumber;
    @FXML
    private TableColumn<InvoiceItemModel, Long> itemName;
    @FXML
    private TableColumn<InvoiceItemModel, Long> amount;
    @FXML
    private TableColumn<InvoiceItemModel, Long> jm;
    @FXML
    private TableColumn<InvoiceItemModel, Long> netPrice;
    @FXML
    private TableColumn<InvoiceItemModel, Long> discount;
    @FXML
    private TableColumn<InvoiceItemModel, Long> netPriceDiscount;
    @FXML
    private TableColumn<InvoiceItemModel, Long> vat;
    @FXML
    private TableColumn<InvoiceItemModel, Long> netAmount;
    @FXML
    private TableColumn<InvoiceItemModel, Long> vatAmount;
    @FXML
    private TableColumn<InvoiceItemModel, Long> grossAmount;
    @FXML
    private TextField itemNameAdd;
    @FXML
    private TextField amountAdd;
    @FXML
    private TextField jmAdd;
    @FXML
    private TextField netPriceAdd;
    @FXML
    private TextField discountAdd;
    @FXML
    private TextField vatAdd;
    @FXML
    private TopMenuController topMenuController;

    private final InvoiceItemFactory invoiceItemFactory = new InvoiceItemFactory();

    public void createPdfButtonAction() {
        InvoiceDataModel invoiceDataModel = new InvoiceDataModel(invoiceNr.getText(), issuePlace.getText(), issueDate.getValue(), sellDate.getValue(),
                companyNameSeller.getText(), companyNameBuyer.getText(), Long.parseLong(nipSeller.getText()), Long.parseLong(nipBuyer.getText()), emailSeller.getText(), emailBuyer.getText(),
                accountNrSeller.getText(), accountNrBuyer.getText(), addressSeller.getText(), addressBuyer.getText());

        System.out.println(invoiceDataModel);
    }

    public void addItemAction() {
        Long amount = Long.parseLong(amountAdd.getText());
        Double netPrice = Double.parseDouble(netPriceAdd.getText());
        Double discount = Double.parseDouble(discountAdd.getText());
        Double netPriceAfterDiscount = netPriceAfterDiscountCalc(netPrice, discount);
        Integer vat = Integer.parseInt(vatAdd.getText());
        Double netAmount = netAmountCalc(netPriceAfterDiscount, amount);
        Double vatAmount = vatAmountCalc(netPriceAfterDiscount, vat);
        Double grossAmount = grossAmountCalc(netPriceAfterDiscount, vatAmount);

        InvoiceItemModel invoiceItemModel = new InvoiceItemModel(itemNameAdd.getText(), amount, jmAdd.getText(), netPrice, discount,
                netPriceAfterDiscount, vat, netAmount, vatAmount, grossAmount);

        this.ordinalNumber.setCellValueFactory(new PropertyValueFactory<>("id"));
        this.itemName.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        this.amount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        this.jm.setCellValueFactory(new PropertyValueFactory<>("jm"));
        this.netPrice.setCellValueFactory(new PropertyValueFactory<>("netPrice"));
        this.discount.setCellValueFactory(new PropertyValueFactory<>("discount"));
        this.netPriceDiscount.setCellValueFactory(new PropertyValueFactory<>("netPriceDiscount"));
        this.vat.setCellValueFactory(new PropertyValueFactory<>("vat"));
        this.netAmount.setCellValueFactory(new PropertyValueFactory<>("netAmount"));
        this.vatAmount.setCellValueFactory(new PropertyValueFactory<>("vatAmount"));
        this.grossAmount.setCellValueFactory(new PropertyValueFactory<>("grossAmount"));

        new Thread(new TaskCreator().createTaskForInvoiceItemModel(invoiceItem, invoiceItemFactory, invoiceItemModel)).start();
    }

}

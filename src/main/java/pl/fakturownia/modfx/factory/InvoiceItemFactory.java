package pl.fakturownia.modfx.factory;

import pl.fakturownia.modfx.model.InvoiceItemModel;

import java.util.LinkedList;
import java.util.List;

public class InvoiceItemFactory {

    private final List<InvoiceItemModel> invoiceItemList;

    public InvoiceItemFactory() {
        this.invoiceItemList = new LinkedList<>();
    }

    public List<InvoiceItemModel> addInvoiceItem(InvoiceItemModel invoiceItemModel) {
        invoiceItemList.add(invoiceItemModel);
        System.out.println("Dodano dane do bazy");
        return invoiceItemList;
    }
}

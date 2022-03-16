package pl.fakturownia.modfx.creator;

import javafx.concurrent.Task;
import javafx.scene.control.TableView;
import pl.fakturownia.modfx.factory.InvoiceItemFactory;
import pl.fakturownia.modfx.model.InvoiceItemModel;

import java.util.List;

public class TaskCreator {

    public Task<List<InvoiceItemModel>> createTaskForInvoiceItemModel(TableView<InvoiceItemModel> invoiceItem, InvoiceItemFactory invoiceItemFactory,
                                                                      InvoiceItemModel invoiceItemModel) {
        return new Task<>() {
            @Override
            protected List<InvoiceItemModel> call() {
                return invoiceItemFactory.addInvoiceItem(invoiceItemModel);
            }

            @Override
            protected void succeeded() {
                invoiceItem.getItems().clear();
                invoiceItem.getItems().addAll(getValue());
            }
        };
    }
}

package org.example.problem.easy;

public class Invoice {
    final String invoiceNumber;
    final InvoiceItem invoiceItemHead;

    public Invoice(String invoiceNumber, InvoiceItem invoiceItemHead) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceItemHead = invoiceItemHead;
    }

    double amountDue(boolean taxes) {
        var amount = 0;
        var target = invoiceItemHead;

        while (target != null) {
            amount += (int) target.getTotalPrice();
            target = target.next;
        }

        return taxes ? (amount * 0.1) + amount : amount;
    }
}

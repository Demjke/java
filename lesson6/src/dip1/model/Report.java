package lesson6.src.dip1.model;

import lesson6.src.dip1.model.util.ReportPrinter;

import java.util.ArrayList;
import java.util.List;

public class Report {
    private List<ReportItem> items;

    public void calculate() {
        setItems(new ArrayList<ReportItem>());
        getItems().add(new ReportItem("First", (float) 5));
        getItems().add(new ReportItem("Second", (float) 6));
    }

    public List<ReportItem> getItems() {
        return items;

    }

    public void setItems(List<ReportItem> items) {
        this.items = items;

    }

    public void output() {
        ReportPrinter reportPrint = new ReportPrinter();
        reportPrint.output(getItems());
    }
}

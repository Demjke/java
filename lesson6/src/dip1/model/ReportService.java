
package lesson6.src.dip1.model;

import java.util.ArrayList;
import java.util.Arrays;

public class ReportService {

    private Report report;
    private PrintOut reportPrint;

    public ReportService(Report report, PrintOut reportPrint) {
        this.report = report;
        this.reportPrint = reportPrint;
    }

    public void calculate() {
        report.setItems(new ArrayList<ReportItem>());
        report.getItems().add(new ReportItem("First", (float) 5));
        report.getItems().add(new ReportItem("Second", (float) 6));
    }

    public void output() {
        reportPrint.output(report.getItems());
    }

    public void add(ReportItem... items) {
        this.report.getItems().addAll(Arrays.asList(items));
    }
}
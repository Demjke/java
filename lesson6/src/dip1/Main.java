package lesson6.src.dip1;

import java.util.logging.Level;
import java.util.logging.Logger;

import lesson6.src.dip1.model.Report;
import lesson6.src.logger.Log;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());

    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report();
        report.calculate();
        report.output();
    }
}

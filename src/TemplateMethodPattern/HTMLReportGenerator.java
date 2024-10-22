package TemplateMethodPattern;

public class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting HTML header.");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting HTML body.");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting HTML footer.");
    }
}

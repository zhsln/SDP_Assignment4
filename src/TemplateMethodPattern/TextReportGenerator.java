package TemplateMethodPattern;

public class TextReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting text header.");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting text body.");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting text footer.");
    }
}

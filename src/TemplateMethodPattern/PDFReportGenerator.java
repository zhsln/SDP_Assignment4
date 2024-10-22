package TemplateMethodPattern;

public class PDFReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("Formatting PDF header.");
    }

    @Override
    protected void formatBody() {
        System.out.println("Formatting PDF body.");
    }

    @Override
    protected void formatFooter() {
        System.out.println("Formatting PDF footer.");
    }
}

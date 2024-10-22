package TemplateMethodPattern;

public class Main {
    public static void main(String[] args) {
        ReportingSystem reportingSystem = new ReportingSystem();

        ReportGenerator pdfReport = new PDFReportGenerator();
        reportingSystem.generateReport(pdfReport);

        ReportGenerator htmlReport = new HTMLReportGenerator();
        reportingSystem.generateReport(htmlReport);

        ReportGenerator textReport = new TextReportGenerator();
        reportingSystem.generateReport(textReport);
    }
}

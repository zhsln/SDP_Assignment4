package MementoPattern;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        document.setContent("Version 1: Hello World!");
        versionControl.saveVersion(document.save());

        document.setContent("Version 2: Hello World 2!");
        versionControl.saveVersion(document.save());

        document.setContent("Version 3: Final Version.");
        versionControl.saveVersion(document.save());

        versionControl.showAllVersions();

        document.restore(versionControl.getVersion(1));
        System.out.println("Restored to: " + document.getContent());
    }
}

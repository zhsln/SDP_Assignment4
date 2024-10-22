package MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private List<DocumentVersion> savedVersions = new ArrayList<>();

    public void saveVersion(DocumentVersion memento) {
        savedVersions.add(memento);
    }

    public DocumentVersion getVersion(int index) {
        if (index < 0 || index >= savedVersions.size()) {
            System.out.println("Invalid version index.");
            return null;
        }
        return savedVersions.get(index);
    }

    public void showAllVersions() {
        for (int i = 0; i < savedVersions.size(); i++)
            System.out.println("Version " + (i + 1) + ": " + savedVersions.get(i).getContent());
    }
}

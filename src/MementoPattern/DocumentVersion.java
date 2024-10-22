package MementoPattern;

public class DocumentVersion { // or DocumentMemento
    private final String content;

    public DocumentVersion(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

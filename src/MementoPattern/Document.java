package MementoPattern;

public class Document { // or DocumentOriginator
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public DocumentVersion save() {
        return new DocumentVersion(content);
    }

    public void restore(DocumentVersion memento) {
        this.content = memento.getContent();
    }
}

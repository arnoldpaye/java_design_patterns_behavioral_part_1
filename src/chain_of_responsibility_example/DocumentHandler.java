package chain_of_responsibility_example;

public abstract class DocumentHandler {
  private DocumentHandler next;

  public DocumentHandler(DocumentHandler next) {
    this.next = next;
  }
}

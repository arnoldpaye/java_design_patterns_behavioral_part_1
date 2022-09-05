package chain_of_responsibility_example;

public class TextDocumentHandler extends DocumentHandler {
  public TextDocumentHandler(DocumentHandler handler) {
    super(handler);
  }
}

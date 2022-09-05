package chain_of_responsibility_example;

public class SpreadsheetHandler extends DocumentHandler {
  public SpreadsheetHandler(DocumentHandler handler) {
    super(handler);
  }
}

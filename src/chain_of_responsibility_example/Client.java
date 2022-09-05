package chain_of_responsibility_example;

public class Client {
  public static void main(String[] args) {
    DocumentHandler chain = new SpreadsheetHandler(new SlideshowHandler(new TextDocumentHandler(null)));

    chain.openDocument("ppt");

    chain.openDocument("txt");
  }
}

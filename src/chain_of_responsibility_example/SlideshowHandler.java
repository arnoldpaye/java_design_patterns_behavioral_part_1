package chain_of_responsibility_example;

public class SlideshowHandler extends DocumentHandler {
  public SlideshowHandler(DocumentHandler handler) {
    super(handler);
  }

  public void openDocument(String fileExtension) {
    if (fileExtension.equals("ppt")) {
      System.out.println("Opening slideshow document...");
    } else {
      super.openDocument(fileExtension);
    }
  }
}

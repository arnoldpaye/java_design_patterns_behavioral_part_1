package chain_of_responsibility_example;

public class SlideshowHandler extends DocumentHandler {
  public SlideshowHandler(DocumentHandler handler) {
    super(handler);
  }
}

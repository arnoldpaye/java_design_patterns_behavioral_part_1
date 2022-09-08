package iterator_pattern_example;

import java.util.Iterator;

public class Inventory implements Iterable {
  private Item[] items;

  public Inventory(Item...items) {
    this.items = items;
  }

  public Item[] getItems() {
    return items;
  }

  @Override
  public Iterator iterator() {
    return null;
  }
}

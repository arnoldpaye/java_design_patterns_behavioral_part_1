package command_pattern_exercise;

public class PlaceOrderCommand implements Command {
  private Jacket jacket;

  public PlaceOrderCommand(Jacket jacket) {
    this.jacket = jacket;
  }

  @Override
  public void execute() {
    jacket.placeOrder();
  }
}

package command_pattern_exercise;

public class OrderHandler {
  public void invoke(Command command) {
    command.execute();
  }
}

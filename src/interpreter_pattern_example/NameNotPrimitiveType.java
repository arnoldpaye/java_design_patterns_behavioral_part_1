package interpreter_pattern_example;

public class NameNotPrimitiveType implements Expression {
  @Override
  public String interpret(String context) {
    if (context.equals("init") || context.equals("boolean") || context.equals("double")) {
      context = context + "1";
    }
    return context;
  }
}

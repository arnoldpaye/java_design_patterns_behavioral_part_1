package interpreter_pattern_example;

public class FirstLetterNotUnderscore implements Expression {
  private FirstLetterIsLowerCase firstLetterIsLowerCase = new FirstLetterIsLowerCase();

  @Override
  public String interpret(String context) {
    if (context.startsWith("_")) {
      context = context.substring(1);
    }
    return firstLetterIsLowerCase.interpret(context);
  }
}

package interpreter_pattern_exercise;

public class FirstLetterLowerCase implements Expression {
  @Override
  public String interpret(String context) {
    return HelperMethods.firstLetterLowerCase(context);
  }
}

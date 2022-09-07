package interpreter_pattern_exercise;

public class EndsWithPeriod implements Expression {
  FirstLetterLowerCase firstLetterLowerCase = new FirstLetterLowerCase();

  @Override
  public String interpret(String context) {
    context = HelperMethods.endsWithPeriod(context);
    return firstLetterLowerCase.interpret(context);
  }
}

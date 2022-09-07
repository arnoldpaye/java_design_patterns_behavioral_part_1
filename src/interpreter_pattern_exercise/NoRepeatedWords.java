package interpreter_pattern_exercise;

public class NoRepeatedWords implements Expression {
  EndsWithPeriod endsWithPeriod = new EndsWithPeriod();

  @Override
  public String interpret(String context) {
    context = HelperMethods.noRepeatedWords(context);
    return endsWithPeriod.interpret(context);
  }
}

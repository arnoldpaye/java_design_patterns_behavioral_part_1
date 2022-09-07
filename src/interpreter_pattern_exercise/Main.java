package interpreter_pattern_exercise;

public class Main {

  public static void main(String[] args) {

    String context = "this is a a sentence sentence";
    NoRepeatedWords noRepeatedWords = new NoRepeatedWords();
    context = noRepeatedWords.interpret(context);

    System.out.println(context);
  }
}

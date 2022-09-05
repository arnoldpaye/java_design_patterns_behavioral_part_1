package chain_of_responsibility_exercise;

public class BasicAuthenticationHandler extends AuthenticationHandler {

  public BasicAuthenticationHandler(AuthenticationHandler handler) {
    super(handler);
  }

  public void handleRequest(String requestType) {
    if (requestType.equals("basic")) {
      System.out.println("Handle basic authentication request...");
    } else {
      super.handleRequest(requestType);
    }
  }
}

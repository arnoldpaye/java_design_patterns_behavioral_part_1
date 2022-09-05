package chain_of_responsibility_exercise;

public class DigestAuthenticationHandler extends AuthenticationHandler {

  public DigestAuthenticationHandler(AuthenticationHandler handler) {
    super(handler);
  }

  public void handleRequest(String requestType) {
    if (requestType.equals("digest")) {
      System.out.println("Handle digest authentication request...");
    } else {
      super.handleRequest(requestType);
    }
  }
}

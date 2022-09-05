package chain_of_responsibility_exercise;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

  public ClientCertificateAuthenticationHandler(AuthenticationHandler handler) {
    super(handler);
  }

  public void handleRequest(String requestType) {
    if (requestType.equals("client-certificate")) {
      System.out.println("Handle client certificate authentication request...");
    } else {
      super.handleRequest(requestType);
    }
  }
}

package chain_of_responsibility_exercise;

public class Client {

  public static void main(String[] args) {
    AuthenticationHandler chain = new BasicAuthenticationHandler(new ClientCertificateAuthenticationHandler(new DigestAuthenticationHandler(null)));

    chain.handleRequest("client-certificate");
    chain.handleRequest("basic");
    chain.handleRequest("digest");
  }
}

package org.owasp.wrongsecrets.challenges.kubernetes;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/** Class used to get password from vault using the springboot cloud integration with vault. */
@Setter
@ConfigurationProperties("vaultpassword")
public class Vaultpassword {

  private String password;

    public String getPasssword() {
    return password;
  }
}

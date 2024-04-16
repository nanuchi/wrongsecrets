package org.owasp.wrongsecrets.challenges.kubernetes;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/** Class used to get value from vault using the springboot cloud integration with vault. */
@Getter
@Setter
@ConfigurationProperties("vaultinjected")
public class Vaultinjected {

  private String value;

}

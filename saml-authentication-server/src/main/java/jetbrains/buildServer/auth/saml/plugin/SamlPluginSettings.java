package jetbrains.buildServer.auth.saml.plugin;

import lombok.Data;

@Data
public class SamlPluginSettings {
    private String issuerUrl;
    private String entityId;
    private String ssoEndpoint;
    private String publicCertificate;
    private Boolean hideLoginForm;
}

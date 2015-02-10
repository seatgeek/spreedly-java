package cc.protea.spreedly.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.ArrayList;
import java.util.List;

/**
 * Describes fields that are required to authenticate with a gateways. There may be multiple modes.
 *
 * @author rjstanford
 */
public class SpreedlyGatewayAuthMode {

    /**
     * Spreedly assigned word identifying the collection of credentials.
     */
    @Element(name = "auth_mode_type", required = false)
    public String type;

    /**
     * Spreedly assigned phrase identifying the collection of credentials.
     */
    public String name;

    /**
     * These credentials are stored to be able to authenticate when performing gateway transactions.
     */
    @ElementList(name = "credentials", entry = "credential")
    public List<SpreedlyGatewayCredential> credentials = new ArrayList<SpreedlyGatewayCredential>();

    /**
     * @return Spreedly assigned word identifying the collection of credentials.
     */
    public String getType() {
        return type;
    }

    /**
     * @param type Spreedly assigned word identifying the collection of credentials.
     */
    public void setType(final String type) {
        this.type = type;
    }

    /**
     * @return Spreedly assigned phrase identifying the collection of credentials.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name Spreedly assigned phrase identifying the collection of credentials.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return These credentials are stored to be able to authenticate when performing gateway transactions.
     */
    public List<SpreedlyGatewayCredential> getCredentials() {
        return credentials;
    }

    /**
     * @param credentials These credentials are stored to be able to authenticate when performing gateway transactions.
     */
    public void setCredentials(final List<SpreedlyGatewayCredential> credentials) {
        this.credentials = credentials;
    }


}
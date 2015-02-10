package cc.protea.spreedly.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Root(name = "gateway", strict = false)
public class SpreedlyGatewayAccount {

    public String token;
    @Element(name = "gateway_type")
    public String gatewayType;
    public String name;
    public SpreedlyGatewayCharacteristics     characteristics       = new SpreedlyGatewayCharacteristics();
    @ElementList(name = "credentials", entry = "credential")
    public List<SpreedlyGatewayCredential>    credentials           = new ArrayList<SpreedlyGatewayCredential>();
    @ElementList(entry = "gateway_specific_field", name = "gateway_specific_fields")
    public List<String>                       gatewaySpecificFields = new ArrayList<String>();
    @ElementList(entry = "payment_method", name = "payment_methods")
    public List<SpreedlyGatewayPaymentMethod> paymentMethods        = new ArrayList<SpreedlyGatewayPaymentMethod>();
    public SpreedlyGatewayAccountState state;
    public boolean                     redacted;
    @Element(name = "created_at")
    public Date                        createdOn;
    @Element(name = "updated_at")
    public Date                        updatedOn;

    public String getToken() {
        return token;
    }

    public void setToken(final String token) {
        this.token = token;
    }

    public String getGatewayType() {
        return gatewayType;
    }

    public void setGatewayType(final String gatewayType) {
        this.gatewayType = gatewayType;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public SpreedlyGatewayCharacteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(final SpreedlyGatewayCharacteristics characteristics) {
        this.characteristics = characteristics;
    }

    public List<SpreedlyGatewayCredential> getCredentials() {
        return credentials;
    }

    public void setCredentials(final List<SpreedlyGatewayCredential> credentials) {
        this.credentials = credentials;
    }

    public List<String> getGatewaySpecificFields() {
        return gatewaySpecificFields;
    }

    public void setGatewaySpecificFields(final List<String> gatewaySpecificFields) {
        this.gatewaySpecificFields = gatewaySpecificFields;
    }

    public List<SpreedlyGatewayPaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(final List<SpreedlyGatewayPaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public SpreedlyGatewayAccountState getState() {
        return state;
    }

    public void setState(final SpreedlyGatewayAccountState state) {
        this.state = state;
    }

    public boolean isRedacted() {
        return redacted;
    }

    public void setRedacted(final boolean redacted) {
        this.redacted = redacted;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(final Date updatedOn) {
        this.updatedOn = updatedOn;
    }


}
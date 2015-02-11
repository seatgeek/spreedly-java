package cc.protea.spreedly.model;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Transient;

import java.util.ArrayList;
import java.util.List;

@Default(required = false)
public class SpreedlyGatewayProvider {

    /**
     * A unique identifier for a gateway provider.
     */
    @Element(name = "gateway_type", required = false)
    public String                         gatewayType;
    /**
     * The full descriptive name of a gateway provider.
     */
    public String                         name;
    /**
     * Fields that are required to authenticate with a gateways. There may be multiple modes. These credentials are stored to be able to
     * authenticate when performing gateway transactions.
     */
    @ElementList(name = "auth_modes", entry = "auth_mode")
    public List<SpreedlyGatewayAuthMode>  authModes;
    /**
     * A list of properties containing boolean values describing what properties the gateway supports.
     */
    @Element(name = "characteristics", required = false)
    public SpreedlyGatewayCharacteristics characteristics;
    /**
     * List of payment method types that the gateway supports.
     */
    @ElementList(name = "payment_methods", entry = "payment_method")
    public List<SpreedlyGatewayPaymentMethod> paymentMethods        = new ArrayList<SpreedlyGatewayPaymentMethod>();
    /**
     * Fields that a gateway defines for a specific purpose but is not implemented by all gateways.
     */
    @ElementList(name = "gateway_specific_fields", entry = "gateway_specific_field")
    public List<String>                       gatewaySpecificFields = new ArrayList<String>();
    /**
     * Abbreviated country names where the gateway can process payments.
     */
    @Transient
    public List<String>                       supportedCountries    = new ArrayList<String>();
    /**
     * Global regions where the gateway can process payments.
     */
    @Transient
    public List<String>                       regions               = new ArrayList<String>();
    /**
     * URL of the gateway's website.
     */
    public String homepage;
    /**
     * Name of the company that operates the gateway provider.
     */
    @Element(name = "company_name", required = false)
    public String companyName;

    /**
     * @return A unique identifier for a gateway provider.
     */
    public String getGatewayType() {
        return gatewayType;
    }

    /**
     * @param gatewayType A unique identifier for a gateway provider.
     */
    public void setGatewayType(final String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * @return The full descriptive name of a gateway provider.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The full descriptive name of a gateway provider.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return Fields that are required to authenticate with a gateways. There may be multiple modes. These credentials are stored to be able to
     * authenticate when performing gateway transactions.
     */
    public List<SpreedlyGatewayAuthMode> getAuthModes() {
        return authModes;
    }

    /**
     * @param authModes Fields that are required to authenticate with a gateways. There may be multiple modes. These credentials are stored to be
     *                  able to authenticate when performing gateway transactions.
     */
    public void setAuthModes(final List<SpreedlyGatewayAuthMode> authModes) {
        this.authModes = authModes;
    }

    /**
     * @return A list of properties containing boolean values describing what properties the gateway supports.
     */
    public SpreedlyGatewayCharacteristics getCharacteristics() {
        return characteristics;
    }

    /**
     * @param characteristics A list of properties containing boolean values describing what properties the gateway supports.
     */
    public void setCharacteristics(final SpreedlyGatewayCharacteristics characteristics) {
        this.characteristics = characteristics;
    }

    /**
     * @return List of payment method types that the gateway supports.
     */
    public List<SpreedlyGatewayPaymentMethod> getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * @param paymentMethods List of payment method types that the gateway supports.
     */
    public void setPaymentMethods(final List<SpreedlyGatewayPaymentMethod> paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    /**
     * @return Fields that a gateway defines for a specific purpose but is not implemented by all gateways.
     */
    public List<String> getGatewaySpecificFields() {
        return gatewaySpecificFields;
    }

    /**
     * @param gatewaySpecificFields Fields that a gateway defines for a specific purpose but is not implemented by all gateways.
     */
    public void setGatewaySpecificFields(final List<String> gatewaySpecificFields) {
        this.gatewaySpecificFields = gatewaySpecificFields;
    }

    /**
     * @return Abbreviated country names where the gateway can process payments.
     */
    public List<String> getSupportedCountries() {
        return supportedCountries;
    }

    /**
     * @param supportedCountries Abbreviated country names where the gateway can process payments.
     */
    public void setSupportedCountries(final List<String> supportedCountries) {
        this.supportedCountries = supportedCountries;
    }

    /**
     * @return Global regions where the gateway can process payments.
     */
    public List<String> getRegions() {
        return regions;
    }

    /**
     * @param regions Global regions where the gateway can process payments.
     */
    public void setRegions(final List<String> regions) {
        this.regions = regions;
    }

    /**
     * @return URL of the gateway's website.
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * @param homepage URL of the gateway's website.
     */
    public void setHomepage(final String homepage) {
        this.homepage = homepage;
    }

    /**
     * @return Name of the company that operates the gateway provider.
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName Name of the company that operates the gateway provider.
     */
    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }


    // Private XML hassles below here

    @Element(name = "regions", required = false)
    private void setRegionString(final String in) {
        split(in, regions);
    }

    @Element(name = "supported_countries", required = false)
    private void setSupportedCountryString(final String in) {
        split(in, supportedCountries);
    }

    private void split(final String in, final List<String> list) {
        if (in == null) {
            list.clear();
            return;
        }
        for (String item : in.split(",")) {
            list.add(item.trim());
        }
    }

}
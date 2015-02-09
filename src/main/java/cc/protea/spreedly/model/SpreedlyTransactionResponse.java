package cc.protea.spreedly.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import cc.protea.spreedly.model.internal.SpreedlyErrorSetting;
import cc.protea.spreedly.model.internal.SpreedlyNestedMapAdapter;

@Root(name = "transaction", strict = false)
@XmlAccessorType(XmlAccessType.FIELD)
public class SpreedlyTransactionResponse implements SpreedlyErrorSetting {

    /**
     * Any positive whole number, for example 1234 = $12.34.
     */
    @Element(name = "amount")
    public Integer                  amountInCents;
    /**
     * Value is true if run on a Test Gateway.
     */
    @Element(name = "on_test_gateway")
    public boolean                  onTestGateway;
    /**
     * Date and time of origination.
     */
    @Element(name = "created_at")
    public Date                     createdOn;
    /**
     * Date and time of modification.
     */
    @Element(name = "updated_at")
    public Date                     updatedOn;
    /**
     * ISO 4217 Currency Code e.g., USD, MXN, EUR
     */
    @Element(name = "currency_code")
    public String                   currencyCode;
    /**
     * true if transaction was successful.
     */
    public boolean                  succeeded;
    /**
     * The state of the transaction.
     */
    public SpreedlyTransactionState state;
    /**
     * A unique string generated by Spreedly to identify a transaction.
     */
    public String                   token;
    /**
     * The type of transaction.
     */
    @Element(name = "transaction_type")
    public SpreedlyTransactionType  transactionType;
    /**
     * A tracking number that you can declare. If you don't specify an orderId, we'll pass the token of the transaction as the orderId.
     */
    @Element(name = "order_id")
    public String                   orderId;
    /**
     * IP address of the customer making the purchase.
     */
    @Element(name = "ip")
    public String                   clientIpAddress;
    /**
     * Description of the product or service rendered.
     */
    public String                   description;
    /**
     * Customer email address.
     */
    public String                   email;
    /**
     * Name of merchant.
     */
    @Element(name = "merchant_name_descriptor")
    public String                   merchantNameDescriptor;
    /**
     * Location of merchant.
     */
    @Element(name = "merchant_location_descriptor")
    public String                   merchantLocationDescriptor;
    /**
     * Fields that a gateway defines for a specific purpose but are not implemented by all gateways.
     */
    @XmlJavaTypeAdapter(SpreedlyNestedMapAdapter.class)
    @Element(name = "gateway_specific_fields")
    public Map<String, String> gatewaySpecificFields         = new HashMap<String, String>();
    @XmlJavaTypeAdapter(SpreedlyNestedMapAdapter.class)
    @Element(name = "gateway_specific_response_fields")
    public Map<String, String> gatewaySpecificResponseFields = new HashMap<String, String>();
    @Element(name = "gateway_transaction_id")
    public String                              gatewayTransactionId;
    @Element(name = "retain_on_success")
    public boolean                             retainOnSuccess;
    @Element(name = "payment_method_added")
    public boolean                             paymentMethodAdded;
    public SpreedlyMessage                     message;
    @Element(name = "gateway_token")
    public String                              gatewayToken;
    public SpreedlyTransactionResponseResponse response;
    @Element(name = "payment_method")
    public SpreedlyPaymentMethod               paymentMethod;
    @Element(name = "basis_payment_method")
    public SpreedlyPaymentMethod               basisPaymentMethod;
    @Element(name = "api_urls")
    public SpreedlyApiURLs                     apiUrls;
    /**
     * The callbackUrl specified when the transaction was created
     */
    @Element(name = "callback_url")
    public String                              callbackUrl;
    /**
     * The redirectUrl specified when the transaction was created
     */
    @Element(name = "redirect_url")
    public String                              redirectUrl;
    /**
     * If a checkoutUrl is returned, you need to redirect the customer's browser to it. Doing so will land the customer on the offsite page they
     * will use to authorize payment.
     * See https://docs.spreedly.com/guides/3dsecure/ for more information.
     */
    @Element(name = "checkout_url")
    public String                              checkoutUrl;
    /**
     * If a checkoutForm is returned, you need to render and submit it. You can also parse it (it is always a valid XHTML fragment) and build your
     * own form with the same action and input fields.
     * See https://docs.spreedly.com/guides/3dsecure/ for more information.
     */
    @Element(name = "checkout_form")
    public String                              checkoutForm;
    @Element(name = "setup_response")
    public SpreedlyTransactionResponseDetails  setupResponse;
    @Element(name = "redirect_response")
    public SpreedlyTransactionResponseDetails  redirectResponse;
    @Element(name = "callback_response")
    public SpreedlyTransactionResponseDetails  callbackResponse;

    /**
     * @return Any positive whole number, for example 1234 = $12.34.
     */
    public Integer getAmountInCents() {
        return amountInCents;
    }

    /**
     * @param amountInCents Any positive whole number, for example 1234 = $12.34.
     */
    public SpreedlyTransactionResponse setAmountInCents(final Integer amountInCents) {
        this.amountInCents = amountInCents;
        return this;
    }

    /**
     * @return true if run on a Test Gateway.
     */
    public boolean isOnTestGateway() {
        return onTestGateway;
    }

    /**
     * @param onTestGateway true if run on a Test Gateway.
     */
    public SpreedlyTransactionResponse setOnTestGateway(final boolean onTestGateway) {
        this.onTestGateway = onTestGateway;
        return this;
    }

    /**
     * @return Date and time of origination.
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * @param createdOn Date and time of origination.
     */
    public SpreedlyTransactionResponse setCreatedOn(final Date createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * @return Date and time of modification.
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * @param updatedOn Date and time of modification.
     */
    public SpreedlyTransactionResponse setUpdatedOn(final Date updatedOn) {
        this.updatedOn = updatedOn;
        return this;
    }

    /**
     * @return ISO 4217 Currency Code e.g., USD, MXN, EUR
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * @param currencyCode ISO 4217 Currency Code e.g., USD, MXN, EUR
     */
    public SpreedlyTransactionResponse setCurrencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * @return true if transaction was successful.
     */
    public boolean isSucceeded() {
        return succeeded;
    }

    /**
     * @param succeeded true if transaction was successful.
     */
    public SpreedlyTransactionResponse setSucceeded(final boolean succeeded) {
        this.succeeded = succeeded;
        return this;
    }

    /**
     * @return The state of the transaction.
     */
    public SpreedlyTransactionState getState() {
        return state;
    }

    /**
     * @param state The state of the transaction.
     */
    public SpreedlyTransactionResponse setState(final SpreedlyTransactionState state) {
        this.state = state;
        return this;
    }

    /**
     * @return A unique string generated by Spreedly to identify a transaction.
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token A unique string generated by Spreedly to identify a transaction.
     */
    public SpreedlyTransactionResponse setToken(final String token) {
        this.token = token;
        return this;
    }

    /**
     * @return The type of transaction.
     */
    public SpreedlyTransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * @param transactionType The type of transaction.
     */
    public SpreedlyTransactionResponse setTransactionType(final SpreedlyTransactionType transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * @return A tracking number that you can declare. If you don't specify an orderId, we'll pass the token of the transaction as the orderId.
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId A tracking number that you can declare. If you don't specify an orderId, we'll pass the token of the transaction as the orderId.
     */
    public SpreedlyTransactionResponse setOrderId(final String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * @return IP address of the customer making the purchase.
     */
    public String getClientIpAddress() {
        return clientIpAddress;
    }

    /**
     * @param clientIpAddress IP address of the customer making the purchase.
     */
    public SpreedlyTransactionResponse setClientIpAddress(final String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
        return this;
    }

    /**
     * @return Description of the product or service rendered.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description Description of the product or service rendered.
     */
    public SpreedlyTransactionResponse setDescription(final String description) {
        this.description = description;
        return this;
    }

    /**
     * @return Customer email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email Customer email address.
     */
    public SpreedlyTransactionResponse setEmail(final String email) {
        this.email = email;
        return this;
    }

    /**
     * @return Name of merchant.
     */
    public String getMerchantNameDescriptor() {
        return merchantNameDescriptor;
    }

    /**
     * @param merchantNameDescriptor Name of merchant.
     */
    public SpreedlyTransactionResponse setMerchantNameDescriptor(final String merchantNameDescriptor) {
        this.merchantNameDescriptor = merchantNameDescriptor;
        return this;
    }

    /**
     * @return Location of merchant.
     */
    public String getMerchantLocationDescriptor() {
        return merchantLocationDescriptor;
    }

    /**
     * @param merchantLocationDescriptor Location of merchant.
     */
    public SpreedlyTransactionResponse setMerchantLocationDescriptor(final String merchantLocationDescriptor) {
        this.merchantLocationDescriptor = merchantLocationDescriptor;
        return this;
    }

    /**
     * @return Fields that a gateway defines for a specific purpose but is not implemented by all gateways.
     */
    public Map<String, String> getGatewaySpecificFields() {
        return gatewaySpecificFields;
    }

    /**
     * @param gatewaySpecificFields Fields that a gateway defines for a specific purpose but is not implemented by all gateways.
     */
    public SpreedlyTransactionResponse setGatewaySpecificFields(final Map<String, String> gatewaySpecificFields) {
        this.gatewaySpecificFields = gatewaySpecificFields;
        return this;
    }

    public Map<String, String> getGatewaySpecificResponseFields() {
        return gatewaySpecificResponseFields;
    }

    public SpreedlyTransactionResponse setGatewaySpecificResponseFields(final Map<String, String> gatewaySpecificResponseFields) {
        this.gatewaySpecificResponseFields = gatewaySpecificResponseFields;
        return this;
    }

    public String getGatewayTransactionId() {
        return gatewayTransactionId;
    }

    public SpreedlyTransactionResponse setGatewayTransactionId(final String gatewayTransactionId) {
        this.gatewayTransactionId = gatewayTransactionId;
        return this;
    }

    public boolean isRetainOnSuccess() {
        return retainOnSuccess;
    }

    public SpreedlyTransactionResponse setRetainOnSuccess(final boolean retainOnSuccess) {
        this.retainOnSuccess = retainOnSuccess;
        return this;
    }

    public boolean isPaymentMethodAdded() {
        return paymentMethodAdded;
    }

    public SpreedlyTransactionResponse setPaymentMethodAdded(final boolean paymentMethodAdded) {
        this.paymentMethodAdded = paymentMethodAdded;
        return this;
    }

    public SpreedlyMessage getMessage() {
        return message;
    }

    public SpreedlyTransactionResponse setMessage(final SpreedlyMessage message) {
        this.message = message;
        return this;
    }

    public String getGatewayToken() {
        return gatewayToken;
    }

    public SpreedlyTransactionResponse setGatewayToken(final String gatewayToken) {
        this.gatewayToken = gatewayToken;
        return this;
    }

    public SpreedlyTransactionResponseResponse getResponse() {
        return response;
    }

    public SpreedlyTransactionResponse setResponse(final SpreedlyTransactionResponseResponse response) {
        this.response = response;
        return this;
    }

    public SpreedlyPaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public SpreedlyTransactionResponse setPaymentMethod(final SpreedlyPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public SpreedlyPaymentMethod getBasisPaymentMethod() {
        return basisPaymentMethod;
    }

    public SpreedlyTransactionResponse setBasisPaymentMethod(final SpreedlyPaymentMethod basisPaymentMethod) {
        this.basisPaymentMethod = basisPaymentMethod;
        return this;
    }

    public SpreedlyApiURLs getApiUrls() {
        return apiUrls;
    }

    public SpreedlyTransactionResponse setApiUrls(final SpreedlyApiURLs apiUrls) {
        this.apiUrls = apiUrls;
        return this;
    }

    /**
     * @return the callbackUrl specified when the transaction was created
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * @param callbackUrl the callbackUrl specified when the transaction was created
     */
    public SpreedlyTransactionResponse setCallbackUrl(final String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * @return the redirectUrl specified when the transaction was created
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * @param redirectUrl the redirectUrl specified when the transaction was created
     */
    public SpreedlyTransactionResponse setRedirectUrl(final String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * If a checkoutUrl is returned, you need to redirect the customer's browser to it. Doing so will land the customer on the offsite
     * page they will use to authorize payment.
     *
     * @return the checkout URL
     */
    public String getCheckoutUrl() {
        return checkoutUrl;
    }

    /**
     * If a checkoutUrl is returned, you need to redirect the customer's browser to it. Doing so will land the customer on the offsite
     * page they will use to authorize payment.
     *
     * @param checkoutUrl
     */
    public SpreedlyTransactionResponse setCheckoutUrl(final String checkoutUrl) {
        this.checkoutUrl = checkoutUrl;
        return this;
    }

    /**
     * If a checkoutForm is returned, you need to render and submit it. You can also parse it (it is always a valid XHTML fragment) and
     * build your own form with the same action and input fields.
     * See https://docs.spreedly.com/guides/3dsecure/ for more information.
     *
     * @return the checkoutForm HTML code
     */
    public String getCheckoutForm() {
        return checkoutForm;
    }

    /**
     * If a checkoutForm is returned, you need to render and submit it. You can also parse it (it is always a valid XHTML fragment) and
     * build your own form with the same action and input fields.
     * See https://docs.spreedly.com/guides/3dsecure/ for more information.
     *
     * @param checkoutForm
     */
    public SpreedlyTransactionResponse setCheckoutForm(final String checkoutForm) {
        this.checkoutForm = checkoutForm;
        return this;
    }

    public SpreedlyTransactionResponseDetails getSetupResponse() {
        return setupResponse;
    }

    public SpreedlyTransactionResponse setSetupResponse(final SpreedlyTransactionResponseDetails setupResponse) {
        this.setupResponse = setupResponse;
        return this;
    }

    public SpreedlyTransactionResponseDetails getRedirectResponse() {
        return redirectResponse;
    }

    public SpreedlyTransactionResponse setRedirectResponse(final SpreedlyTransactionResponseDetails redirectResponse) {
        this.redirectResponse = redirectResponse;
        return this;
    }

    public SpreedlyTransactionResponseDetails getCallbackResponse() {
        return callbackResponse;
    }

    public SpreedlyTransactionResponse setCallbackResponse(final SpreedlyTransactionResponseDetails callbackResponse) {
        this.callbackResponse = callbackResponse;
        return this;
    }

    public void setError(final String key, final String error) {
        message = new SpreedlyMessage();
        message.key = key;
        message.message = error;
        this.succeeded = false;
    }
}

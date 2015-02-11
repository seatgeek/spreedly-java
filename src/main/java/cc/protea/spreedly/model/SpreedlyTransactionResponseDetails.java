package cc.protea.spreedly.model;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.Element;

import java.util.Date;

@Default
public class SpreedlyTransactionResponseDetails {

    public boolean         success;
    public SpreedlyMessage message;
    @Element(name = "error_code", required = false)
    public String          errorCode;
    @Element(name = "checkout_url", required = false)
    public String          checkoutUrl;
    /**
     * Date and time of origination.
     */
    @Element(name = "created_at", required = false)
    public Date            createdOn;
    /**
     * Date and time of modification.
     */
    @Element(name = "updated_at", required = false)
    public Date            updatedOn;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(final boolean success) {
        this.success = success;
    }

    public SpreedlyMessage getMessage() {
        return message;
    }

    public void setMessage(final SpreedlyMessage message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(final String errorCode) {
        this.errorCode = errorCode;
    }

    public String getCheckoutUrl() {
        return checkoutUrl;
    }

    public void setCheckoutUrl(final String checkoutUrl) {
        this.checkoutUrl = checkoutUrl;
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

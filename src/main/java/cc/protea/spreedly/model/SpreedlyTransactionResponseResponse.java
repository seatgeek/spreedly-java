package cc.protea.spreedly.model;

import org.simpleframework.xml.Element;

import java.util.Date;

public class SpreedlyTransactionResponseResponse {

    public boolean             success;
    public SpreedlyMessage     message;
    @Element(name = "avs_code", required = false)
    public SpreedlyAvsResponse avsResponse;
    @Element(name = "avs_message", required = false)
    public String              avsMessage;
    @Element(name = "cvv_code", required = false)
    public SpreedlyCvvResponse cvvResponse;
    @Element(name = "cvv_message", required = false)
    public String              cvvMessage;
    public boolean             pending;
    @Element(name = "error_code", required = false)
    public String              errorCode;
    @Element(name = "error_detail", required = false)
    public String              errorDetail;
    public boolean             cancelled;
    /**
     * Date and time of origination.
     */
    @Element(name = "created_at", required = false)
    public Date                createdOn;
    /**
     * Date and time of modification.
     */
    @Element(name = "updated_at", required = false)
    public Date                updatedOn;

}
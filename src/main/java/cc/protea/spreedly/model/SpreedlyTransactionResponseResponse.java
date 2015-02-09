package cc.protea.spreedly.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class SpreedlyTransactionResponseResponse {

    public boolean             success;
    public SpreedlyMessage     message;
    @Element(name = "avs_code")
    public SpreedlyAvsResponse avsResponse;
    @Element(name = "avs_message")
    public String              avsMessage;
    @Element(name = "cvv_code")
    public SpreedlyCvvResponse cvvResponse;
    @Element(name = "cvv_message")
    public String              cvvMessage;
    public boolean             pending;
    @Element(name = "error_code")
    public String              errorCode;
    @Element(name = "error_detail")
    public String              errorDetail;
    public boolean             cancelled;
    /**
     * Date and time of origination.
     */
    @Element(name = "created_at")
    public Date                createdOn;
    /**
     * Date and time of modification.
     */
    @Element(name = "updated_at")
    public Date                updatedOn;

}
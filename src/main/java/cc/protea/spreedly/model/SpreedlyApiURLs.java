package cc.protea.spreedly.model;

import org.simpleframework.xml.Element;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class SpreedlyApiURLs {

    @Element(name = "callback_conversations")
    public String callbackConversations;

    public String getCallbackConversations() {
        return callbackConversations;
    }

    public SpreedlyApiURLs setCallbackConversations(final String callbackConversations) {
        this.callbackConversations = callbackConversations;
        return this;
    }

}

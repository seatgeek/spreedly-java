package cc.protea.spreedly.model.internal;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

import cc.protea.spreedly.model.SpreedlyGatewayAccount;
import cc.protea.spreedly.model.SpreedlyGatewayCredential;

@Root(name = "gateway", strict = false)
public class SpreedlyGatewayAccountUpdate {

    public SpreedlyGatewayAccountUpdate() {
    }

    public SpreedlyGatewayAccountUpdate(final SpreedlyGatewayAccount in) {
        this.gatewayType = in.gatewayType;
        this.credentials.addAll(in.credentials);
    }

    @Element(name = "gateway_type")
    public String gatewayType;

    @ElementList(name = "credentials", entry = "credential")
    public List<SpreedlyGatewayCredential> credentials = new ArrayList<SpreedlyGatewayCredential>();

}

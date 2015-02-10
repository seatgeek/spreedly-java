package cc.protea.spreedly.model.internal;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "gateway", strict = false)
public class SpreedlyPaymentMethodUpdate {

    @Element(name = "remove_from_gateway")
    public String gatewayAccountToken;
}

package cc.protea.spreedly.model.internal;

import java.util.ArrayList;
import java.util.List;

import cc.protea.spreedly.model.SpreedlyGatewayProvider;

@Root(name = "gateways", strict = false)
public class SpreedlyGatewayProviderResponse {

    @Element(name = "gateway")
    public List<SpreedlyGatewayProvider> gateways = new ArrayList<SpreedlyGatewayProvider>();

}
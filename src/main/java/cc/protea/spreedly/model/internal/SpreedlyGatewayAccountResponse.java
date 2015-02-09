package cc.protea.spreedly.model.internal;

import java.util.ArrayList;
import java.util.List;

import cc.protea.spreedly.model.SpreedlyGatewayAccount;

@Root(name = "gateways", strict = false)
public class SpreedlyGatewayAccountResponse {

    @Element(name = "gateway")
    public List<SpreedlyGatewayAccount> gateways = new ArrayList<SpreedlyGatewayAccount>();

}
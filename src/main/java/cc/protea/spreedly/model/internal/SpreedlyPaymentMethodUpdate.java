package cc.protea.spreedly.model.internal;

@Root(name = "gateway", strict = false)
public class SpreedlyPaymentMethodUpdate {

    @Element(name = "remove_from_gateway")
    public String gatewayAccountToken;
}

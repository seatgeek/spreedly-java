package cc.protea.spreedly.model.internal;

import cc.protea.spreedly.model.SpreedlyCreditCard;

public class SpreedlyPaymentMethodCreateRequest {

    @Element(name = "credit_card")
    public SpreedlyCreditCard creditCard;
    @Element(name = "email")
    public String             email;
    @Element(name = "data")
    public Object             data;
}

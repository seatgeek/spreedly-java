package cc.protea.spreedly.model.internal;

import org.simpleframework.xml.Element;

import cc.protea.spreedly.model.SpreedlyCreditCard;

public class SpreedlyPaymentMethodCreateRequest {

    @Element(name = "credit_card", required = false)
    public SpreedlyCreditCard creditCard;
    @Element(name = "email", required = false)
    public String             email;
    @Element(name = "data", required = false)
    public Object             data;
}

package cc.protea.spreedly.model.internal;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import cc.protea.spreedly.model.SpreedlyCreditCard;

@Root(name = "payment_method")
public class SpreedlyPaymentMethodCreateRequest {

    @Element(name = "credit_card", required = false)
    public SpreedlyCreditCard creditCard;
    @Element(name = "email", required = false)
    public String             email;
    @Element(name = "data", required = false)
    public Object             data;
}

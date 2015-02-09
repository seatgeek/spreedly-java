package cc.protea.spreedly.model.internal;

import java.util.ArrayList;
import java.util.List;

import cc.protea.spreedly.model.SpreedlyPaymentMethod;

@Root(name = "payment_methods", strict = false)
public class SpreedlyPaymentMethodListResponse {

    @Element(name = "payment_method")
    public List<SpreedlyPaymentMethod> paymentMethods = new ArrayList<SpreedlyPaymentMethod>();

}
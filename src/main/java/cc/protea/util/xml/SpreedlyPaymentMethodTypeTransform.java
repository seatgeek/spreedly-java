package cc.protea.util.xml;

import org.simpleframework.xml.transform.Transform;

import cc.protea.spreedly.model.SpreedlyPaymentMethodType;

public class SpreedlyPaymentMethodTypeTransform implements Transform<SpreedlyPaymentMethodType> {
    @Override
    public SpreedlyPaymentMethodType read(String string) throws Exception {
        return SpreedlyPaymentMethodType.fromApiValue(string);
    }

    @Override
    public String write(SpreedlyPaymentMethodType object) throws Exception {
        return object.apiValue;
    }
}

package cc.protea.util.xml;

import org.simpleframework.xml.transform.Transform;

import cc.protea.spreedly.model.SpreedlyGatewayPaymentMethod;

public class SpreedlyGatewayPaymentMethodTransform implements Transform<SpreedlyGatewayPaymentMethod> {
    @Override
    public SpreedlyGatewayPaymentMethod read(String string) throws Exception {
        return SpreedlyGatewayPaymentMethod.fromApiValue(string);
    }

    @Override
    public String write(SpreedlyGatewayPaymentMethod object) throws Exception {
        return object.apiValue;
    }
}

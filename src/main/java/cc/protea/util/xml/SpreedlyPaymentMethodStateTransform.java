package cc.protea.util.xml;

import org.simpleframework.xml.transform.Transform;

import cc.protea.spreedly.model.SpreedlyPaymentMethodState;

public class SpreedlyPaymentMethodStateTransform implements Transform<SpreedlyPaymentMethodState> {
    @Override
    public SpreedlyPaymentMethodState read(String string) throws Exception {
        return SpreedlyPaymentMethodState.fromApiValue(string);
    }

    @Override
    public String write(SpreedlyPaymentMethodState object) throws Exception {
        return object.apiValue;
    }
}

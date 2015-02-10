package cc.protea.util.xml;

import org.simpleframework.xml.transform.Transform;

import cc.protea.spreedly.model.SpreedlyTransactionState;

public class SpreedlyTransactionStateTransform implements Transform<SpreedlyTransactionState> {
    @Override
    public SpreedlyTransactionState read(String string) throws Exception {
        return SpreedlyTransactionState.fromApiValue(string);
    }

    @Override
    public String write(SpreedlyTransactionState object) throws Exception {
        return object.apiValue;
    }
}

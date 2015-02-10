package cc.protea.util.xml;

import org.simpleframework.xml.transform.Transform;

import cc.protea.spreedly.model.SpreedlyTransactionType;

public class SpreedlyTransactionTypeTransform implements Transform<SpreedlyTransactionType> {
    @Override
    public SpreedlyTransactionType read(String string) throws Exception {
        return SpreedlyTransactionType.fromApiValue(string);
    }

    @Override
    public String write(SpreedlyTransactionType object) throws Exception {
        return object.apiValue;
    }
}

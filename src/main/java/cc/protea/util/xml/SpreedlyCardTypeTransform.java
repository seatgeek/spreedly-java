package cc.protea.util.xml;

import org.simpleframework.xml.transform.Transform;

import cc.protea.spreedly.model.SpreedlyCardType;

public class SpreedlyCardTypeTransform implements Transform<SpreedlyCardType> {
    @Override
    public SpreedlyCardType read(String string) throws Exception {
        return SpreedlyCardType.fromApiValue(string);
    }

    @Override
    public String write(SpreedlyCardType object) throws Exception {
        return object.apiValue;
    }
}

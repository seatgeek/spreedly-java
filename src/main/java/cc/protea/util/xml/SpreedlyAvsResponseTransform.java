package cc.protea.util.xml;

import org.simpleframework.xml.transform.Transform;

import cc.protea.spreedly.model.SpreedlyAvsResponse;

public class SpreedlyAvsResponseTransform implements Transform<SpreedlyAvsResponse> {
    @Override
    public SpreedlyAvsResponse read(String string) throws Exception {
        return SpreedlyAvsResponse.fromApiValue(string);
    }

    @Override
    public String write(SpreedlyAvsResponse object) throws Exception {
        return object.apiValue;
    }
}


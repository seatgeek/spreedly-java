package cc.protea.util.xml;

import org.simpleframework.xml.transform.Transform;

import cc.protea.spreedly.model.SpreedlyCvvResponse;

public class SpreedlyCvvResponseTransform implements Transform<SpreedlyCvvResponse> {
    @Override
    public SpreedlyCvvResponse read(String string) throws Exception {
        return SpreedlyCvvResponse.fromApiValue(string);
    }

    @Override
    public String write(SpreedlyCvvResponse object) throws Exception {
        return object.apiValue;
    }
}

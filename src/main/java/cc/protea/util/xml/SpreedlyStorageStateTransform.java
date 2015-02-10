package cc.protea.util.xml;

import org.simpleframework.xml.transform.Transform;

import cc.protea.spreedly.model.SpreedlyStorageState;

public class SpreedlyStorageStateTransform implements Transform<SpreedlyStorageState> {
    @Override
    public SpreedlyStorageState read(String string) throws Exception {
        return SpreedlyStorageState.fromApiValue(string);
    }

    @Override
    public String write(SpreedlyStorageState object) throws Exception {
        return object.apiValue;
    }
}

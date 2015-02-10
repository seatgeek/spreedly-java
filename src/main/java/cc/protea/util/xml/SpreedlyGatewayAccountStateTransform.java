package cc.protea.util.xml;

import org.simpleframework.xml.transform.Transform;

import cc.protea.spreedly.model.SpreedlyGatewayAccountState;

public class SpreedlyGatewayAccountStateTransform implements Transform<SpreedlyGatewayAccountState> {
    @Override
    public SpreedlyGatewayAccountState read(String string) throws Exception {
        return SpreedlyGatewayAccountState.fromApiValue(string);
    }

    @Override
    public String write(SpreedlyGatewayAccountState object) throws Exception {
        return object.apiValue;
    }
}

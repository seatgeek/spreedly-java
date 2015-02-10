package cc.protea.spreedly.model;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

@Root
@Convert(SpreedlyGatewayAccountState.Converter.class)
public enum SpreedlyGatewayAccountState {

    RETAINED("retained"),
    REDACTED("redacted");

    public final String apiValue;

    SpreedlyGatewayAccountState(String apiValue) {
        this.apiValue = apiValue;
    }

    public static SpreedlyGatewayAccountState fromApiValue(String apiValue) {
        for (SpreedlyGatewayAccountState spreedlyGatewayAccountState : values()) {
            if (spreedlyGatewayAccountState.apiValue.equals(apiValue)) {
                return spreedlyGatewayAccountState;
            }
        }

        return null;
    }

    public static class Converter implements org.simpleframework.xml.convert.Converter<SpreedlyGatewayAccountState> {
        @Override
        public SpreedlyGatewayAccountState read(InputNode inputNode) throws Exception {
            return fromApiValue(inputNode.getValue());
        }

        @Override
        public void write(OutputNode outputNode, SpreedlyGatewayAccountState spreedlyGatewayAccountState) throws Exception {
            outputNode.setValue(spreedlyGatewayAccountState.apiValue);
        }
    }
}

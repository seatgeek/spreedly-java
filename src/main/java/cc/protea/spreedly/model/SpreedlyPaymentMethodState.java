package cc.protea.spreedly.model;

import org.simpleframework.xml.convert.Convert;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

@Convert(SpreedlyPaymentMethodState.Converter.class)
public enum SpreedlyPaymentMethodState {

    CACHED("cached"),
    RETAINED("retained"),
    REDACTED("redacted");

    public final String apiValue;

    SpreedlyPaymentMethodState(String apiValue) {
        this.apiValue = apiValue;
    }

    public static SpreedlyPaymentMethodState fromApiValue(String apiValue) {
        for (SpreedlyPaymentMethodState spreedlyPaymentMethodState : values()) {
            if (spreedlyPaymentMethodState.apiValue.equals(apiValue)) {
                return spreedlyPaymentMethodState;
            }
        }

        return null;
    }

    public static class Converter implements org.simpleframework.xml.convert.Converter<SpreedlyPaymentMethodState> {
        @Override
        public SpreedlyPaymentMethodState read(InputNode inputNode) throws Exception {
            return fromApiValue(inputNode.getValue());
        }

        @Override
        public void write(OutputNode outputNode, SpreedlyPaymentMethodState spreedlyPaymentMethodStateCardType) throws Exception {
            outputNode.setValue(spreedlyPaymentMethodStateCardType.apiValue);
        }
    }

}
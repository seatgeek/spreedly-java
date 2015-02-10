package cc.protea.spreedly.model;

import org.simpleframework.xml.convert.Convert;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

@Convert(SpreedlyGatewayPaymentMethod.Converter.class)
public enum SpreedlyGatewayPaymentMethod {

    CREDIT_CARD("credit_card"),
    BANK_ACCOUNT("bank_account"),
    PAYPAL("paypal");

    private final String apiValue;

    SpreedlyGatewayPaymentMethod(String apiValue) {
        this.apiValue = apiValue;
    }

    public static SpreedlyGatewayPaymentMethod fromApiValue(String apiValue) {
        for (SpreedlyGatewayPaymentMethod spreedlyGatewayPaymentMethod : values()) {
            if (spreedlyGatewayPaymentMethod.apiValue.equals(apiValue)) {
                return spreedlyGatewayPaymentMethod;
            }
        }

        return null;
    }

    public static class Converter implements org.simpleframework.xml.convert.Converter<SpreedlyGatewayPaymentMethod> {
        @Override
        public SpreedlyGatewayPaymentMethod read(InputNode inputNode) throws Exception {
            return fromApiValue(inputNode.getValue());
        }

        @Override
        public void write(OutputNode outputNode, SpreedlyGatewayPaymentMethod spreedlyGatewayPaymentMethod) throws Exception {
            outputNode.setValue(spreedlyGatewayPaymentMethod.apiValue);
        }
    }
}

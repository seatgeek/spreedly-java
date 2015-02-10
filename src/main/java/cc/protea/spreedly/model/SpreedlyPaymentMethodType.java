package cc.protea.spreedly.model;

import org.simpleframework.xml.convert.Convert;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

@Convert(SpreedlyPaymentMethodType.Converter.class)
public enum SpreedlyPaymentMethodType {

    CREDIT_CARD("credit_card"),
    BANK_ACCOUNT("bank_account"),
    DWOLLA("dwolla"),
    PAYPAL("paypal");

    private final String apiValue;

    SpreedlyPaymentMethodType(String apiValue) {
        this.apiValue = apiValue;
    }

    public static SpreedlyPaymentMethodType fromApiValue(String apiValue) {
        for (SpreedlyPaymentMethodType spreedlyPaymentMethodType : values()) {
            if (spreedlyPaymentMethodType.apiValue.equals(apiValue)) {
                return spreedlyPaymentMethodType;
            }
        }

        return null;
    }

    public static class Converter implements org.simpleframework.xml.convert.Converter<SpreedlyPaymentMethodType> {
        @Override
        public SpreedlyPaymentMethodType read(InputNode inputNode) throws Exception {
            return fromApiValue(inputNode.getValue());
        }

        @Override
        public void write(OutputNode outputNode, SpreedlyPaymentMethodType spreedlyPaymentMethodType) throws Exception {
            outputNode.setValue(spreedlyPaymentMethodType.apiValue);
        }
    }

}
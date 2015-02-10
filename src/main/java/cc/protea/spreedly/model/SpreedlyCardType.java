package cc.protea.spreedly.model;

import org.simpleframework.xml.convert.Convert;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

@Convert(SpreedlyCardType.Converter.class)
public enum SpreedlyCardType {

    VISA("visa"),
    MASTERCARD("master"),
    AMEX("american_express"),
    DISCOVER("discover"),
    DANKORT("dankort"),
    JCB("jcb"),
    DINERS_CLUB("diners_club");

    private final String apiValue;

    SpreedlyCardType(String apiValue) {
        this.apiValue = apiValue;
    }

    public static SpreedlyCardType fromApiValue(String apiValue) {
        for (SpreedlyCardType spreedlyCardType : values()) {
            if (spreedlyCardType.apiValue.equals(apiValue)) {
                return spreedlyCardType;
            }
        }

        return null;
    }

    public static class Converter implements org.simpleframework.xml.convert.Converter<SpreedlyCardType> {
        @Override
        public SpreedlyCardType read(InputNode inputNode) throws Exception {
            return fromApiValue(inputNode.getValue());
        }

        @Override
        public void write(OutputNode outputNode, SpreedlyCardType spreedlyCardType) throws Exception {
            outputNode.setValue(spreedlyCardType.apiValue);
        }
    }

}
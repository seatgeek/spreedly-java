package cc.protea.spreedly.model;

import org.simpleframework.xml.convert.Convert;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@Convert(SpreedlyTransactionType.Converter.class)
public enum SpreedlyTransactionType {

    AUTHORIZATION("Authorization"),
    CAPTURE("Capture"),
    CREDIT("Credit"),
    RECACHE_SENSITIVE_DATA("RecacheSensitiveData");

    private final String apiValue;

    SpreedlyTransactionType(String apiValue) {
        this.apiValue = apiValue;
    }

    public static SpreedlyTransactionType fromApiValue(String apiValue) {
        for (SpreedlyTransactionType spreedlyspreedlyTransactionTypeType : values()) {
            if (spreedlyspreedlyTransactionTypeType.apiValue.equals(apiValue)) {
                return spreedlyspreedlyTransactionTypeType;
            }
        }

        return null;
    }

    public static class Converter implements org.simpleframework.xml.convert.Converter<SpreedlyTransactionType> {
        @Override
        public SpreedlyTransactionType read(InputNode inputNode) throws Exception {
            return fromApiValue(inputNode.getValue());
        }

        @Override
        public void write(OutputNode outputNode, SpreedlyTransactionType spreedlyTransactionType) throws Exception {
            outputNode.setValue(spreedlyTransactionType.apiValue);
        }
    }

}
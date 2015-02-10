package cc.protea.spreedly.model;

import org.simpleframework.xml.convert.Convert;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

@Convert(SpreedlyCvvResponse.Converter.class)
public enum SpreedlyCvvResponse {

    SUSPICIOUS_TRANSACTION("D"),
    FAILED_DATA_VALIDATION_CHECK("I"),
    MATCH("M"),
    NO_MATCH("N"),
    NOT_PROCESSED("P"),
    SHOULD_HAVE_BEEN_PRESENT("S"),
    ISSUER_UNABLE_TO_PROCESS_REQUEST("U"),
    CARD_DOES_NOT_SUPPORT_VERIFICATION("X");

    private final String apiValue;

    SpreedlyCvvResponse(String apiValue) {
        this.apiValue = apiValue;
    }

    public static SpreedlyCvvResponse fromApiValue(String apiValue) {
        for (SpreedlyCvvResponse spreedlyCvvResponse : values()) {
            if (spreedlyCvvResponse.apiValue.equals(apiValue)) {
                return spreedlyCvvResponse;
            }
        }

        return null;
    }

    public static class Converter implements org.simpleframework.xml.convert.Converter<SpreedlyCvvResponse> {
        @Override
        public SpreedlyCvvResponse read(InputNode inputNode) throws Exception {
            return fromApiValue(inputNode.getValue());
        }

        @Override
        public void write(OutputNode outputNode, SpreedlyCvvResponse spreedlyCvvResponse) throws Exception {
            outputNode.setValue(spreedlyCvvResponse.apiValue);
        }
    }
}
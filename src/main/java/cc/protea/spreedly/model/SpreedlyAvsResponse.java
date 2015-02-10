package cc.protea.spreedly.model;

import org.simpleframework.xml.convert.Convert;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

@Convert(SpreedlyAvsResponse.Converter.class)
public enum SpreedlyAvsResponse {

    POSTAL_CODE_MISMATCH("A"),
    POSTAL_CODE_NOT_VERIFIED("B"),
    ADDRESS_AND_POSTAL_CODE_MISMATCH_C("C"),
    ADDRESS_AND_POSTAL_CODE_MATCH_D("D"),
    AVS_DATA_INVALID("E"),
    NAME_MISMATCH_POSTAL_CODE_MATCH("F"),
    INTERNATIONAL_BANK_AVS_UNSUPPORTED("G"),
    NAME_MISMATCH_ADDRESS_AND_POSTAL_CODE_MATCH("H"),
    ADDRESS_NOT_VERIFIED("I"),
    NAME_ADDRESS_AND_POSTAL_CODE_MATCH_J("J"),
    NAME_MATCH_ADDRESS_AND_POSTAL_CODE_MISMATCH("K"),
    NAME_AND_POSTAL_CODE_MATCH_ADDRESS_MISMATCH("L"),
    ADDRESS_AND_POSTAL_CODE_MATCH_M("M"),
    ADDRESS_AND_POSTAL_CODE_MISMATCH_N("N"),
    NAME_AND_ADDRESS_MATCH_POSTAL_CODE_MISMATCH("O"),
    POSTAL_CODE_MATCH_ADDRESS_NOT_VERIFIED("P"),
    NAME_ADDRESS_AND_POSTAL_CODE_MATCH_Q("Q"),
    SYSTEM_UNAVAILABLE("R"),
    BANK_AVS_UNSUPPORTED("S"),
    NAME_MISMATCH_ADDRESS_MATCH("T"),
    ADDRESS_INFORMATION_UNAVAILABLE("U"),
    NAME_ADDRESS_AND_POSTAL_CODE_MATCH_V("V"),
    ADDRESS_MISMATCH_POSTAL_CODE_MATCH_W("W"),
    ADDRESS_AND_POSTAL_CODE_MATCH_X("X"),
    ADDRESS_AND_POSTAL_CODE_MATCH_Y("Y"),
    ADDRESS_MISMATCH_POSTAL_CODE_MATCH_Z("Z");

    public final String apiValue;

    SpreedlyAvsResponse(String apiValue) {
        this.apiValue = apiValue;
    }

    public static SpreedlyAvsResponse fromApiValue(String apiValue) {
        for (SpreedlyAvsResponse spreedlyAvsResponse : values()) {
            if (spreedlyAvsResponse.apiValue.equals(apiValue)) {
                return spreedlyAvsResponse;
            }
        }

        return null;
    }

    public static class Converter implements org.simpleframework.xml.convert.Converter<SpreedlyAvsResponse> {
        @Override
        public SpreedlyAvsResponse read(InputNode inputNode) throws Exception {
            return fromApiValue(inputNode.getValue());
        }

        @Override
        public void write(OutputNode outputNode, SpreedlyAvsResponse spreedlyAvsResponse) throws Exception {
            outputNode.setValue(spreedlyAvsResponse.apiValue);
        }
    }
}
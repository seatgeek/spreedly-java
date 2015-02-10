package cc.protea.spreedly.model;

import org.simpleframework.xml.convert.Convert;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

@Convert(SpreedlyStorageState.Converter.class)
public enum SpreedlyStorageState {

    RETAINED("retained"),
    CACHED("cached"),
    REDACTED("redacted");

    private final String apiValue;

    SpreedlyStorageState(String apiValue) {
        this.apiValue = apiValue;
    }

    public static SpreedlyStorageState fromApiValue(String apiValue) {
        for (SpreedlyStorageState spreedlyStorageState : values()) {
            if (spreedlyStorageState.apiValue.equals(apiValue)) {
                return spreedlyStorageState;
            }
        }

        return null;
    }

    public static class Converter implements org.simpleframework.xml.convert.Converter<SpreedlyStorageState> {
        @Override
        public SpreedlyStorageState read(InputNode inputNode) throws Exception {
            return fromApiValue(inputNode.getValue());
        }

        @Override
        public void write(OutputNode outputNode, SpreedlyStorageState spreedlyStorageStateCardType) throws Exception {
            outputNode.setValue(spreedlyStorageStateCardType.apiValue);
        }
    }

}
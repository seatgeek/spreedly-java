package cc.protea.spreedly.model;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Convert;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

@Root
@Convert(SpreedlyTransactionState.Converter.class)
public enum SpreedlyTransactionState {

    /**
     * The transaction has succeeded and funds have been received.
     */
    SUCCEEDED("succeeded"),
    /**
     * The transaction has been accepted. Funds have not yet been received.
     */
    PROCESSING("processing"),
    /**
     * The transaction needs further processing which typically involves redirecting the
     * customer to a redirect_url to allow them to specify a payment method.
     */
    PENDING("pending"),
    /**
     * The transaction failed. This could be caused by a number of things such as the payment method
     * not being valid, the payment method being redacted, etc.
     */
    FAILED("failed"),
    /**
     * The transaction failed because the attempt to setup the transaction on the offsite gateway failed.
     */
    GATEWAY_SETUP_FAILED("gateway_setup_failed"),
    /**
     * The transaction failed because the gateway declined the charge for some reason.
     */
    GATEWAY_PROCESSING_FAILED("gateway_processing_failed"),
    /**
     * We had difficulty communicating with the service and we're unsure what the result
     * of the operation was. (timeouts, connection errors, etc).
     */
    GATEWAY_PROCESSING_RESULT_UNKNOWN("gateway_processing_result_unknown");

    public final String apiValue;

    SpreedlyTransactionState(String apiValue) {
        this.apiValue = apiValue;
    }


    public static SpreedlyTransactionState fromApiValue(String apiValue) {
        for (SpreedlyTransactionState spreedlyTransactionState : values()) {
            if (spreedlyTransactionState.apiValue.equals(apiValue)) {
                return spreedlyTransactionState;
            }
        }

        return null;
    }

    public static class Converter implements org.simpleframework.xml.convert.Converter<SpreedlyTransactionState> {
        @Override
        public SpreedlyTransactionState read(InputNode inputNode) throws Exception {
            return fromApiValue(inputNode.getValue());
        }

        @Override
        public void write(OutputNode outputNode, SpreedlyTransactionState spreedlyspreedlyTransactionStateAccountState) throws Exception {
            outputNode.setValue(spreedlyspreedlyTransactionStateAccountState.apiValue);
        }
    }
}
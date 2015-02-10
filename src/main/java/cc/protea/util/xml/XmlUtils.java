package cc.protea.util.xml;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.transform.RegistryMatcher;

import java.util.Date;

import cc.protea.spreedly.model.SpreedlyAvsResponse;
import cc.protea.spreedly.model.SpreedlyCardType;
import cc.protea.spreedly.model.SpreedlyCvvResponse;
import cc.protea.spreedly.model.SpreedlyGatewayAccountState;
import cc.protea.spreedly.model.SpreedlyGatewayPaymentMethod;
import cc.protea.spreedly.model.SpreedlyPaymentMethodState;
import cc.protea.spreedly.model.SpreedlyPaymentMethodType;
import cc.protea.spreedly.model.SpreedlyStorageState;
import cc.protea.spreedly.model.SpreedlyTransactionState;
import cc.protea.spreedly.model.SpreedlyTransactionType;

public class XmlUtils {
    public static Serializer getSerializer() {
        RegistryMatcher m = new RegistryMatcher();
        m.bind(Date.class, new DateFormatTransformer());
        m.bind(SpreedlyAvsResponse.class, new SpreedlyAvsResponseTransform());
        m.bind(SpreedlyCardType.class, new SpreedlyCardTypeTransform());
        m.bind(SpreedlyCvvResponse.class, new SpreedlyCvvResponseTransform());
        m.bind(SpreedlyGatewayAccountState.class, new SpreedlyGatewayAccountStateTransform());
        m.bind(SpreedlyGatewayPaymentMethod.class, new SpreedlyGatewayPaymentMethodTransform());
        m.bind(SpreedlyPaymentMethodState.class, new SpreedlyPaymentMethodStateTransform());
        m.bind(SpreedlyPaymentMethodType.class, new SpreedlyPaymentMethodTypeTransform());
        m.bind(SpreedlyStorageState.class, new SpreedlyStorageStateTransform());
        m.bind(SpreedlyTransactionState.class, new SpreedlyTransactionStateTransform());
        m.bind(SpreedlyTransactionType.class, new SpreedlyTransactionTypeTransform());

        return new Persister(m);
    }
}

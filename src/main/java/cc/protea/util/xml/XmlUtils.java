package cc.protea.util.xml;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.strategy.Strategy;
import org.simpleframework.xml.transform.RegistryMatcher;

import java.io.File;
import java.io.StringWriter;
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
    public static Serializer serializer;

    public static <T> T parse(Class<T> clazz, File xml) throws Exception {
        return getSerializer().read(clazz, xml, false);
    }

    public static <T> T parse(Class<T> clazz, String xml) throws Exception {
        return getSerializer().read(clazz, xml, false);
    }

    public static Serializer getSerializer() {
        if (serializer == null) {
            Strategy strategy = new AnnotationStrategy();

            RegistryMatcher matcher = new RegistryMatcher();

            matcher.bind(Date.class, new DateFormatTransformer());
            matcher.bind(SpreedlyAvsResponse.class, new SpreedlyAvsResponseTransform());
            matcher.bind(SpreedlyCardType.class, new SpreedlyCardTypeTransform());
            matcher.bind(SpreedlyCvvResponse.class, new SpreedlyCvvResponseTransform());
            matcher.bind(SpreedlyGatewayAccountState.class, new SpreedlyGatewayAccountStateTransform());
            matcher.bind(SpreedlyGatewayPaymentMethod.class, new SpreedlyGatewayPaymentMethodTransform());
            matcher.bind(SpreedlyPaymentMethodState.class, new SpreedlyPaymentMethodStateTransform());
            matcher.bind(SpreedlyPaymentMethodType.class, new SpreedlyPaymentMethodTypeTransform());
            matcher.bind(SpreedlyStorageState.class, new SpreedlyStorageStateTransform());
            matcher.bind(SpreedlyTransactionState.class, new SpreedlyTransactionStateTransform());
            matcher.bind(SpreedlyTransactionType.class, new SpreedlyTransactionTypeTransform());

            serializer = new Persister(strategy, matcher);
        }

        return serializer;
    }

    public static void write(Object object, StringWriter writer) throws Exception {
        getSerializer().write(object, writer);
    }
}

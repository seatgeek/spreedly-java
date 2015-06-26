package cc.protea.spreedly.model;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Default(required = false)
@Root(name = "payment_method", strict = false)
public class SpreedlyPaymentMethodRecache {

    @Element(name="credit_card")
    SpreedlyCreditCard card;

    public SpreedlyCreditCard getCard() {
        return card;
    }

    public void setCard(SpreedlyCreditCard card) {
        this.card = card;
    }
}
package cc.protea.spreedly.model

import org.simpleframework.xml.Default
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Default(required = false)
@Root(name = "transaction")
data class SpreedlyBankAccountResponse(

        var succeeded: Boolean = false,

        @field:Element(name = "payment_method")
        var paymentMethod: SpreedlyBankAccountPaymentMethod? = null
)
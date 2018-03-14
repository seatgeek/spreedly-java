package cc.protea.spreedly.model

import org.simpleframework.xml.Default
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Default(required = false)
@Root(name = "payment_method")
data class SpreedlyBankAccountRequest(

    @field:Element(name = "bank_account")
    var bankAccount: SpreedlyBankAccount? = null,

    @field:Element(required = false)
    var data: Any? = null
)

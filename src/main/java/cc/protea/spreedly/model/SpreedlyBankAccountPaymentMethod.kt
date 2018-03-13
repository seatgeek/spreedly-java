package cc.protea.spreedly.model

import org.simpleframework.xml.Default
import org.simpleframework.xml.Element

@Default(required = false)
data class SpreedlyBankAccountPaymentMethod(

    var token: String? = null,

    @field:Element(name = "first_name")
    var firstName: String? = null,

    @field:Element(name = "last_name")
    var lastName: String? = null,

    @field:Element(name = "routing_number_display_digits", required = false)
    var routingNumberDisplayDigits: String? = null,

    @field:Element(name = "account_number_display_digits", required = false)
    var accountNumberDisplayDigits: String? = null
)

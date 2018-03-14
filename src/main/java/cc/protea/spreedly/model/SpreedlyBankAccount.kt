package cc.protea.spreedly.model

import org.simpleframework.xml.Default
import org.simpleframework.xml.Element

@Default(required = false)
data class SpreedlyBankAccount(

        @field:Element(name = "first_name")
        var firstName: String? = null,

        @field:Element(name = "last_name")
        var lastName: String? = null,

        @field:Element(name = "bank_routing_number")
        var bankRoutingNumber: String? = null,

        @field:Element(name = "bank_account_number")
        var bankAccountNumber: String? = null,

        @field:Element(name = "phone_number")
        var phoneNumber: String? = null,

        var email: String? = null,

        var address1: String? = null,

        var address2: String? = null,

        var city: String? = null,

        var state: String? = null,

        var zip: String? = null
) {

    override fun toString(): String {
        return "SpreedlyBankAccount(firstName=$firstName)"
    }
}

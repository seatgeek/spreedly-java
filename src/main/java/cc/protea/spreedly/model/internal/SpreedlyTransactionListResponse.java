package cc.protea.spreedly.model.internal;

import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

import cc.protea.spreedly.model.SpreedlyTransactionResponse;

@Root(name = "transactions", strict = false)
public class SpreedlyTransactionListResponse {

    @Element(name = "transaction")
    public List<SpreedlyTransactionResponse> transactions = new ArrayList<SpreedlyTransactionResponse>();

}
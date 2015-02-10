package cc.protea.spreedly.model.internal;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.simpleframework.xml.Serializer;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import cc.protea.spreedly.model.SpreedlyTransactionResponse;
import cc.protea.util.xml.XmlUtils;

// Example taken from https://docs.spreedly.com/payment-gateways/paypal/
//
// This tests most of the stranger XML parsing.

public class SpreedlyTransactionResponseTest {

    File xml;

    private Serializer persister;

    @Before
    public void before() throws URISyntaxException {
        persister = XmlUtils.getSerializer();

        URL url = getClass().getResource("/SpreedlyTransactionResponse.xml");
        xml = new File(url.toURI());
    }

    @Test
    public void test() throws Exception {
        // 2014-11-10T16:28:44-05:00

        SpreedlyTransactionResponse response = persister.read(SpreedlyTransactionResponse.class, xml, false);
        Assert.assertNotNull(response);
        Assert.assertEquals("1vcqQrU0d9f4NB5vdnx5wsoaAss", response.token);
        Assert.assertNotNull(response.gatewaySpecificResponseFields);
        Assert.assertFalse(response.gatewaySpecificResponseFields.isEmpty());
        Assert.assertEquals("wax@example.com", response.gatewaySpecificResponseFields.get("payer"));
        Assert.assertEquals("messages.transaction_succeeded", response.message.key);
        Assert.assertEquals("Succeeded!", response.message.message);
    }
}

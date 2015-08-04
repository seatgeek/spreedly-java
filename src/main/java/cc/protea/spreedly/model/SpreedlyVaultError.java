package cc.protea.spreedly.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Text;

@Root(name = "error")
public class SpreedlyVaultError {

    @Text(required = false)
    public String error_message;

    @Attribute(name = "attribute", required = false)
    public String error_field;

    @Attribute(name = "key", required = false)
    public String error_key;
}

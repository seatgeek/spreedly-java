package cc.protea.spreedly.model.internal;

import org.simpleframework.xml.Root;

@Root(name = "hash", strict = false)
public class SpreedlyErrorHash {

    public String status;
    public String error;
}

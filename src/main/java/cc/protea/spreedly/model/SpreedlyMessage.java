package cc.protea.spreedly.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

public class SpreedlyMessage {

    /**
     * The constant Spreedly key representing the results, useful for translation.
     */
    @Attribute(name = "key", required = false)
    public String key;

    /**
     * A brief description of the results of the transaction.
     */
    @Text
    public String message;

    /**
     * @return A brief description of the results of the transaction.
     */
    public String toString() {
        return message;
    }

    /**
     * @return The constant Spreedly key representing the results, useful for translation.
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key The constant Spreedly key representing the results, useful for translation.
     */
    public void setKey(final String key) {
        this.key = key;
    }

    /**
     * @return A brief description of the results of the transaction.
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message A brief description of the results of the transaction.
     */
    public void setMessage(final String message) {
        this.message = message;
    }


}

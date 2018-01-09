package cc.protea.spreedly;

import android.util.Base64;

public class DefaultBase64Converter implements Base64Converter {

    @Override
    public String encode(String input) {
        return Base64.encodeToString(input.getBytes(), Base64.DEFAULT);
    }
}

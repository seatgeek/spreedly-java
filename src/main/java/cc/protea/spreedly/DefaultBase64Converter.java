package cc.protea.spreedly;

import javax.xml.bind.DatatypeConverter;

public class DefaultBase64Converter implements Base64Converter {

    @Override
    public String encode(String input) {
        return DatatypeConverter.printBase64Binary(input.getBytes());
    }
}

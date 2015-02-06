package cc.protea.spreedly.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum(String.class)
public enum SpreedlyAvsResponse {

    @XmlEnumValue("A")POSTAL_CODE_MISMATCH,
    @XmlEnumValue("B")POSTAL_CODE_NOT_VERIFIED,
    @XmlEnumValue("C")ADDRESS_AND_POSTAL_CODE_MISMATCH_C,
    @XmlEnumValue("D")ADDRESS_AND_POSTAL_CODE_MATCH_D,
    @XmlEnumValue("E")AVS_DATA_INVALID,
    @XmlEnumValue("F")NAME_MISMATCH_POSTAL_CODE_MATCH,
    @XmlEnumValue("G")INTERNATIONAL_BANK_AVS_UNSUPPORTED,
    @XmlEnumValue("H")NAME_MISMATCH_ADDRESS_AND_POSTAL_CODE_MATCH,
    @XmlEnumValue("I")ADDRESS_NOT_VERIFIED,
    @XmlEnumValue("J")NAME_ADDRESS_AND_POSTAL_CODE_MATCH_J,
    @XmlEnumValue("K")NAME_MATCH_ADDRESS_AND_POSTAL_CODE_MISMATCH,
    @XmlEnumValue("L")NAME_AND_POSTAL_CODE_MATCH_ADDRESS_MISMATCH,
    @XmlEnumValue("M")ADDRESS_AND_POSTAL_CODE_MATCH_M,
    @XmlEnumValue("N")ADDRESS_AND_POSTAL_CODE_MISMATCH_N,
    @XmlEnumValue("O")NAME_AND_ADDRESS_MATCH_POSTAL_CODE_MISMATCH,
    @XmlEnumValue("P")POSTAL_CODE_MATCH_ADDRESS_NOT_VERIFIED,
    @XmlEnumValue("Q")NAME_ADDRESS_AND_POSTAL_CODE_MATCH_Q,
    @XmlEnumValue("R")SYSTEM_UNAVAILABLE,
    @XmlEnumValue("S")BANK_AVS_UNSUPPORTED,
    @XmlEnumValue("T")NAME_MISMATCH_ADDRESS_MATCH,
    @XmlEnumValue("U")ADDRESS_INFORMATION_UNAVAILABLE,
    @XmlEnumValue("V")NAME_ADDRESS_AND_POSTAL_CODE_MATCH_V,
    @XmlEnumValue("W")ADDRESS_MISMATCH_POSTAL_CODE_MATCH_W,
    @XmlEnumValue("X")ADDRESS_AND_POSTAL_CODE_MATCH_X,
    @XmlEnumValue("Y")ADDRESS_AND_POSTAL_CODE_MATCH_Y,
    @XmlEnumValue("Z")ADDRESS_MISMATCH_POSTAL_CODE_MATCH_Z
}

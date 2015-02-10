package cc.protea.util.xml;

import org.simpleframework.xml.transform.Transform;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
 * Custom parsing for Spreedly-specific datetime format (for Java 6 support)
 */
public class DateFormatTransformer implements Transform<Date> {
    private DateFormat dateFormat;

    public DateFormatTransformer() {
        dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US);
    }


    @Override
    public Date read(String value) throws Exception {
        String former = value.substring(0, 20);
        String latter = value.substring(20).replace(":", "");
        return dateFormat.parse(former + latter);

    }


    @Override
    public String write(Date value) throws Exception {
        return dateFormat.format(value);
    }

}
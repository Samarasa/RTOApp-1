package g.a.c;

import g.a.e;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

class d extends ThreadLocal<DateFormat> {
    d() {
    }

    /* access modifiers changed from: protected */
    public DateFormat initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(e.o);
        return simpleDateFormat;
    }
}

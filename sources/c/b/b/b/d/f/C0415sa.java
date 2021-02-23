package c.b.b.b.d.f;

import android.net.Uri;
import java.util.Map;

/* renamed from: c.b.b.b.d.f.sa  reason: case insensitive filesystem */
public final class C0415sa {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, String>> f4563a;

    C0415sa(Map<String, Map<String, String>> map) {
        this.f4563a = map;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map map = this.f4563a.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str2);
            String valueOf2 = String.valueOf(str3);
            str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return (String) map.get(str3);
    }
}

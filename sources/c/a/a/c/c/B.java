package c.a.a.c.c;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import c.a.a.c.c.u;
import c.a.a.c.k;
import java.io.File;
import java.io.InputStream;

public class B<Data> implements u<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final u<Uri, Data> f3255a;

    public static final class a implements v<String, AssetFileDescriptor> {
        public u<String, AssetFileDescriptor> a(y yVar) {
            return new B(yVar.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements v<String, ParcelFileDescriptor> {
        public u<String, ParcelFileDescriptor> a(y yVar) {
            return new B(yVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements v<String, InputStream> {
        public u<String, InputStream> a(y yVar) {
            return new B(yVar.a(Uri.class, InputStream.class));
        }
    }

    public B(u<Uri, Data> uVar) {
        this.f3255a = uVar;
    }

    private static Uri b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) != '/') {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                return parse;
            }
        }
        return c(str);
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    public u.a<Data> a(String str, int i, int i2, k kVar) {
        Uri b2 = b(str);
        if (b2 == null || !this.f3255a.a(b2)) {
            return null;
        }
        return this.f3255a.a(b2, i, i2, kVar);
    }

    public boolean a(String str) {
        return true;
    }
}

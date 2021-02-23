package c.b.b.b.d.f;

import android.net.Uri;
import b.e.b;

/* renamed from: c.b.b.b.d.f.xa  reason: case insensitive filesystem */
public final class C0450xa {

    /* renamed from: a  reason: collision with root package name */
    private static final b<String, Uri> f4629a = new b<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (C0450xa.class) {
            uri = f4629a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(valueOf) : new String("content://com.google.android.gms.phenotype/"));
                f4629a.put(str, uri);
            }
        }
        return uri;
    }
}

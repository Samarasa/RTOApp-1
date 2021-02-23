package c.a.a.c.c;

import android.util.Base64;
import c.a.a.c.c.g;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class h implements g.a<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g.c f3292a;

    h(g.c cVar) {
        this.f3292a = cVar;
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void a(InputStream inputStream) {
        inputStream.close();
    }

    public InputStream decode(String str) {
        if (str.startsWith("data:image")) {
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            } else if (str.substring(0, indexOf).endsWith(";base64")) {
                return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
            } else {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        } else {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
    }
}

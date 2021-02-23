package c.a.a.c.c;

import c.a.a.c.c.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

class k implements i.d<InputStream> {
    k() {
    }

    public InputStream a(File file) {
        return new FileInputStream(file);
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }

    public void a(InputStream inputStream) {
        inputStream.close();
    }
}

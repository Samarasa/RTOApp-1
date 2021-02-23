package c.a.a.c.c;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import c.a.a.c.a.d;
import c.a.a.c.c.u;
import c.a.a.c.k;
import c.a.a.h;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class i<Data> implements u<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final d<Data> f3293a;

    public static class a<Data> implements v<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        private final d<Data> f3294a;

        public a(d<Data> dVar) {
            this.f3294a = dVar;
        }

        public final u<File, Data> a(y yVar) {
            return new i(this.f3294a);
        }
    }

    public static class b extends a<ParcelFileDescriptor> {
        public b() {
            super(new j());
        }
    }

    private static final class c<Data> implements c.a.a.c.a.d<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final File f3295a;

        /* renamed from: b  reason: collision with root package name */
        private final d<Data> f3296b;

        /* renamed from: c  reason: collision with root package name */
        private Data f3297c;

        c(File file, d<Data> dVar) {
            this.f3295a = file;
            this.f3296b = dVar;
        }

        public Class<Data> a() {
            return this.f3296b.a();
        }

        public void a(h hVar, d.a<? super Data> aVar) {
            try {
                this.f3297c = this.f3296b.a(this.f3295a);
                aVar.a(this.f3297c);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e2);
                }
                aVar.a((Exception) e2);
            }
        }

        public void b() {
            Data data = this.f3297c;
            if (data != null) {
                try {
                    this.f3296b.a(data);
                } catch (IOException unused) {
                }
            }
        }

        public c.a.a.c.a c() {
            return c.a.a.c.a.LOCAL;
        }

        public void cancel() {
        }
    }

    public interface d<Data> {
        Class<Data> a();

        Data a(File file);

        void a(Data data);
    }

    public static class e extends a<InputStream> {
        public e() {
            super(new k());
        }
    }

    public i(d<Data> dVar) {
        this.f3293a = dVar;
    }

    public u.a<Data> a(File file, int i, int i2, k kVar) {
        return new u.a<>(new c.a.a.h.c(file), new c(file, this.f3293a));
    }

    public boolean a(File file) {
        return true;
    }
}

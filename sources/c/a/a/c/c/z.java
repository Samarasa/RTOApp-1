package c.a.a.c.c;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c.a.a.c.c.u;
import c.a.a.c.k;
import java.io.InputStream;

public class z<Data> implements u<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final u<Uri, Data> f3350a;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f3351b;

    public static final class a implements v<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f3352a;

        public a(Resources resources) {
            this.f3352a = resources;
        }

        public u<Integer, AssetFileDescriptor> a(y yVar) {
            return new z(this.f3352a, yVar.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements v<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f3353a;

        public b(Resources resources) {
            this.f3353a = resources;
        }

        public u<Integer, ParcelFileDescriptor> a(y yVar) {
            return new z(this.f3353a, yVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements v<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f3354a;

        public c(Resources resources) {
            this.f3354a = resources;
        }

        public u<Integer, InputStream> a(y yVar) {
            return new z(this.f3354a, yVar.a(Uri.class, InputStream.class));
        }
    }

    public static class d implements v<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        private final Resources f3355a;

        public d(Resources resources) {
            this.f3355a = resources;
        }

        public u<Integer, Uri> a(y yVar) {
            return new z(this.f3355a, C.a());
        }
    }

    public z(Resources resources, u<Uri, Data> uVar) {
        this.f3351b = resources;
        this.f3350a = uVar;
    }

    private Uri b(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f3351b.getResourcePackageName(num.intValue()) + '/' + this.f3351b.getResourceTypeName(num.intValue()) + '/' + this.f3351b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e2);
            return null;
        }
    }

    public u.a<Data> a(Integer num, int i, int i2, k kVar) {
        Uri b2 = b(num);
        if (b2 == null) {
            return null;
        }
        return this.f3350a.a(b2, i, i2, kVar);
    }

    public boolean a(Integer num) {
        return true;
    }
}

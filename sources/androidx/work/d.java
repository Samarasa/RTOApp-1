package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<a> f1724a = new HashSet();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Uri f1725a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f1726b;

        a(Uri uri, boolean z) {
            this.f1725a = uri;
            this.f1726b = z;
        }

        public Uri a() {
            return this.f1725a;
        }

        public boolean b() {
            return this.f1726b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1726b == aVar.f1726b && this.f1725a.equals(aVar.f1725a);
        }

        public int hashCode() {
            return (this.f1725a.hashCode() * 31) + (this.f1726b ? 1 : 0);
        }
    }

    public Set<a> a() {
        return this.f1724a;
    }

    public void a(Uri uri, boolean z) {
        this.f1724a.add(new a(uri, z));
    }

    public int b() {
        return this.f1724a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f1724a.equals(((d) obj).f1724a);
    }

    public int hashCode() {
        return this.f1724a.hashCode();
    }
}

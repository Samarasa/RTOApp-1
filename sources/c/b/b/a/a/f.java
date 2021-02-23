package c.b.b.a.a;

import c.b.b.a.a.p;
import c.b.b.a.d;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Arrays;

final class f extends p {

    /* renamed from: a  reason: collision with root package name */
    private final String f3811a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f3812b;

    /* renamed from: c  reason: collision with root package name */
    private final d f3813c;

    static final class a extends p.a {

        /* renamed from: a  reason: collision with root package name */
        private String f3816a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f3817b;

        /* renamed from: c  reason: collision with root package name */
        private d f3818c;

        a() {
        }

        public p.a a(d dVar) {
            if (dVar != null) {
                this.f3818c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }

        public p.a a(String str) {
            if (str != null) {
                this.f3816a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        public p.a a(byte[] bArr) {
            this.f3817b = bArr;
            return this;
        }

        public p a() {
            String str = this.f3816a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = str2 + " backendName";
            }
            if (this.f3818c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new f(this.f3816a, this.f3817b, this.f3818c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }
    }

    private f(String str, byte[] bArr, d dVar) {
        this.f3811a = str;
        this.f3812b = bArr;
        this.f3813c = dVar;
    }

    public String b() {
        return this.f3811a;
    }

    public byte[] c() {
        return this.f3812b;
    }

    public d d() {
        return this.f3813c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f3811a.equals(pVar.b())) {
            return Arrays.equals(this.f3812b, pVar instanceof f ? ((f) pVar).f3812b : pVar.c()) && this.f3813c.equals(pVar.d());
        }
    }

    public int hashCode() {
        return ((((this.f3811a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3812b)) * 1000003) ^ this.f3813c.hashCode();
    }
}

package com.google.android.datatransport.runtime.backends;

import c.b.b.a.a.l;
import com.google.android.datatransport.runtime.backends.g;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.Arrays;

final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<l> f5254a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f5255b;

    static final class a extends g.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<l> f5256a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f5257b;

        a() {
        }

        public g.a a(Iterable<l> iterable) {
            if (iterable != null) {
                this.f5256a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        public g.a a(byte[] bArr) {
            this.f5257b = bArr;
            return this;
        }

        public g a() {
            Iterable<l> iterable = this.f5256a;
            String str = BuildConfig.FLAVOR;
            if (iterable == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new b(this.f5256a, this.f5257b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private b(Iterable<l> iterable, byte[] bArr) {
        this.f5254a = iterable;
        this.f5255b = bArr;
    }

    public Iterable<l> b() {
        return this.f5254a;
    }

    public byte[] c() {
        return this.f5255b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f5254a.equals(gVar.b())) {
            if (Arrays.equals(this.f5255b, gVar instanceof b ? ((b) gVar).f5255b : gVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5254a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f5255b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f5254a + ", extras=" + Arrays.toString(this.f5255b) + "}";
    }
}

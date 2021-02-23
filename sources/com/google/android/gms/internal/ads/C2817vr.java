package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.vr  reason: case insensitive filesystem */
public abstract class C2817vr implements C2890ws {

    /* renamed from: a  reason: collision with root package name */
    private static Logger f12592a = Logger.getLogger(C2817vr.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private ThreadLocal<ByteBuffer> f12593b = new C1128Vq(this);

    public final C1182Xs a(Iga iga, C3034yu yuVar) {
        int read;
        long j;
        Iga iga2 = iga;
        C3034yu yuVar2 = yuVar;
        long position = iga.position();
        this.f12593b.get().rewind().limit(8);
        do {
            read = iga2.read(this.f12593b.get());
            if (read == 8) {
                this.f12593b.get().rewind();
                long a2 = C2962xt.a(this.f12593b.get());
                byte[] bArr = null;
                if (a2 >= 8 || a2 <= 1) {
                    String f2 = C2962xt.f(this.f12593b.get());
                    if (a2 == 1) {
                        this.f12593b.get().limit(16);
                        iga2.read(this.f12593b.get());
                        this.f12593b.get().position(8);
                        j = C2962xt.c(this.f12593b.get()) - 16;
                    } else {
                        j = a2 == 0 ? iga.size() - iga.position() : a2 - 8;
                    }
                    if ("uuid".equals(f2)) {
                        this.f12593b.get().limit(this.f12593b.get().limit() + 16);
                        iga2.read(this.f12593b.get());
                        bArr = new byte[16];
                        for (int position2 = this.f12593b.get().position() - 16; position2 < this.f12593b.get().position(); position2++) {
                            bArr[position2 - (this.f12593b.get().position() - 16)] = this.f12593b.get().get(position2);
                        }
                        j -= 16;
                    }
                    long j2 = j;
                    C1182Xs a3 = a(f2, bArr, yuVar2 instanceof C1182Xs ? ((C1182Xs) yuVar2).getType() : BuildConfig.FLAVOR);
                    a3.a(yuVar2);
                    this.f12593b.get().rewind();
                    a3.a(iga, this.f12593b.get(), j2, this);
                    return a3;
                }
                Logger logger = f12592a;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder(80);
                sb.append("Plausibility check failed: size < 8 (size = ");
                sb.append(a2);
                sb.append("). Stop parsing!");
                logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                return null;
            }
        } while (read >= 0);
        iga2.e(position);
        throw new EOFException();
    }

    public abstract C1182Xs a(String str, byte[] bArr, String str2);
}

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public class Ega extends Gga implements C1182Xs {
    private C3034yu j;
    private String k;
    private boolean l;
    private long m;

    public Ega(String str) {
        this.k = str;
    }

    public final void a(Iga iga, long j2, C2890ws wsVar) {
        this.f7050d = iga;
        this.f7052f = iga.position();
        this.f7053g = this.f7052f - ((long) ((this.l || 8 + j2 >= 4294967296L) ? 16 : 8));
        iga.e(iga.position() + j2);
        this.f7054h = iga.position();
        this.f7049c = wsVar;
    }

    public final void a(Iga iga, ByteBuffer byteBuffer, long j2, C2890ws wsVar) {
        this.m = iga.position() - ((long) byteBuffer.remaining());
        this.l = byteBuffer.remaining() == 16;
        a(iga, j2, wsVar);
    }

    public final void a(C3034yu yuVar) {
        this.j = yuVar;
    }

    public final String getType() {
        return this.k;
    }
}

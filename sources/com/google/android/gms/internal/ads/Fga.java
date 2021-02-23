package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class Fga implements C1182Xs {

    /* renamed from: a  reason: collision with root package name */
    private static Oga f6879a = Oga.a(Fga.class);

    /* renamed from: b  reason: collision with root package name */
    private String f6880b;

    /* renamed from: c  reason: collision with root package name */
    private C3034yu f6881c;

    /* renamed from: d  reason: collision with root package name */
    boolean f6882d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6883e;

    /* renamed from: f  reason: collision with root package name */
    private ByteBuffer f6884f;

    /* renamed from: g  reason: collision with root package name */
    private long f6885g;

    /* renamed from: h  reason: collision with root package name */
    private long f6886h;
    private long i = -1;
    private Iga j;
    private ByteBuffer k = null;

    protected Fga(String str) {
        this.f6880b = str;
        this.f6883e = true;
        this.f6882d = true;
    }

    private final synchronized void b() {
        if (!this.f6883e) {
            try {
                Oga oga = f6879a;
                String valueOf = String.valueOf(this.f6880b);
                oga.a(valueOf.length() != 0 ? "mem mapping ".concat(valueOf) : new String("mem mapping "));
                this.f6884f = this.j.a(this.f6885g, this.i);
                this.f6883e = true;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final synchronized void a() {
        b();
        Oga oga = f6879a;
        String valueOf = String.valueOf(this.f6880b);
        oga.a(valueOf.length() != 0 ? "parsing details of ".concat(valueOf) : new String("parsing details of "));
        if (this.f6884f != null) {
            ByteBuffer byteBuffer = this.f6884f;
            this.f6882d = true;
            byteBuffer.rewind();
            a(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.k = byteBuffer.slice();
            }
            this.f6884f = null;
        }
    }

    public final void a(Iga iga, ByteBuffer byteBuffer, long j2, C2890ws wsVar) {
        this.f6885g = iga.position();
        this.f6886h = this.f6885g - ((long) byteBuffer.remaining());
        this.i = j2;
        this.j = iga;
        iga.e(iga.position() + j2);
        this.f6883e = false;
        this.f6882d = false;
        a();
    }

    public final void a(C3034yu yuVar) {
        this.f6881c = yuVar;
    }

    /* access modifiers changed from: protected */
    public abstract void a(ByteBuffer byteBuffer);

    public final String getType() {
        return this.f6880b;
    }
}

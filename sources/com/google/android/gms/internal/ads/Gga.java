package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Gga implements C3034yu, Closeable, Iterator<C1182Xs> {

    /* renamed from: a  reason: collision with root package name */
    private static final C1182Xs f7047a = new Jga("eof ");

    /* renamed from: b  reason: collision with root package name */
    private static Oga f7048b = Oga.a(Gga.class);

    /* renamed from: c  reason: collision with root package name */
    protected C2890ws f7049c;

    /* renamed from: d  reason: collision with root package name */
    protected Iga f7050d;

    /* renamed from: e  reason: collision with root package name */
    private C1182Xs f7051e = null;

    /* renamed from: f  reason: collision with root package name */
    long f7052f = 0;

    /* renamed from: g  reason: collision with root package name */
    long f7053g = 0;

    /* renamed from: h  reason: collision with root package name */
    long f7054h = 0;
    private List<C1182Xs> i = new ArrayList();

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final C1182Xs next() {
        C1182Xs a2;
        C1182Xs xs = this.f7051e;
        if (xs == null || xs == f7047a) {
            Iga iga = this.f7050d;
            if (iga == null || this.f7052f >= this.f7054h) {
                this.f7051e = f7047a;
                throw new NoSuchElementException();
            }
            try {
                synchronized (iga) {
                    this.f7050d.e(this.f7052f);
                    a2 = this.f7049c.a(this.f7050d, this);
                    this.f7052f = this.f7050d.position();
                }
                return a2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.f7051e = null;
            return xs;
        }
    }

    public void a(Iga iga, long j, C2890ws wsVar) {
        this.f7050d = iga;
        long position = iga.position();
        this.f7053g = position;
        this.f7052f = position;
        iga.e(iga.position() + j);
        this.f7054h = iga.position();
        this.f7049c = wsVar;
    }

    public void close() {
        this.f7050d.close();
    }

    public boolean hasNext() {
        C1182Xs xs = this.f7051e;
        if (xs == f7047a) {
            return false;
        }
        if (xs != null) {
            return true;
        }
        try {
            this.f7051e = (C1182Xs) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f7051e = f7047a;
            return false;
        }
    }

    public final List<C1182Xs> r() {
        return (this.f7050d == null || this.f7051e == f7047a) ? this.i : new Mga(this.i, this);
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (i2 > 0) {
                sb.append(";");
            }
            sb.append(this.i.get(i2).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}

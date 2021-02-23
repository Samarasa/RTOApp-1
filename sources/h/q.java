package h;

final class q implements f {

    /* renamed from: a  reason: collision with root package name */
    public final e f15350a = new e();

    /* renamed from: b  reason: collision with root package name */
    public final v f15351b;

    /* renamed from: c  reason: collision with root package name */
    boolean f15352c;

    q(v vVar) {
        if (vVar != null) {
            this.f15351b = vVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public f a(String str) {
        if (!this.f15352c) {
            this.f15350a.a(str);
            j();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public e b() {
        return this.f15350a;
    }

    public void b(e eVar, long j) {
        if (!this.f15352c) {
            this.f15350a.b(eVar, j);
            j();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public void close() {
        if (!this.f15352c) {
            try {
                if (this.f15350a.f15328c > 0) {
                    this.f15351b.b(this.f15350a, this.f15350a.f15328c);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f15351b.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f15352c = true;
            if (th != null) {
                z.a(th);
                throw null;
            }
        }
    }

    public f d(long j) {
        if (!this.f15352c) {
            this.f15350a.d(j);
            j();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void flush() {
        if (!this.f15352c) {
            e eVar = this.f15350a;
            long j = eVar.f15328c;
            if (j > 0) {
                this.f15351b.b(eVar, j);
            }
            this.f15351b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public f j() {
        if (!this.f15352c) {
            long k = this.f15350a.k();
            if (k > 0) {
                this.f15351b.b(this.f15350a, k);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public y timeout() {
        return this.f15351b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f15351b + ")";
    }

    public f write(byte[] bArr) {
        if (!this.f15352c) {
            this.f15350a.write(bArr);
            j();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public f write(byte[] bArr, int i, int i2) {
        if (!this.f15352c) {
            this.f15350a.write(bArr, i, i2);
            j();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public f writeByte(int i) {
        if (!this.f15352c) {
            this.f15350a.writeByte(i);
            j();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public f writeInt(int i) {
        if (!this.f15352c) {
            this.f15350a.writeInt(i);
            j();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public f writeShort(int i) {
        if (!this.f15352c) {
            this.f15350a.writeShort(i);
            j();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}

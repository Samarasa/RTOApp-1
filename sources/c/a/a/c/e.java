package c.a.a.c;

import java.io.IOException;

public final class e extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private final int f3485a;

    public e(int i) {
        this("Http request failed with status code: " + i, i);
    }

    public e(String str) {
        this(str, -1);
    }

    public e(String str, int i) {
        this(str, i, (Throwable) null);
    }

    public e(String str, int i, Throwable th) {
        super(str, th);
        this.f3485a = i;
    }
}

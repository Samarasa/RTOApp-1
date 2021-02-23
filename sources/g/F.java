package g;

import java.io.IOException;

public enum F {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: f  reason: collision with root package name */
    private final String f14874f;

    private F(String str) {
        this.f14874f = str;
    }

    public static F a(String str) {
        if (str.equals(HTTP_1_0.f14874f)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.f14874f)) {
            return HTTP_1_1;
        }
        if (str.equals(HTTP_2.f14874f)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.f14874f)) {
            return SPDY_3;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.f14874f;
    }
}

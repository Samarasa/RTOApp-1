package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* renamed from: com.google.android.gms.internal.ads.Wr  reason: case insensitive filesystem */
public class C1155Wr extends Gga implements Closeable {
    private static Oga j = Oga.a(C1155Wr.class);

    public C1155Wr(Iga iga, C2890ws wsVar) {
        a(iga, iga.size(), wsVar);
    }

    public void close() {
        this.f7050d.close();
    }

    public String toString() {
        String obj = this.f7050d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}

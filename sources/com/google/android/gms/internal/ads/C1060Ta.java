package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ta  reason: case insensitive filesystem */
public final class C1060Ta extends C1510db {

    /* renamed from: a  reason: collision with root package name */
    private static final int f8792a = Color.rgb(12, 174, 206);

    /* renamed from: b  reason: collision with root package name */
    private static final int f8793b;

    /* renamed from: c  reason: collision with root package name */
    private static final int f8794c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f8795d = f8792a;

    /* renamed from: e  reason: collision with root package name */
    private final String f8796e;

    /* renamed from: f  reason: collision with root package name */
    private final List<C1190Ya> f8797f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List<C2076lb> f8798g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final int f8799h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;

    static {
        int rgb = Color.rgb(204, 204, 204);
        f8793b = rgb;
        f8794c = rgb;
    }

    public C1060Ta(String str, List<C1190Ya> list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        this.f8796e = str;
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                C1190Ya ya = list.get(i4);
                this.f8797f.add(ya);
                this.f8798g.add(ya);
            }
        }
        this.f8799h = num != null ? num.intValue() : f8794c;
        this.i = num2 != null ? num2.intValue() : f8795d;
        this.j = num3 != null ? num3.intValue() : 12;
        this.k = i2;
        this.l = i3;
        this.m = z;
    }

    public final int Zb() {
        return this.f8799h;
    }

    public final int _b() {
        return this.i;
    }

    public final int ac() {
        return this.j;
    }

    public final List<C1190Ya> bc() {
        return this.f8797f;
    }

    public final int cc() {
        return this.k;
    }

    public final int dc() {
        return this.l;
    }

    public final String getText() {
        return this.f8796e;
    }

    public final List<C2076lb> ya() {
        return this.f8798g;
    }
}

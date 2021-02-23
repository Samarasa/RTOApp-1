package org.jsoup.parser;

import java.util.ArrayList;

class A extends ArrayList<ParseError> {

    /* renamed from: a  reason: collision with root package name */
    private final int f15453a;

    A(int i, int i2) {
        super(i);
        this.f15453a = i2;
    }

    static A f() {
        return new A(0, 0);
    }

    static A j(int i) {
        return new A(16, i);
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return size() < this.f15453a;
    }
}

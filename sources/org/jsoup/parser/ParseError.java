package org.jsoup.parser;

public class ParseError {

    /* renamed from: a  reason: collision with root package name */
    private int f15484a;

    /* renamed from: b  reason: collision with root package name */
    private String f15485b;

    ParseError(int i, String str) {
        this.f15484a = i;
        this.f15485b = str;
    }

    ParseError(int i, String str, Object... objArr) {
        this.f15485b = String.format(str, objArr);
        this.f15484a = i;
    }

    public String getErrorMessage() {
        return this.f15485b;
    }

    public int getPosition() {
        return this.f15484a;
    }

    public String toString() {
        return this.f15484a + ": " + this.f15485b;
    }
}

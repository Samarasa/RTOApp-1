package org.jsoup.parser;

import java.util.Iterator;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class ParseSettings {
    public static final ParseSettings htmlDefault = new ParseSettings(false, false);
    public static final ParseSettings preserveCase = new ParseSettings(true, true);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f15486a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f15487b;

    public ParseSettings(boolean z, boolean z2) {
        this.f15486a = z;
        this.f15487b = z2;
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        String trim = str.trim();
        return !this.f15486a ? trim.toLowerCase() : trim;
    }

    /* access modifiers changed from: package-private */
    public Attributes a(Attributes attributes) {
        if (!this.f15487b) {
            Iterator<Attribute> it = attributes.iterator();
            while (it.hasNext()) {
                Attribute next = it.next();
                next.setKey(next.getKey().toLowerCase());
            }
        }
        return attributes;
    }
}

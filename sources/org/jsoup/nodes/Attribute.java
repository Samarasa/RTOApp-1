package org.jsoup.nodes;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;

public class Attribute implements Map.Entry<String, String>, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f15407a = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: b  reason: collision with root package name */
    private String f15408b;

    /* renamed from: c  reason: collision with root package name */
    private String f15409c;

    public Attribute(String str, String str2) {
        Validate.notEmpty(str);
        Validate.notNull(str2);
        this.f15408b = str.trim();
        this.f15409c = str2;
    }

    public static Attribute createFromEncoded(String str, String str2) {
        return new Attribute(str, Entities.a(str2, true));
    }

    /* access modifiers changed from: protected */
    public void a(Appendable appendable, Document.OutputSettings outputSettings) {
        appendable.append(this.f15408b);
        if (!a(outputSettings)) {
            appendable.append("=\"");
            Entities.a(appendable, this.f15409c, outputSettings, true, false, false);
            appendable.append('\"');
        }
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return Arrays.binarySearch(f15407a, this.f15408b) >= 0;
    }

    /* access modifiers changed from: protected */
    public final boolean a(Document.OutputSettings outputSettings) {
        return (BuildConfig.FLAVOR.equals(this.f15409c) || this.f15409c.equalsIgnoreCase(this.f15408b)) && outputSettings.syntax() == Document.OutputSettings.Syntax.html && a();
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return this.f15408b.startsWith("data-") && this.f15408b.length() > 5;
    }

    public Attribute clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attribute)) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        String str = this.f15408b;
        if (str == null ? attribute.f15408b != null : !str.equals(attribute.f15408b)) {
            return false;
        }
        String str2 = this.f15409c;
        if (str2 != null) {
            return str2.equals(attribute.f15409c);
        }
        if (attribute.f15409c == null) {
            return true;
        }
    }

    public String getKey() {
        return this.f15408b;
    }

    public String getValue() {
        return this.f15409c;
    }

    public int hashCode() {
        String str = this.f15408b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15409c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String html() {
        StringBuilder sb = new StringBuilder();
        try {
            a(sb, new Document(BuildConfig.FLAVOR).outputSettings());
            return sb.toString();
        } catch (IOException e2) {
            throw new SerializationException((Throwable) e2);
        }
    }

    public void setKey(String str) {
        Validate.notEmpty(str);
        this.f15408b = str.trim();
    }

    public String setValue(String str) {
        Validate.notNull(str);
        String str2 = this.f15409c;
        this.f15409c = str;
        return str2;
    }

    public String toString() {
        return html();
    }
}

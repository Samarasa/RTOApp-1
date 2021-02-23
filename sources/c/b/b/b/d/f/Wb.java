package c.b.b.b.d.f;

import java.io.IOException;

public class Wb extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private C0445wc f4325a = null;

    public Wb(String str) {
        super(str);
    }

    static Wb a() {
        return new Wb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static Wb b() {
        return new Wb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static Wb c() {
        return new Wb("Protocol message contained an invalid tag (zero).");
    }

    static Vb d() {
        return new Vb("Protocol message tag had invalid wire type.");
    }

    static Wb e() {
        return new Wb("Failed to parse the message.");
    }

    static Wb f() {
        return new Wb("Protocol message had invalid UTF-8.");
    }
}

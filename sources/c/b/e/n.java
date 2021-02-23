package c.b.e;

import java.io.IOException;

public class n extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private r f5059a = null;

    public n(String str) {
        super(str);
    }

    static n a() {
        return new n("Protocol message end-group tag did not match expected tag.");
    }

    static n b() {
        return new n("Protocol message contained an invalid tag (zero).");
    }

    static n c() {
        return new n("Protocol message had invalid UTF-8.");
    }

    static n d() {
        return new n("Protocol message tag had invalid wire type.");
    }

    static n e() {
        return new n("CodedInputStream encountered a malformed varint.");
    }

    static n f() {
        return new n("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static n g() {
        return new n("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static n h() {
        return new n("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static n i() {
        return new n("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public n a(r rVar) {
        this.f5059a = rVar;
        return this;
    }
}

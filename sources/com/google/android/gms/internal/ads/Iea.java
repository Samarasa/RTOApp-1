package com.google.android.gms.internal.ads;

import java.io.IOException;

public class Iea extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private C1872ifa f7311a = null;

    public Iea(String str) {
        super(str);
    }

    static Iea a() {
        return new Iea("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static Iea b() {
        return new Iea("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static Iea c() {
        return new Iea("CodedInputStream encountered a malformed varint.");
    }

    static Iea d() {
        return new Iea("Protocol message contained an invalid tag (zero).");
    }

    static Iea e() {
        return new Iea("Protocol message end-group tag did not match expected tag.");
    }

    static Hea f() {
        return new Hea("Protocol message tag had invalid wire type.");
    }

    static Iea g() {
        return new Iea("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static Iea h() {
        return new Iea("Failed to parse the message.");
    }

    static Iea i() {
        return new Iea("Protocol message had invalid UTF-8.");
    }

    public final Iea a(C1872ifa ifa) {
        this.f7311a = ifa;
        return this;
    }
}

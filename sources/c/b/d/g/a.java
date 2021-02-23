package c.b.d.g;

final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f4952a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4953b;

    a(String str, String str2) {
        if (str != null) {
            this.f4952a = str;
            if (str2 != null) {
                this.f4953b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public String a() {
        return this.f4952a;
    }

    public String b() {
        return this.f4953b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4952a.equals(fVar.a()) && this.f4953b.equals(fVar.b());
    }

    public int hashCode() {
        return ((this.f4952a.hashCode() ^ 1000003) * 1000003) ^ this.f4953b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f4952a + ", version=" + this.f4953b + "}";
    }
}

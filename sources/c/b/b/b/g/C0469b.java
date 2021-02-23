package c.b.b.b.g;

/* renamed from: c.b.b.b.g.b  reason: case insensitive filesystem */
public final class C0469b extends IllegalStateException {
    private C0469b(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(i<?> iVar) {
        String str;
        if (!iVar.d()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception a2 = iVar.a();
        if (a2 != null) {
            str = "failure";
        } else if (iVar.e()) {
            String valueOf = String.valueOf(iVar.b());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("result ");
            sb.append(valueOf);
            str = sb.toString();
        } else {
            str = iVar.c() ? "cancellation" : "unknown issue";
        }
        String valueOf2 = String.valueOf(str);
        return new C0469b(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), a2);
    }
}

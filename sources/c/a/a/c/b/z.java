package c.a.a.c.b;

import android.util.Log;
import c.a.a.c.h;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class z extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private static final StackTraceElement[] f3242a = new StackTraceElement[0];

    /* renamed from: b  reason: collision with root package name */
    private final List<Throwable> f3243b;

    /* renamed from: c  reason: collision with root package name */
    private h f3244c;

    /* renamed from: d  reason: collision with root package name */
    private c.a.a.c.a f3245d;

    /* renamed from: e  reason: collision with root package name */
    private Class<?> f3246e;

    /* renamed from: f  reason: collision with root package name */
    private String f3247f;

    private static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        private final Appendable f3248a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3249b = true;

        a(Appendable appendable) {
            this.f3248a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? BuildConfig.FLAVOR : charSequence;
        }

        public Appendable append(char c2) {
            boolean z = false;
            if (this.f3249b) {
                this.f3249b = false;
                this.f3248a.append("  ");
            }
            if (c2 == 10) {
                z = true;
            }
            this.f3249b = z;
            this.f3248a.append(c2);
            return this;
        }

        public Appendable append(CharSequence charSequence) {
            CharSequence a2 = a(charSequence);
            append(a2, 0, a2.length());
            return this;
        }

        public Appendable append(CharSequence charSequence, int i, int i2) {
            CharSequence a2 = a(charSequence);
            boolean z = false;
            if (this.f3249b) {
                this.f3249b = false;
                this.f3248a.append("  ");
            }
            if (a2.length() > 0 && a2.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f3249b = z;
            this.f3248a.append(a2, i, i2);
            return this;
        }
    }

    public z(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public z(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public z(String str, List<Throwable> list) {
        this.f3247f = str;
        setStackTrace(f3242a);
        this.f3243b = list;
    }

    private void a(Appendable appendable) {
        a((Throwable) this, appendable);
        a(a(), (Appendable) new a(appendable));
    }

    private static void a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void a(Throwable th, List<Throwable> list) {
        if (th instanceof z) {
            for (Throwable a2 : ((z) th).a()) {
                a(a2, list);
            }
            return;
        }
        list.add(th);
    }

    private static void a(List<Throwable> list, Appendable appendable) {
        try {
            b(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof z) {
                ((z) th).a(appendable);
            } else {
                a(th, appendable);
            }
            i = i2;
        }
    }

    public List<Throwable> a() {
        return this.f3243b;
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar, c.a.a.c.a aVar) {
        a(hVar, aVar, (Class<?>) null);
    }

    /* access modifiers changed from: package-private */
    public void a(h hVar, c.a.a.c.a aVar, Class<?> cls) {
        this.f3244c = hVar;
        this.f3245d = aVar;
        this.f3246e = cls;
    }

    public void a(String str) {
        List<Throwable> b2 = b();
        int size = b2.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), b2.get(i));
            i = i2;
        }
    }

    public List<Throwable> b() {
        ArrayList arrayList = new ArrayList();
        a((Throwable) this, (List<Throwable>) arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f3247f);
        Class<?> cls = this.f3246e;
        String str4 = BuildConfig.FLAVOR;
        if (cls != null) {
            str = ", " + this.f3246e;
        } else {
            str = str4;
        }
        sb.append(str);
        if (this.f3245d != null) {
            str2 = ", " + this.f3245d;
        } else {
            str2 = str4;
        }
        sb.append(str2);
        if (this.f3244c != null) {
            str4 = ", " + this.f3244c;
        }
        sb.append(str4);
        List<Throwable> b2 = b();
        if (b2.isEmpty()) {
            return sb.toString();
        }
        if (b2.size() == 1) {
            str3 = "\nThere was 1 cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(b2.size());
            str3 = " causes:";
        }
        sb.append(str3);
        for (Throwable next : b2) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        a((Appendable) printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        a((Appendable) printWriter);
    }
}

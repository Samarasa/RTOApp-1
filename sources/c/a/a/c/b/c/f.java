package c.a.a.c.b.c;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

class f implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Pattern f3130a;

    f(Pattern pattern) {
        this.f3130a = pattern;
    }

    public boolean accept(File file, String str) {
        return this.f3130a.matcher(str).matches();
    }
}

package c.b.d.b.b;

import c.b.d.b.a;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

class c implements a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f4909a;

    c(d dVar) {
        this.f4909a = dVar;
    }

    public void a(Object obj, Writer writer) {
        e eVar = new e(writer, this.f4909a.f4913d, this.f4909a.f4914e);
        eVar.a(obj);
        eVar.a();
    }

    public String encode(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            a(obj, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}

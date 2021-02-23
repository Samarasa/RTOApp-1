package c.a.a;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.C0159i;
import c.a.a.c.a.e;
import c.a.a.c.a.l;
import c.a.a.c.b.a.b;
import c.a.a.c.b.a.e;
import c.a.a.c.b.b.i;
import c.a.a.c.b.d.a;
import c.a.a.c.b.s;
import c.a.a.c.c.B;
import c.a.a.c.c.C;
import c.a.a.c.c.C0239a;
import c.a.a.c.c.C0241c;
import c.a.a.c.c.C0243e;
import c.a.a.c.c.D;
import c.a.a.c.c.E;
import c.a.a.c.c.a.a;
import c.a.a.c.c.a.b;
import c.a.a.c.c.a.c;
import c.a.a.c.c.a.d;
import c.a.a.c.c.a.e;
import c.a.a.c.c.f;
import c.a.a.c.c.g;
import c.a.a.c.c.i;
import c.a.a.c.c.q;
import c.a.a.c.c.z;
import c.a.a.c.d.a.A;
import c.a.a.c.d.a.C0244a;
import c.a.a.c.d.a.l;
import c.a.a.c.d.a.p;
import c.a.a.c.d.a.u;
import c.a.a.c.d.a.v;
import c.a.a.c.d.a.x;
import c.a.a.c.d.b.a;
import c.a.a.c.d.e.h;
import c.a.a.c.d.e.j;
import c.a.a.c.f;
import c.a.a.d.d;
import c.a.a.d.n;
import c.a.a.i.k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c implements ComponentCallbacks2 {

    /* renamed from: a  reason: collision with root package name */
    private static volatile c f2935a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f2936b;

    /* renamed from: c  reason: collision with root package name */
    private final s f2937c;

    /* renamed from: d  reason: collision with root package name */
    private final e f2938d;

    /* renamed from: e  reason: collision with root package name */
    private final i f2939e;

    /* renamed from: f  reason: collision with root package name */
    private final a f2940f;

    /* renamed from: g  reason: collision with root package name */
    private final e f2941g;

    /* renamed from: h  reason: collision with root package name */
    private final i f2942h;
    private final b i;
    private final n j;
    private final d k;
    private final List<n> l = new ArrayList();
    private f m = f.NORMAL;

    c(Context context, s sVar, i iVar, e eVar, b bVar, n nVar, d dVar, int i2, c.a.a.g.e eVar2, Map<Class<?>, o<?, ?>> map) {
        Context context2 = context;
        i iVar2 = iVar;
        e eVar3 = eVar;
        b bVar2 = bVar;
        this.f2937c = sVar;
        this.f2938d = eVar3;
        this.i = bVar2;
        this.f2939e = iVar2;
        this.j = nVar;
        this.k = dVar;
        this.f2940f = new a(iVar2, eVar3, (c.a.a.c.b) eVar2.j().a(l.f3391a));
        Resources resources = context.getResources();
        this.f2942h = new i();
        if (Build.VERSION.SDK_INT >= 27) {
            this.f2942h.a((f) new p());
        }
        this.f2942h.a((f) new c.a.a.c.d.a.i());
        l lVar = new l(this.f2942h.a(), resources.getDisplayMetrics(), eVar3, bVar2);
        c.a.a.c.d.e.a aVar = new c.a.a.c.d.e.a(context2, this.f2942h.a(), eVar3, bVar2);
        c.a.a.c.l<ParcelFileDescriptor, Bitmap> b2 = A.b(eVar);
        c.a.a.c.d.a.f fVar = new c.a.a.c.d.a.f(lVar);
        v vVar = new v(lVar, bVar2);
        c.a.a.c.d.c.d dVar2 = new c.a.a.c.d.c.d(context2);
        z.c cVar = new z.c(resources);
        z.d dVar3 = new z.d(resources);
        z.b bVar3 = new z.b(resources);
        z.a aVar2 = new z.a(resources);
        c.a.a.c.d.a.c cVar2 = new c.a.a.c.d.a.c(bVar2);
        c.a.a.c.d.f.a aVar3 = new c.a.a.c.d.f.a();
        c.a.a.c.d.f.d dVar4 = new c.a.a.c.d.f.d();
        ContentResolver contentResolver = context.getContentResolver();
        i iVar3 = this.f2942h;
        iVar3.a(ByteBuffer.class, new C0243e());
        iVar3.a(InputStream.class, new c.a.a.c.c.A(bVar2));
        iVar3.a("Bitmap", ByteBuffer.class, Bitmap.class, fVar);
        iVar3.a("Bitmap", InputStream.class, Bitmap.class, vVar);
        iVar3.a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, b2);
        iVar3.a("Bitmap", AssetFileDescriptor.class, Bitmap.class, A.a(eVar));
        iVar3.a(Bitmap.class, Bitmap.class, C.a.a());
        iVar3.a("Bitmap", Bitmap.class, Bitmap.class, new x());
        iVar3.a(Bitmap.class, cVar2);
        iVar3.a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0244a(resources, fVar));
        iVar3.a("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0244a(resources, vVar));
        iVar3.a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0244a(resources, b2));
        iVar3.a(BitmapDrawable.class, new c.a.a.c.d.a.b(eVar3, cVar2));
        iVar3.a("Gif", InputStream.class, c.a.a.c.d.e.c.class, new j(this.f2942h.a(), aVar, bVar2));
        iVar3.a("Gif", ByteBuffer.class, c.a.a.c.d.e.c.class, aVar);
        iVar3.a(c.a.a.c.d.e.c.class, new c.a.a.c.d.e.d());
        iVar3.a(c.a.a.b.a.class, c.a.a.b.a.class, C.a.a());
        iVar3.a("Bitmap", c.a.a.b.a.class, Bitmap.class, new h(eVar3));
        iVar3.a(Uri.class, Drawable.class, dVar2);
        iVar3.a(Uri.class, Bitmap.class, new u(dVar2, eVar3));
        iVar3.a((e.a<?>) new a.C0052a());
        iVar3.a(File.class, ByteBuffer.class, new f.b());
        iVar3.a(File.class, InputStream.class, new i.e());
        iVar3.a(File.class, File.class, new c.a.a.c.d.d.a());
        iVar3.a(File.class, ParcelFileDescriptor.class, new i.b());
        iVar3.a(File.class, File.class, C.a.a());
        iVar3.a((e.a<?>) new l.a(bVar2));
        iVar3.a(Integer.TYPE, InputStream.class, cVar);
        z.b bVar4 = bVar3;
        iVar3.a(Integer.TYPE, ParcelFileDescriptor.class, bVar4);
        iVar3.a(Integer.class, InputStream.class, cVar);
        iVar3.a(Integer.class, ParcelFileDescriptor.class, bVar4);
        z.d dVar5 = dVar3;
        iVar3.a(Integer.class, Uri.class, dVar5);
        z.a aVar4 = aVar2;
        iVar3.a(Integer.TYPE, AssetFileDescriptor.class, aVar4);
        iVar3.a(Integer.class, AssetFileDescriptor.class, aVar4);
        iVar3.a(Integer.TYPE, Uri.class, dVar5);
        iVar3.a(String.class, InputStream.class, new g.c());
        iVar3.a(Uri.class, InputStream.class, new g.c());
        iVar3.a(String.class, InputStream.class, new B.c());
        iVar3.a(String.class, ParcelFileDescriptor.class, new B.b());
        iVar3.a(String.class, AssetFileDescriptor.class, new B.a());
        iVar3.a(Uri.class, InputStream.class, new b.a());
        iVar3.a(Uri.class, InputStream.class, new C0239a.c(context.getAssets()));
        iVar3.a(Uri.class, ParcelFileDescriptor.class, new C0239a.b(context.getAssets()));
        Context context3 = context;
        iVar3.a(Uri.class, InputStream.class, new c.a(context3));
        iVar3.a(Uri.class, InputStream.class, new d.a(context3));
        ContentResolver contentResolver2 = contentResolver;
        iVar3.a(Uri.class, InputStream.class, new D.d(contentResolver2));
        iVar3.a(Uri.class, ParcelFileDescriptor.class, new D.b(contentResolver2));
        iVar3.a(Uri.class, AssetFileDescriptor.class, new D.a(contentResolver2));
        iVar3.a(Uri.class, InputStream.class, new E.a());
        iVar3.a(URL.class, InputStream.class, new e.a());
        iVar3.a(Uri.class, File.class, new q.a(context3));
        iVar3.a(c.a.a.c.c.l.class, InputStream.class, new a.C0049a());
        iVar3.a(byte[].class, ByteBuffer.class, new C0241c.a());
        iVar3.a(byte[].class, InputStream.class, new C0241c.d());
        iVar3.a(Uri.class, Uri.class, C.a.a());
        iVar3.a(Drawable.class, Drawable.class, C.a.a());
        iVar3.a(Drawable.class, Drawable.class, new c.a.a.c.d.c.e());
        iVar3.a(Bitmap.class, BitmapDrawable.class, new c.a.a.c.d.f.b(resources));
        c.a.a.c.d.f.a aVar5 = aVar3;
        iVar3.a(Bitmap.class, byte[].class, aVar5);
        c.a.a.c.d.f.d dVar6 = dVar4;
        iVar3.a(Drawable.class, byte[].class, new c.a.a.c.d.f.c(eVar3, aVar5, dVar6));
        iVar3.a(c.a.a.c.d.e.c.class, byte[].class, dVar6);
        this.f2941g = new e(context, bVar, this.f2942h, new c.a.a.g.a.e(), eVar2, map, sVar, i2);
    }

    public static c a(Context context) {
        if (f2935a == null) {
            synchronized (c.class) {
                if (f2935a == null) {
                    c(context);
                }
            }
        }
        return f2935a;
    }

    public static n a(C0159i iVar) {
        return d(iVar).a(iVar);
    }

    private static void a(Context context, d dVar) {
        Context applicationContext = context.getApplicationContext();
        a i2 = i();
        List<c.a.a.e.c> emptyList = Collections.emptyList();
        if (i2 == null || i2.a()) {
            emptyList = new c.a.a.e.e(applicationContext).a();
        }
        if (i2 != null && !i2.b().isEmpty()) {
            Set<Class<?>> b2 = i2.b();
            Iterator<c.a.a.e.c> it = emptyList.iterator();
            while (it.hasNext()) {
                c.a.a.e.c next = it.next();
                if (b2.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (c.a.a.e.c cVar : emptyList) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + cVar.getClass());
            }
        }
        dVar.a(i2 != null ? i2.c() : null);
        for (c.a.a.e.c a2 : emptyList) {
            a2.a(applicationContext, dVar);
        }
        if (i2 != null) {
            i2.a(applicationContext, dVar);
        }
        c a3 = dVar.a(applicationContext);
        for (c.a.a.e.c a4 : emptyList) {
            a4.a(applicationContext, a3, a3.f2942h);
        }
        if (i2 != null) {
            i2.a(applicationContext, a3, a3.f2942h);
        }
        applicationContext.registerComponentCallbacks(a3);
        f2935a = a3;
    }

    private static void a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static n b(Context context) {
        return d(context).a(context);
    }

    private static void c(Context context) {
        if (!f2936b) {
            f2936b = true;
            e(context);
            f2936b = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    private static n d(Context context) {
        c.a.a.i.i.a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).h();
    }

    private static void e(Context context) {
        a(context, new d());
    }

    private static a i() {
        try {
            return (a) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (InstantiationException e2) {
            a((Exception) e2);
            throw null;
        } catch (IllegalAccessException e3) {
            a((Exception) e3);
            throw null;
        } catch (NoSuchMethodException e4) {
            a((Exception) e4);
            throw null;
        } catch (InvocationTargetException e5) {
            a((Exception) e5);
            throw null;
        }
    }

    public void a() {
        k.a();
        this.f2939e.a();
        this.f2938d.a();
        this.i.a();
    }

    public void a(int i2) {
        k.a();
        this.f2939e.a(i2);
        this.f2938d.a(i2);
        this.i.a(i2);
    }

    /* access modifiers changed from: package-private */
    public void a(n nVar) {
        synchronized (this.l) {
            if (!this.l.contains(nVar)) {
                this.l.add(nVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(c.a.a.g.a.h<?> hVar) {
        synchronized (this.l) {
            for (n b2 : this.l) {
                if (b2.b(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public c.a.a.c.b.a.b b() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public void b(n nVar) {
        synchronized (this.l) {
            if (this.l.contains(nVar)) {
                this.l.remove(nVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public c.a.a.c.b.a.e c() {
        return this.f2938d;
    }

    /* access modifiers changed from: package-private */
    public c.a.a.d.d d() {
        return this.k;
    }

    public Context e() {
        return this.f2941g.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    public e f() {
        return this.f2941g;
    }

    public i g() {
        return this.f2942h;
    }

    public n h() {
        return this.j;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        a();
    }

    public void onTrimMemory(int i2) {
        a(i2);
    }
}

package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public abstract class ListenableWorker {

    /* renamed from: a  reason: collision with root package name */
    private Context f1673a;

    /* renamed from: b  reason: collision with root package name */
    private WorkerParameters f1674b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f1675c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1676d;

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        public static final class C0022a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final e f1677a;

            public C0022a() {
                this(e.f1728b);
            }

            public C0022a(e eVar) {
                this.f1677a = eVar;
            }

            public e d() {
                return this.f1677a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0022a.class != obj.getClass()) {
                    return false;
                }
                return this.f1677a.equals(((C0022a) obj).f1677a);
            }

            public int hashCode() {
                return (C0022a.class.getName().hashCode() * 31) + this.f1677a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f1677a + '}';
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            private final e f1678a;

            public c() {
                this(e.f1728b);
            }

            public c(e eVar) {
                this.f1678a = eVar;
            }

            public e d() {
                return this.f1678a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f1678a.equals(((c) obj).f1678a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f1678a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f1678a + '}';
            }
        }

        a() {
        }

        public static a a() {
            return new C0022a();
        }

        public static a a(e eVar) {
            return new c(eVar);
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f1673a = context;
            this.f1674b = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.f1673a;
    }

    public Executor getBackgroundExecutor() {
        return this.f1674b.a();
    }

    public final UUID getId() {
        return this.f1674b.b();
    }

    public final e getInputData() {
        return this.f1674b.c();
    }

    public final Network getNetwork() {
        return this.f1674b.d();
    }

    public final int getRunAttemptCount() {
        return this.f1674b.e();
    }

    public final Set<String> getTags() {
        return this.f1674b.f();
    }

    public androidx.work.impl.utils.b.a getTaskExecutor() {
        return this.f1674b.g();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f1674b.h();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f1674b.i();
    }

    public t getWorkerFactory() {
        return this.f1674b.j();
    }

    public final boolean isStopped() {
        return this.f1675c;
    }

    public final boolean isUsed() {
        return this.f1676d;
    }

    public void onStopped() {
    }

    public final void setUsed() {
        this.f1676d = true;
    }

    public abstract c.b.c.a.a.a<a> startWork();

    public final void stop() {
        this.f1675c = true;
        onStopped();
    }
}

package b.i.a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import b.i.a.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f2592a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f2593b;

    /* renamed from: c  reason: collision with root package name */
    protected Cursor f2594c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f2595d;

    /* renamed from: e  reason: collision with root package name */
    protected int f2596e;

    /* renamed from: f  reason: collision with root package name */
    protected C0038a f2597f;

    /* renamed from: g  reason: collision with root package name */
    protected DataSetObserver f2598g;

    /* renamed from: h  reason: collision with root package name */
    protected b f2599h;

    /* renamed from: b.i.a.a$a  reason: collision with other inner class name */
    private class C0038a extends ContentObserver {
        C0038a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            a.this.b();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f2592a = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f2592a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        a(context, cursor, z ? 1 : 2);
    }

    public Cursor a() {
        return this.f2594c;
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: package-private */
    public void a(Context context, Cursor cursor, int i) {
        b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f2593b = true;
        } else {
            this.f2593b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f2594c = cursor;
        this.f2592a = z;
        this.f2595d = context;
        this.f2596e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f2597f = new C0038a();
            bVar = new b();
        } else {
            bVar = null;
            this.f2597f = null;
        }
        this.f2598g = bVar;
        if (z) {
            C0038a aVar = this.f2597f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2598g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public void a(Cursor cursor) {
        Cursor b2 = b(cursor);
        if (b2 != null) {
            b2.close();
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public Cursor b(Cursor cursor) {
        Cursor cursor2 = this.f2594c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0038a aVar = this.f2597f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f2598g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2594c = cursor;
        if (cursor != null) {
            C0038a aVar2 = this.f2597f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f2598g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f2596e = cursor.getColumnIndexOrThrow("_id");
            this.f2592a = true;
            notifyDataSetChanged();
        } else {
            this.f2596e = -1;
            this.f2592a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public abstract View b(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void b() {
        Cursor cursor;
        if (this.f2593b && (cursor = this.f2594c) != null && !cursor.isClosed()) {
            this.f2592a = this.f2594c.requery();
        }
    }

    public abstract CharSequence convertToString(Cursor cursor);

    public int getCount() {
        Cursor cursor;
        if (!this.f2592a || (cursor = this.f2594c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2592a) {
            return null;
        }
        this.f2594c.moveToPosition(i);
        if (view == null) {
            view = a(this.f2595d, this.f2594c, viewGroup);
        }
        a(view, this.f2595d, this.f2594c);
        return view;
    }

    public Filter getFilter() {
        if (this.f2599h == null) {
            this.f2599h = new b(this);
        }
        return this.f2599h;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f2592a || (cursor = this.f2594c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f2594c;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f2592a || (cursor = this.f2594c) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f2594c.getLong(this.f2596e);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2592a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f2594c.moveToPosition(i)) {
            if (view == null) {
                view = b(this.f2595d, this.f2594c, viewGroup);
            }
            a(view, this.f2595d, this.f2594c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }
}

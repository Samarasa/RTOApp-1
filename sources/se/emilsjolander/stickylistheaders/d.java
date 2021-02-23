package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.widget.Checkable;

class d extends r implements Checkable {
    public d(Context context) {
        super(context);
    }

    public boolean isChecked() {
        return ((Checkable) this.f15624a).isChecked();
    }

    public void setChecked(boolean z) {
        ((Checkable) this.f15624a).setChecked(z);
    }

    public void toggle() {
        setChecked(!isChecked());
    }
}

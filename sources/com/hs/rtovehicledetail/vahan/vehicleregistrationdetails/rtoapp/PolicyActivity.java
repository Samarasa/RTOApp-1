package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import java.util.Objects;

public class PolicyActivity extends o {
    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_policy);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}

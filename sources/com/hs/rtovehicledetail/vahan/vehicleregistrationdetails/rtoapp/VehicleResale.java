package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.cardview.widget.CardView;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import java.util.Objects;

public class VehicleResale extends o {
    private FrameLayout adContainerView;
    private h adViewbanner;
    CardView carResale;
    ImageView go_back;
    CardView motoResale;
    CardView scootyResale;

    /* access modifiers changed from: private */
    public void loadBanner() {
        this.adViewbanner = new h(this);
        this.adViewbanner.setAdUnitId(getString(R.string.admob_banner_id));
        this.adContainerView.removeAllViews();
        this.adContainerView.addView(this.adViewbanner);
        this.adViewbanner.setAdSize(DataHandler.getAdSize(this, this.adContainerView));
        e.a aVar = new e.a();
        aVar.b("B3EEABB8EE11C2BE770B684D95219ECB");
        this.adViewbanner.a(aVar.a());
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vehicle_resale);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        setTitle("Check Resale value");
        this.carResale = (CardView) findViewById(R.id.carResale);
        this.motoResale = (CardView) findViewById(R.id.motoResale);
        this.scootyResale = (CardView) findViewById(R.id.scootyResale);
        this.carResale.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                VehicleResale vehicleResale = VehicleResale.this;
                vehicleResale.startActivity(new Intent(vehicleResale, ResaleValue.class).putExtra("cat", "1"));
            }
        });
        this.motoResale.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                VehicleResale vehicleResale = VehicleResale.this;
                vehicleResale.startActivity(new Intent(vehicleResale, ResaleValue.class).putExtra("cat", "2"));
            }
        });
        this.scootyResale.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                VehicleResale vehicleResale = VehicleResale.this;
                vehicleResale.startActivity(new Intent(vehicleResale, ResaleValue.class).putExtra("cat", "3"));
            }
        });
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_resale);
        this.adContainerView.post(new Runnable() {
            public void run() {
                VehicleResale.this.loadBanner();
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}

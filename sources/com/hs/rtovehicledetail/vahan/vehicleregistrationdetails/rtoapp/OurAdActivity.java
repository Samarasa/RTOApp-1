package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.app.ProgressDialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.o;
import androidx.fragment.app.C0159i;
import c.a.a.c;
import c.a.a.c.a;
import c.a.a.c.b.z;
import c.a.a.g.a.h;
import c.a.a.g.d;
import c.a.a.g.e;
import c.a.a.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OurAdActivity extends o implements View.OnClickListener {
    ImageView ad_img;
    Button btn_install;
    ImageView close;
    boolean fromHome;
    List<Integer> list1 = new ArrayList();
    TextView loading;
    Button no_thanks;
    int num = 0;
    int num1 = 0;
    ProgressDialog progressDialog;

    private void checkNumber() {
        String[] split = getSharedPreferences("hangoverstudios_vehicleinfo_scan", 0).getString("Clicked_Ads", "11,12").split(",");
        if (split.length > 0 && split.length < 11) {
            getNumber();
            if (this.list1.size() > 0) {
                Collections.shuffle(this.list1);
                this.num = this.list1.get(0).intValue();
                return;
            }
        } else if (split.length < 11) {
            return;
        }
        finish();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void clickEvent() {
        /*
            r6 = this;
            int r0 = r6.num
            java.lang.String r1 = "android.intent.action.VIEW"
            switch(r0) {
                case 1: goto L_0x00e2;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00aa;
                case 4: goto L_0x008e;
                case 5: goto L_0x0071;
                case 6: goto L_0x0054;
                case 7: goto L_0x0041;
                case 8: goto L_0x0024;
                default: goto L_0x0007;
            }
        L_0x0007:
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r0 = r0.getOurApp9LinkIn()
            if (r0 == 0) goto L_0x00fe
            android.content.Intent r0 = new android.content.Intent
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r2 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r2 = r2.getOurApp9LinkIn()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.<init>(r1, r2)
            goto L_0x00ff
        L_0x0024:
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r0 = r0.getOurApp8LinkIn()
            if (r0 == 0) goto L_0x00fe
            android.content.Intent r0 = new android.content.Intent
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r2 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r2 = r2.getOurApp8LinkIn()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.<init>(r1, r2)
            goto L_0x00ff
        L_0x0041:
            android.content.Intent r0 = new android.content.Intent
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r2 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r2 = r2.getOurApp7LinkIn()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.<init>(r1, r2)
            goto L_0x00ff
        L_0x0054:
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r0 = r0.getOurApp6LinkIn()
            if (r0 == 0) goto L_0x00fe
            android.content.Intent r0 = new android.content.Intent
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r2 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r2 = r2.getOurApp6LinkIn()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.<init>(r1, r2)
            goto L_0x00ff
        L_0x0071:
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r0 = r0.getOurApp5LinkIn()
            if (r0 == 0) goto L_0x00fe
            android.content.Intent r0 = new android.content.Intent
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r2 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r2 = r2.getOurApp5LinkIn()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.<init>(r1, r2)
            goto L_0x00ff
        L_0x008e:
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r0 = r0.getOurApp4LinkIn()
            if (r0 == 0) goto L_0x00fe
            android.content.Intent r0 = new android.content.Intent
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r2 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r2 = r2.getOurApp4LinkIn()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.<init>(r1, r2)
            goto L_0x00ff
        L_0x00aa:
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r0 = r0.getOurApp3LinkIn()
            if (r0 == 0) goto L_0x00fe
            android.content.Intent r0 = new android.content.Intent
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r2 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r2 = r2.getOurApp3LinkIn()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.<init>(r1, r2)
            goto L_0x00ff
        L_0x00c6:
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r0 = r0.getOurApp2LinkIn()
            if (r0 == 0) goto L_0x00fe
            android.content.Intent r0 = new android.content.Intent
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r2 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r2 = r2.getOurApp2LinkIn()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.<init>(r1, r2)
            goto L_0x00ff
        L_0x00e2:
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r0 = r0.getOurApp1LinkIn()
            if (r0 == 0) goto L_0x00fe
            android.content.Intent r0 = new android.content.Intent
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r2 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            java.lang.String r2 = r2.getOurApp1LinkIn()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r0.<init>(r1, r2)
            goto L_0x00ff
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            if (r0 == 0) goto L_0x013b
            r1 = 0
            java.lang.String r2 = "hangoverstudios_vehicleinfo_scan"
            android.content.SharedPreferences r3 = r6.getSharedPreferences(r2, r1)
            java.lang.String r4 = "Clicked_Ads"
            java.lang.String r5 = "11,12"
            java.lang.String r3 = r3.getString(r4, r5)
            android.content.SharedPreferences r1 = r6.getSharedPreferences(r2, r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = ","
            r2.append(r3)
            int r3 = r6.num
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r2)
            r1.apply()
            r6.getNumber()
            r6.startActivity(r0)
        L_0x013b:
            r6.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.OurAdActivity.clickEvent():void");
    }

    /* access modifiers changed from: private */
    public void dismissDialog() {
        ProgressDialog progressDialog2;
        if (!isFinishing() && (progressDialog2 = this.progressDialog) != null && progressDialog2.isShowing()) {
            this.progressDialog.dismiss();
            this.progressDialog = null;
        }
    }

    private void findMissingNumber(int[] iArr, int[] iArr2) {
        int parseInt;
        this.list1.clear();
        for (int i : iArr) {
            if (!isPresent(i, iArr2)) {
                this.list1.add(Integer.valueOf(i));
            }
        }
        if (this.list1.size() == 1 && (parseInt = Integer.parseInt(getSharedPreferences("hangoverstudios_vehicleinfo_scan", 0).getString("Priority", "1"))) != 3) {
            getSharedPreferences("hangoverstudios_vehicleinfo_scan", 0).edit().putString("Priority", (parseInt + 1) + BuildConfig.FLAVOR).apply();
        }
    }

    private boolean isPresent(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public void getNumber() {
        int parseInt = Integer.parseInt(getSharedPreferences("hangoverstudios_vehicleinfo_scan", 0).getString("Priority", "1")) * 3;
        if (parseInt > 9) {
            finish();
        }
        int[] iArr = new int[parseInt];
        int i = 0;
        while (i < parseInt) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        String[] split = getSharedPreferences("hangoverstudios_vehicleinfo_scan", 0).getString("Clicked_Ads", "11,12").split(",");
        int[] iArr2 = new int[split.length];
        for (int i3 = 0; i3 < split.length; i3++) {
            iArr2[i3] = Integer.parseInt(split[i3]);
        }
        findMissingNumber(iArr, iArr2);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        if (view.getId() != R.id.close) {
            clickEvent();
        } else {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        k<Drawable> kVar;
        d dVar;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView((int) R.layout.activity_our_ad);
        this.fromHome = getIntent().getBooleanExtra("From_Home", false);
        this.progressDialog = new ProgressDialog(this);
        this.progressDialog.setMessage("Loading...");
        this.progressDialog.show();
        this.progressDialog.setCancelable(false);
        this.close = (ImageView) findViewById(R.id.close);
        this.close.setOnClickListener(this);
        this.ad_img = (ImageView) findViewById(R.id.ad_img);
        this.ad_img.setOnClickListener(this);
        new e().b((int) R.drawable.loading).a((int) R.drawable.ic_error_outline_black_24dp);
        checkNumber();
        switch (this.num) {
            case 1:
                kVar = c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp1iconIn());
                dVar = new d<Drawable>() {
                    public boolean onLoadFailed(z zVar, Object obj, h<Drawable> hVar, boolean z) {
                        OurAdActivity.this.onBackPressed();
                        return false;
                    }

                    public boolean onResourceReady(Drawable drawable, Object obj, h<Drawable> hVar, a aVar, boolean z) {
                        OurAdActivity.this.dismissDialog();
                        return false;
                    }
                };
                break;
            case 2:
                kVar = c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp2iconIn());
                dVar = new d<Drawable>() {
                    public boolean onLoadFailed(z zVar, Object obj, h<Drawable> hVar, boolean z) {
                        OurAdActivity.this.onBackPressed();
                        return false;
                    }

                    public boolean onResourceReady(Drawable drawable, Object obj, h<Drawable> hVar, a aVar, boolean z) {
                        OurAdActivity.this.dismissDialog();
                        return false;
                    }
                };
                break;
            case 3:
                kVar = c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp3iconIn());
                dVar = new d<Drawable>() {
                    public boolean onLoadFailed(z zVar, Object obj, h<Drawable> hVar, boolean z) {
                        OurAdActivity.this.onBackPressed();
                        return false;
                    }

                    public boolean onResourceReady(Drawable drawable, Object obj, h<Drawable> hVar, a aVar, boolean z) {
                        OurAdActivity.this.dismissDialog();
                        return false;
                    }
                };
                break;
            case 4:
                kVar = c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp4iconIn());
                dVar = new d<Drawable>() {
                    public boolean onLoadFailed(z zVar, Object obj, h<Drawable> hVar, boolean z) {
                        OurAdActivity.this.onBackPressed();
                        return false;
                    }

                    public boolean onResourceReady(Drawable drawable, Object obj, h<Drawable> hVar, a aVar, boolean z) {
                        OurAdActivity.this.dismissDialog();
                        return false;
                    }
                };
                break;
            case 5:
                kVar = c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp5iconIn());
                dVar = new d<Drawable>() {
                    public boolean onLoadFailed(z zVar, Object obj, h<Drawable> hVar, boolean z) {
                        OurAdActivity.this.onBackPressed();
                        return false;
                    }

                    public boolean onResourceReady(Drawable drawable, Object obj, h<Drawable> hVar, a aVar, boolean z) {
                        OurAdActivity.this.dismissDialog();
                        return false;
                    }
                };
                break;
            case 6:
                kVar = c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp6iconIn());
                dVar = new d<Drawable>() {
                    public boolean onLoadFailed(z zVar, Object obj, h<Drawable> hVar, boolean z) {
                        OurAdActivity.this.onBackPressed();
                        return false;
                    }

                    public boolean onResourceReady(Drawable drawable, Object obj, h<Drawable> hVar, a aVar, boolean z) {
                        OurAdActivity.this.dismissDialog();
                        return false;
                    }
                };
                break;
            case 7:
                kVar = c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp7iconIn());
                dVar = new d<Drawable>() {
                    public boolean onLoadFailed(z zVar, Object obj, h<Drawable> hVar, boolean z) {
                        OurAdActivity.this.onBackPressed();
                        return false;
                    }

                    public boolean onResourceReady(Drawable drawable, Object obj, h<Drawable> hVar, a aVar, boolean z) {
                        OurAdActivity.this.dismissDialog();
                        return false;
                    }
                };
                break;
            case 8:
                kVar = c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp8iconIn());
                dVar = new d<Drawable>() {
                    public boolean onLoadFailed(z zVar, Object obj, h<Drawable> hVar, boolean z) {
                        OurAdActivity.this.onBackPressed();
                        return false;
                    }

                    public boolean onResourceReady(Drawable drawable, Object obj, h<Drawable> hVar, a aVar, boolean z) {
                        OurAdActivity.this.dismissDialog();
                        return false;
                    }
                };
                break;
            case 9:
                kVar = c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp9iconIn());
                dVar = new d<Drawable>() {
                    public boolean onLoadFailed(z zVar, Object obj, h<Drawable> hVar, boolean z) {
                        OurAdActivity.this.onBackPressed();
                        return false;
                    }

                    public boolean onResourceReady(Drawable drawable, Object obj, h<Drawable> hVar, a aVar, boolean z) {
                        OurAdActivity.this.dismissDialog();
                        return false;
                    }
                };
                break;
            default:
                return;
        }
        kVar.b((d<Drawable>) dVar);
        kVar.a(this.ad_img);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        dismissDialog();
    }
}

package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.C0107n;
import androidx.appcompat.app.o;
import androidx.fragment.app.C0159i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.c.a.a.c;
import c.c.a.a.e;
import c.c.a.a.i;
import c.c.a.a.j;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class ChallanResults extends o {
    private FrameLayout adContainerView;
    private h adViewbanner;
    RecyclerView challan;
    ChallanAdapter challanAdapter;
    /* access modifiers changed from: private */
    public List<ChallanBean> challanList = new ArrayList();
    ScrollView challan_data_view;
    Dialog dialog;
    ImageView go_back;
    String loadingMsg = BuildConfig.FLAVOR;
    /* access modifiers changed from: private */
    public LinearLayout rating_layout;
    String rcNo_dlNO = BuildConfig.FLAVOR;
    private ImageView starFive;
    private ImageView starFour;
    private ImageView starOne;
    private ImageView starThree;
    private ImageView starTwo;

    private void checkChallan(String str) {
        String str2;
        String str3;
        this.challanList.clear();
        showDialog();
        i iVar = new i();
        if (getIntent().getStringExtra("with").equals("RC") && VehicleInfoHandler.getInstance().geteChallanRC() != null) {
            str2 = VehicleInfoHandler.getInstance().geteChallanRC();
            str3 = "rc_no";
        } else if (!getIntent().getStringExtra("with").equals("DL") || VehicleInfoHandler.getInstance().geteChallanDL() == null) {
            str2 = BuildConfig.FLAVOR;
            c cVar = new c();
            cVar.a("Content-Type", "application/x-www-form-urlencoded");
            cVar.a(7000);
            cVar.a(str2, iVar, (j) new e() {
                public void onFailure(int i, Throwable th, String str) {
                    System.out.println();
                    ChallanResults.this.noChallansToShow();
                }

                public void onSuccess(String str) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.getInt("status") == 200) {
                            JSONArray jSONArray = new JSONArray(jSONObject.getString("result"));
                            if (jSONArray.length() > 0) {
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                    ChallanResults.this.challanList.add(new ChallanBean(jSONObject2.getString("challan_no"), jSONObject2.getString("amount"), jSONObject2.getString("status"), jSONObject2.getString("date_time"), jSONObject2.getString("payment_date")));
                                }
                                ChallanResults.this.challanAdapter = new ChallanAdapter(ChallanResults.this.challanList, ChallanResults.this);
                                ChallanResults.this.challan.setLayoutManager(new LinearLayoutManager(ChallanResults.this));
                                ChallanResults.this.challan.setAdapter(ChallanResults.this.challanAdapter);
                            }
                            ChallanResults.this.hideDialog();
                            ChallanResults.this.challan_data_view.setVisibility(0);
                            DataHandler.getInstance();
                            if (!DataHandler.isRatingDone(ChallanResults.this)) {
                                ChallanResults.this.rating_layout.setVisibility(0);
                            } else {
                                ChallanResults.this.rating_layout.setVisibility(8);
                            }
                        } else {
                            ChallanResults.this.noChallansToShow();
                        }
                        System.out.println(str);
                    } catch (Exception e2) {
                        PrintStream printStream = System.out;
                        printStream.println("e" + e2);
                        ChallanResults.this.noChallansToShow();
                    }
                }
            });
        } else {
            str2 = VehicleInfoHandler.getInstance().geteChallanDL();
            str3 = "dl_no";
        }
        iVar.a(str3, str);
        c cVar2 = new c();
        cVar2.a("Content-Type", "application/x-www-form-urlencoded");
        cVar2.a(7000);
        cVar2.a(str2, iVar, (j) new e() {
            public void onFailure(int i, Throwable th, String str) {
                System.out.println();
                ChallanResults.this.noChallansToShow();
            }

            public void onSuccess(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.getInt("status") == 200) {
                        JSONArray jSONArray = new JSONArray(jSONObject.getString("result"));
                        if (jSONArray.length() > 0) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                ChallanResults.this.challanList.add(new ChallanBean(jSONObject2.getString("challan_no"), jSONObject2.getString("amount"), jSONObject2.getString("status"), jSONObject2.getString("date_time"), jSONObject2.getString("payment_date")));
                            }
                            ChallanResults.this.challanAdapter = new ChallanAdapter(ChallanResults.this.challanList, ChallanResults.this);
                            ChallanResults.this.challan.setLayoutManager(new LinearLayoutManager(ChallanResults.this));
                            ChallanResults.this.challan.setAdapter(ChallanResults.this.challanAdapter);
                        }
                        ChallanResults.this.hideDialog();
                        ChallanResults.this.challan_data_view.setVisibility(0);
                        DataHandler.getInstance();
                        if (!DataHandler.isRatingDone(ChallanResults.this)) {
                            ChallanResults.this.rating_layout.setVisibility(0);
                        } else {
                            ChallanResults.this.rating_layout.setVisibility(8);
                        }
                    } else {
                        ChallanResults.this.noChallansToShow();
                    }
                    System.out.println(str);
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("e" + e2);
                    ChallanResults.this.noChallansToShow();
                }
            }
        });
    }

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

    /* access modifiers changed from: private */
    public void noChallansToShow() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                ChallanResults.this.hideDialog();
                ChallanResults.this.showChallanDialog();
            }
        }, 2000);
    }

    /* access modifiers changed from: private */
    public void openFeedback() {
        C0107n.a aVar = new C0107n.a(this);
        aVar.b((int) R.string.send_us_feedback);
        aVar.a((int) R.string.share_experience_with_us);
        aVar.b((int) R.string.ok, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "hangoverstudios.mobile@gmail.com", (String) null));
                intent.putExtra("android.intent.extra.SUBJECT", "Subject:Feedback");
                intent.putExtra("android.intent.extra.TEXT", "Body");
                ChallanResults.this.startActivity(Intent.createChooser(intent, "Send email..."));
                DataHandler.getInstance();
                DataHandler.setRatingDone(ChallanResults.this);
            }
        });
        aVar.a((int) R.string.cancel, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        aVar.c();
    }

    /* access modifiers changed from: private */
    public void ratingPlaystore() {
        DataHandler.getInstance();
        DataHandler.setRatingDone(this);
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
    }

    /* access modifiers changed from: private */
    public void showChallanDialog() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.no_challan, (ViewGroup) null);
        final C0107n a2 = new C0107n.a(this).a();
        a2.a(inflate);
        inflate.findViewById(R.id.no_cha).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                a2.dismiss();
                ChallanResults.this.finish();
            }
        });
        a2.show();
    }

    public void hideDialog() {
        Dialog dialog2;
        if (!isFinishing() && (dialog2 = this.dialog) != null && dialog2.isShowing()) {
            this.dialog.dismiss();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        DataHandler.showAd(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        StringBuilder sb;
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_challan_results);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        setTitle("E-Challans");
        this.challan_data_view = (ScrollView) findViewById(R.id.challan_data_view);
        this.rating_layout = (LinearLayout) findViewById(R.id.rating_layout);
        this.starOne = (ImageView) findViewById(R.id.starOne);
        this.starTwo = (ImageView) findViewById(R.id.starTwo);
        this.starThree = (ImageView) findViewById(R.id.starThree);
        this.starFour = (ImageView) findViewById(R.id.starFour);
        this.starFive = (ImageView) findViewById(R.id.starFive);
        this.starFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChallanResults.this.ratingPlaystore();
            }
        });
        this.starFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChallanResults.this.openFeedback();
            }
        });
        this.starThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChallanResults.this.openFeedback();
            }
        });
        this.starTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChallanResults.this.openFeedback();
            }
        });
        this.starOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ChallanResults.this.openFeedback();
            }
        });
        this.challan = (RecyclerView) findViewById(R.id.challanRecycler);
        if (getIntent().hasExtra("rcNo")) {
            if (getIntent().getStringExtra("with").equals("RC")) {
                this.rcNo_dlNO = getIntent().getStringExtra("rcNo");
                sb = new StringBuilder();
                str = "Please wait,\n searching for E-challans of the vehicle number: ";
            } else if (getIntent().getStringExtra("with").equals("DL")) {
                this.rcNo_dlNO = getIntent().getStringExtra("rcNo");
                sb = new StringBuilder();
                str = "Please wait, \nsearching for E-challans related to the licence number : ";
            }
            sb.append(str);
            sb.append(this.rcNo_dlNO);
            sb.append(" in RTO server.");
            this.loadingMsg = sb.toString();
            checkChallan(getIntent().getStringExtra("rcNo"));
        }
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_challan_result);
        this.adContainerView.post(new Runnable() {
            public void run() {
                ChallanResults.this.loadBanner();
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

    public void showDialog() {
        this.dialog = new Dialog(this);
        this.dialog.requestWindowFeature(1);
        this.dialog.setCancelable(false);
        this.dialog.setContentView(R.layout.new_loading);
        ((TextView) this.dialog.findViewById(R.id.loading_msg)).setText(this.loadingMsg);
        c.a.a.c.a((C0159i) this).a(Integer.valueOf(R.drawable.loadinggif)).a((ImageView) this.dialog.findViewById(R.id.loading_gif));
        this.dialog.show();
    }
}

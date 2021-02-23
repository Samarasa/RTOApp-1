package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.C0159i;
import c.a.a.c;
import c.a.a.k;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.h;
import g.A;
import g.E;
import g.H;
import g.J;
import g.x;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DLTest extends o implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static DLTest testInstance;
    private FrameLayout adContainerView;
    private h adViewbanner;
    LinearLayout fb_banner_container_dl_test;
    /* access modifiers changed from: private */
    public TextView loading;
    /* access modifiers changed from: private */
    public CardView next;
    /* access modifiers changed from: private */
    public RadioButton optionOne;
    /* access modifiers changed from: private */
    public RadioButton optionThree;
    /* access modifiers changed from: private */
    public RadioButton optionTwo;
    private RadioGroup options;
    /* access modifiers changed from: private */
    public CardView previous;
    /* access modifiers changed from: private */
    public ImageView qImage;
    /* access modifiers changed from: private */
    public TextView qQuestion;
    int qidCurrent;
    /* access modifiers changed from: private */
    public TextView questionCount;
    /* access modifiers changed from: private */
    public LinearLayout questionView;
    public List<DLTestBean> testList = new ArrayList();

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
    public void setQuestion(final int i) {
        if (i >= this.testList.size()) {
            this.questionView.setVisibility(8);
            System.out.println(this.testList);
            return;
        }
        new Handler().postDelayed(new Runnable() {
            public void run() {
                RadioButton access$900;
                DLTest dLTest = DLTest.this;
                if (dLTest.qidCurrent != 0) {
                    dLTest.previous.setVisibility(0);
                } else {
                    dLTest.previous.setVisibility(8);
                }
                DLTest dLTest2 = DLTest.this;
                if (dLTest2.qidCurrent < 9) {
                    dLTest2.next.setVisibility(0);
                } else {
                    dLTest2.next.setVisibility(8);
                }
                DLTest.this.clearRadioChecked();
                TextView access$500 = DLTest.this.questionCount;
                access$500.setText("Question " + (i + 1));
                if (DLTest.this.testList.size() > i) {
                    DLTest.this.qQuestion.setText(DLTest.this.testList.get(i).getqQuestion());
                    DLTest.this.optionOne.setText(DLTest.this.testList.get(i).getqOptionOne());
                    DLTest.this.optionTwo.setText(DLTest.this.testList.get(i).getqOptionTwo());
                    DLTest.this.optionThree.setText(DLTest.this.testList.get(i).getqOptionThree());
                    c.a.a.g.e a2 = new c.a.a.g.e().b((int) R.drawable.loading).a((int) R.drawable.ic_error_outline_black_24dp);
                    if (DLTest.this.testList.get(i).getqImg().equals(BuildConfig.FLAVOR)) {
                        DLTest.this.qImage.setVisibility(4);
                    } else if (!DLTest.this.isFinishing()) {
                        k<Drawable> a3 = c.a((C0159i) DLTest.this).a(DLTest.this.testList.get(i).getqImg());
                        a3.a(a2);
                        a3.a(DLTest.this.qImage);
                    }
                    if (!DLTest.this.testList.get(i).getuAnswer().equals(BuildConfig.FLAVOR)) {
                        if (DLTest.this.testList.get(i).getqOptionOne().equals(DLTest.this.testList.get(i).getuAnswer())) {
                            access$900 = DLTest.this.optionOne;
                        } else if (DLTest.this.testList.get(i).getqOptionTwo().equals(DLTest.this.testList.get(i).getuAnswer())) {
                            access$900 = DLTest.this.optionTwo;
                        } else {
                            if (DLTest.this.testList.get(i).getqOptionThree().equals(DLTest.this.testList.get(i).getuAnswer())) {
                                access$900 = DLTest.this.optionThree;
                            }
                            k<Drawable> a4 = c.a((C0159i) DLTest.this).a(DLTest.this.testList.get(i).getqImg());
                            a4.a(a2);
                            a4.a(DLTest.this.qImage);
                        }
                        access$900.setChecked(true);
                        k<Drawable> a42 = c.a((C0159i) DLTest.this).a(DLTest.this.testList.get(i).getqImg());
                        a42.a(a2);
                        a42.a(DLTest.this.qImage);
                    }
                    ObjectAnimator.ofFloat(DLTest.this.questionView, "alpha", new float[]{0.0f, 1.0f}).start();
                    DLTest.this.loading.setVisibility(8);
                    DLTest.this.questionView.setVisibility(0);
                }
            }
        }, 500);
    }

    /* access modifiers changed from: private */
    public void showQuestions(String str) {
        if (!str.equals(BuildConfig.FLAVOR)) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < 10; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        JSONArray jSONArray2 = jSONObject.getJSONArray("option");
                        this.testList.add(new DLTestBean(jSONObject.getString("ImageUrl"), jSONObject.getString("Question"), jSONArray2.getString(0), jSONArray2.getString(1), jSONArray2.getString(2), jSONObject.getString("Answer"), BuildConfig.FLAVOR, i));
                    }
                    this.qidCurrent = 0;
                    setQuestion(this.qidCurrent);
                    return;
                }
                finish();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else {
            finish();
        }
    }

    public void clearRadioChecked() {
        this.optionOne.setChecked(false);
        this.optionTwo.setChecked(false);
        this.optionThree.setChecked(false);
    }

    public void loadJSONFromAsset() {
        MainActivity mainActivity = MainActivity.mObj;
        final String returnADIDCount = mainActivity != null ? mainActivity.returnADIDCount() : BuildConfig.FLAVOR;
        String str = null;
        try {
            str = new String(Base64.encode("reg1:asd~reg2:asda".getBytes(), 0), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        final String replaceAll = MainActivity.insertPeriodically(str.replaceAll("\n", BuildConfig.FLAVOR), "a", 1).replaceAll("\n", BuildConfig.FLAVOR);
        new AsyncTask<Void, Integer, String>() {
            /* access modifiers changed from: protected */
            public String doInBackground(Void... voidArr) {
                x.a aVar = new x.a();
                aVar.a("cookie", replaceAll);
                aVar.a("auth", returnADIDCount);
                x a2 = aVar.a();
                E.a aVar2 = new E.a();
                aVar2.a(30, TimeUnit.SECONDS);
                aVar2.c(30, TimeUnit.SECONDS);
                aVar2.b(90, TimeUnit.SECONDS);
                E a3 = aVar2.a();
                A.a i = A.c(PreferenceManager.getDefaultSharedPreferences(DLTest.this).getString("api_dl_test", BuildConfig.FLAVOR)).i();
                i.a("auth", returnADIDCount);
                H.a aVar3 = new H.a();
                aVar3.b(i.a().toString());
                aVar3.a((J) a2);
                try {
                    return a3.a(aVar3.a()).execute().a().t().toString();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return BuildConfig.FLAVOR;
                }
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(String str) {
                super.onPostExecute(str);
                try {
                    String str2 = new String(str);
                    if (new JSONObject(str2).getString("message").equals("Success")) {
                        DLTest.this.showQuestions(str2);
                        return;
                    }
                    DLTest.this.finish();
                    Toast.makeText(DLTest.this, "Test Data Not Found", 0).show();
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("e" + e2);
                }
            }

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                super.onPreExecute();
            }
        }.execute(new Void[0]);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_dltest);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        this.options = (RadioGroup) findViewById(R.id.options);
        this.optionOne = (RadioButton) findViewById(R.id.option_one);
        this.optionTwo = (RadioButton) findViewById(R.id.option_two);
        this.optionThree = (RadioButton) findViewById(R.id.option_three);
        this.qQuestion = (TextView) findViewById(R.id.q_question);
        this.qImage = (ImageView) findViewById(R.id.q_image);
        this.questionCount = (TextView) findViewById(R.id.question_count);
        this.questionView = (LinearLayout) findViewById(R.id.question_view);
        this.next = (CardView) findViewById(R.id.next);
        this.loading = (TextView) findViewById(R.id.loading);
        this.previous = (CardView) findViewById(R.id.previous);
        testInstance = this;
        setTitle("Driving Licence Test");
        loadJSONFromAsset();
        if (this.qidCurrent == 0) {
            this.previous.setVisibility(8);
        }
        if (this.qidCurrent >= this.testList.size()) {
            this.next.setVisibility(8);
        }
        this.previous.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                DLTest.this.clearRadioChecked();
                DLTest dLTest = DLTest.this;
                int i = dLTest.qidCurrent - 1;
                dLTest.qidCurrent = i;
                dLTest.setQuestion(i);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(DLTest.this.questionView, "alpha", new float[]{1.0f, 0.0f});
                ofFloat.setDuration(500);
                ofFloat.start();
            }
        });
        this.next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                int size = DLTest.this.testList.size();
                DLTest dLTest = DLTest.this;
                int i = dLTest.qidCurrent;
                if (size < i) {
                    return;
                }
                if (dLTest.testList.get(i).getuAnswer().equals(BuildConfig.FLAVOR)) {
                    Toast.makeText(DLTest.this, "Please choose answer", 0).show();
                    return;
                }
                DLTest.this.clearRadioChecked();
                DLTest dLTest2 = DLTest.this;
                int i2 = dLTest2.qidCurrent + 1;
                dLTest2.qidCurrent = i2;
                dLTest2.setQuestion(i2);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(DLTest.this.questionView, "alpha", new float[]{1.0f, 0.0f});
                ofFloat.setDuration(500);
                ofFloat.start();
            }
        });
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_dltest);
        this.fb_banner_container_dl_test = (LinearLayout) findViewById(R.id.fb_banner_dl_test);
        boolean showAdMobBanner = DataHandler.showAdMobBanner(this);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("ShowBanner", "false").equals("true") && showAdMobBanner) {
            this.adContainerView.post(new Runnable() {
                public void run() {
                    DLTest.this.loadBanner();
                }
            });
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ca, code lost:
        startActivity(r9);
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00e2, code lost:
        r9.setDuration(500);
        r9.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRadioButtonClicked(android.view.View r9) {
        /*
            r8 = this;
            r0 = r9
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            boolean r0 = r0.isChecked()
            r8.clearRadioChecked()
            int r9 = r9.getId()
            r1 = 500(0x1f4, double:2.47E-321)
            r3 = 2
            java.lang.String r4 = "alpha"
            r5 = 9
            r6 = 1
            switch(r9) {
                case 2131362231: goto L_0x009d;
                case 2131362232: goto L_0x005d;
                case 2131362233: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x00e8
        L_0x001b:
            if (r0 == 0) goto L_0x0038
            java.util.List<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean> r9 = r8.testList
            int r0 = r8.qidCurrent
            java.lang.Object r9 = r9.get(r0)
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean r9 = (com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean) r9
            java.util.List<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean> r0 = r8.testList
            int r7 = r8.qidCurrent
            java.lang.Object r0 = r0.get(r7)
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean r0 = (com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean) r0
            java.lang.String r0 = r0.getqOptionTwo()
            r9.setuAnswer(r0)
        L_0x0038:
            android.widget.RadioButton r9 = r8.optionTwo
            r9.setChecked(r6)
            int r9 = r8.qidCurrent
            if (r9 != r5) goto L_0x004a
            android.content.Intent r9 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestResults> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestResults.class
            r9.<init>(r8, r0)
            goto L_0x00ca
        L_0x004a:
            int r9 = r9 + r6
            r8.qidCurrent = r9
            r8.setQuestion(r9)
            android.widget.LinearLayout r9 = r8.questionView
            float[] r0 = new float[r3]
            r0 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r4, r0)
            goto L_0x00e2
        L_0x005d:
            if (r0 == 0) goto L_0x007a
            java.util.List<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean> r9 = r8.testList
            int r0 = r8.qidCurrent
            java.lang.Object r9 = r9.get(r0)
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean r9 = (com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean) r9
            java.util.List<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean> r0 = r8.testList
            int r7 = r8.qidCurrent
            java.lang.Object r0 = r0.get(r7)
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean r0 = (com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean) r0
            java.lang.String r0 = r0.getqOptionThree()
            r9.setuAnswer(r0)
        L_0x007a:
            android.widget.RadioButton r9 = r8.optionThree
            r9.setChecked(r6)
            int r9 = r8.qidCurrent
            if (r9 != r5) goto L_0x008b
            android.content.Intent r9 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestResults> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestResults.class
            r9.<init>(r8, r0)
            goto L_0x00ca
        L_0x008b:
            int r9 = r9 + r6
            r8.qidCurrent = r9
            r8.setQuestion(r9)
            android.widget.LinearLayout r9 = r8.questionView
            float[] r0 = new float[r3]
            r0 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r4, r0)
            goto L_0x00e2
        L_0x009d:
            if (r0 == 0) goto L_0x00ba
            java.util.List<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean> r9 = r8.testList
            int r0 = r8.qidCurrent
            java.lang.Object r9 = r9.get(r0)
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean r9 = (com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean) r9
            java.util.List<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean> r0 = r8.testList
            int r7 = r8.qidCurrent
            java.lang.Object r0 = r0.get(r7)
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean r0 = (com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestBean) r0
            java.lang.String r0 = r0.getqOptionOne()
            r9.setuAnswer(r0)
        L_0x00ba:
            android.widget.RadioButton r9 = r8.optionOne
            r9.setChecked(r6)
            int r9 = r8.qidCurrent
            if (r9 != r5) goto L_0x00d1
            android.content.Intent r9 = new android.content.Intent
            java.lang.Class<com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestResults> r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTestResults.class
            r9.<init>(r8, r0)
        L_0x00ca:
            r8.startActivity(r9)
            r8.finish()
            goto L_0x00e8
        L_0x00d1:
            int r9 = r9 + r6
            r8.qidCurrent = r9
            r8.setQuestion(r9)
            android.widget.LinearLayout r9 = r8.questionView
            float[] r0 = new float[r3]
            r0 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r9, r4, r0)
        L_0x00e2:
            r9.setDuration(r1)
            r9.start()
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DLTest.onRadioButtonClicked(android.view.View):void");
    }
}

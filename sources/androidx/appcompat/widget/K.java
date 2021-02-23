package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b.h.i.g;

final class K {

    /* renamed from: a  reason: collision with root package name */
    private TextView f474a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f475b;

    K(TextView textView) {
        g.a(textView);
        this.f474a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f475b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f474a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public void a(TextClassifier textClassifier) {
        this.f475b = textClassifier;
    }
}

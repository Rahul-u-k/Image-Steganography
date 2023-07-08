package com.developer.gbuttons;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class GoogleSignInButton extends View {
    public GoogleSignInButton(Context context) {
        this(context, null);
    }

    public GoogleSignInButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public GoogleSignInButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}

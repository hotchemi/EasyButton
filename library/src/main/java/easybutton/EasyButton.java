package easybutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/**
 * Custom button set background color easily.
 *
 * @author Shintaro Katafuchi
 */
public class EasyButton extends Button implements View.OnTouchListener, View.OnFocusChangeListener {

    private int mDefaultColor;

    private int mPressedColor;

    private int mFocusedColor;

    public EasyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
        setBackGroundColor(mDefaultColor);
        setOnTouchListener(this);
        setOnFocusChangeListener(this);
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                setBackGroundColor(mPressedColor);
                return false;
            case MotionEvent.ACTION_UP:
                setBackGroundColor(mDefaultColor);
                return false;
            default:
                return false;
        }
    }

    @Override
    public void onFocusChange(View view, boolean hasFocus) {
        setBackGroundColor(hasFocus ? mFocusedColor : mDefaultColor);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray attr = context.obtainStyledAttributes(attrs, R.styleable.flat_button);
        mDefaultColor = attr.getColor(0, 0);
        mPressedColor = attr.getColor(1, 0);
        mFocusedColor = attr.getColor(2, 0);
    }

    private void setBackGroundColor(final int color) {
        if (color != 0) setBackgroundColor(color);
    }

}
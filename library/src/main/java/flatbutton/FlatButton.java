package flatbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import hotchemi.flatbutton.R;

/**
 * Provides flat style button.
 *
 * @author Shintaro Katafuchi
 */
public class FlatButton extends Button implements View.OnTouchListener {

    private final int defaultColor;

    private final int pressedColor;

    public FlatButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray attr = context.obtainStyledAttributes(attrs, R.styleable.flat_button);
        defaultColor = attr.getColor(0, 0);
        pressedColor = attr.getColor(1, 0);
        setTextColor(getResources().getColor(android.R.color.white));
        setBackgroundColor(defaultColor);
        setPadding(8, 8, 8, 8);
        setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                setBackgroundColor(pressedColor);
                return true;
            case MotionEvent.ACTION_UP:
                setBackgroundColor(defaultColor);
                return true;
            default:
                return true;
        }
    }

}
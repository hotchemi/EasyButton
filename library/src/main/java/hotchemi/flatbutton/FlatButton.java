
package hotchemi.flatbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Provides flat style button.
 * 
 * @author Shintaro Katafuchi
 */
public class FlatButton extends Button {

    public FlatButton(Context context) {
        super(context);
    }

    public FlatButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.flat_button);
        setText(a.getText(0));
        setTextColor(a.getColor(1, 0));
        setTextSize(a.getDimension(2, 0));
    }

}

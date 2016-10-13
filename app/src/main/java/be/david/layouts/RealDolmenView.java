package be.david.layouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by David on 13/10/2016.
 */

public class RealDolmenView extends View {

    private int squareColor;
    private int labelColor;
    private String squareText;

    private Paint squarePaint;

    public RealDolmenView(Context context, AttributeSet attrs) {
        super(context, attrs);

        squarePaint = new Paint();

        TypedArray a =context.getTheme().obtainStyledAttributes(attrs, R.styleable.RealdolmenView, 0 , 0);

        squareColor = a.getInt(R.styleable.RealdolmenView_squareColor, 0);
        squareText = a.getString(R.styleable.RealdolmenView_squareLabel);
        labelColor = a.getInt(R.styleable.RealdolmenView_LabelColor, 0);

        a.recycle();

    }
}

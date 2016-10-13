package be.david.layouts;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        squarePaint.setStyle(Paint.Style.FILL);
        squarePaint.setAntiAlias(true);

        squarePaint.setColor(squareColor);

        canvas.drawRect(0,0, this.getMeasuredWidth(),this.getMeasuredHeight(), squarePaint);

        squarePaint.setColor(labelColor);

        squarePaint.setTextAlign(Paint.Align.CENTER);

        squarePaint.setTextSize(50);

        canvas.drawText(squareText,this.getMeasuredWidth()/2, this.getMeasuredHeight()/2,squarePaint);


    }

    public int getSquareColor() {
        return squareColor;
    }

    public void setSquareColor(int newColor) {



        this.squareColor = newColor;

        invalidate();
        requestLayout();

    }

    public int getLabelColor() {
        return labelColor;
    }

    public void setLabelColor(int newColor) {
        this.labelColor = newColor;

        invalidate();
        requestLayout();
    }

    public String getSquareText() {
        return squareText;
    }

    public void setSquareText(String newText) {
        this.squareText = newText;

        invalidate();
        requestLayout();
    }

    public Paint getSquarePaint() {
        return squarePaint;
    }

    public void setSquarePaint(Paint squarePaint) {
        this.squarePaint = squarePaint;
    }
}

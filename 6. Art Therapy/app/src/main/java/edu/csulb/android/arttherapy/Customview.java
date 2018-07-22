package edu.csulb.android.arttherapy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Niyati on 3/17/2017.
 */

public class Customview extends View {

    private Paint paint = new Paint();
    protected Path path = new Path();
    public Customview(Context context) {
        super(context);
        init(null,0);
    }

    public Customview(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs,0);
    }

    public Customview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs,defStyleAttr);
    }

    public void init(AttributeSet attributeSet, int defStyleAttr)

    {

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10f);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        canvas.drawPath(path,paint);

    }

    @Override

    public boolean onTouchEvent(MotionEvent event)
    {
        float x = event.getX();
        float y = event.getY();

        switch(event.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(x, y);
                break;
            case MotionEvent.ACTION_UP:
                break;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(x,y);
                break;



        }
        invalidate();
        return true;
    }

    public void clearCanvas() {
       path.reset();
        invalidate();
    }



}

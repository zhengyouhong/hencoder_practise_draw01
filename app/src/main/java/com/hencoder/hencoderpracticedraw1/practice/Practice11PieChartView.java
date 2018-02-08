package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private int mCX;
    private int mCy;

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setColor(Color.RED);
        RectF rect = new RectF(100, 0, 400, 300);
        canvas.drawArc(rect, 180, 150, true, paint);

        paint.setColor(Color.YELLOW);
        rect = new RectF(110, 10, 410, 310);
        canvas.drawArc(rect, 330, 45,true, paint);

        paint.setColor(Color.DKGRAY);
        canvas.drawArc(rect, 17, 13, true, paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(rect, 33, 7, true, paint);

        paint.setColor(Color.BLACK);
        canvas.drawArc(rect, 42, 40, true, paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(rect, 85, 93, true, paint);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mCX = 400;
        mCy = 400;
    }
}

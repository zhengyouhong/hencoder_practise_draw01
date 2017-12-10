package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.Utils;

public class Practice10HistogramView extends View {

    private Paint mPaint;

    public Practice10HistogramView(Context context) {
        this(context, null);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setStrokeWidth(Utils.dp2px(1, getContext()));

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        //(120, 200  )
        Path path = new Path();

        mPaint.setColor(Color.GREEN);
        RectF rectF = new RectF(110, 390, 190, 400);
        path.addRect(rectF, Path.Direction.CCW);
        rectF = new RectF(210, 380, 290, 400);
        path.addRect(rectF, Path.Direction.CCW);
        rectF = new RectF(310, 320, 390, 400);
        path.addRect(rectF, Path.Direction.CCW);
        canvas.drawPath(path, mPaint);





        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.STROKE);
        path = new Path();
        path.moveTo(90, 10);
        path.lineTo(90, 400);
        path.lineTo(800, 400);
        canvas.drawPath(path,mPaint);

    }
}

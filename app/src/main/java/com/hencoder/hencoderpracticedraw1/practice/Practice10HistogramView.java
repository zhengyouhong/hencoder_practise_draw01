package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
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

        rectF = new RectF(410, 250, 490, 400);
        path.addRect(rectF, Path.Direction.CCW);


        rectF = new RectF(510, 100, 590, 400);
        path.addRect(rectF, Path.Direction.CCW);

        canvas.drawPath(path, mPaint);







        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.STROKE);
        path = new Path();
        path.moveTo(90, 10);
        path.lineTo(90, 400);
        path.lineTo(800, 400);
        canvas.drawPath(path,mPaint);

        mPaint.setTextSize(28);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(Utils.dp2px(0.4f, getContext()));

        String text1 = "Froyo";
        Rect rect = new Rect();
        mPaint.getTextBounds(text1, 0, text1.length(), rect);
        float x = 150 - rect.width() / 2;
        float y = 420 + rect.height() / 2;

        canvas.drawText(text1, 0, text1.length(), x, y, mPaint);


        text1 = "GB";
        rect = new Rect();
        mPaint.getTextBounds(text1, 0, text1.length(), rect);
        x = 250 - rect.width() / 2;
        y = 420 + rect.height() / 2;

        canvas.drawText(text1, 0, text1.length(), x, y, mPaint);


        text1 = "ICS";
        rect = new Rect();
        mPaint.getTextBounds(text1, 0, text1.length(), rect);
        x = 350 - rect.width() / 2;
        y = 420 + rect.height() / 2;

        canvas.drawText(text1, 0, text1.length(), x, y, mPaint);


        text1 = "JB";
        rect = new Rect();
        mPaint.getTextBounds(text1, 0, text1.length(), rect);
        x = 450 - rect.width() / 2;
        y = 420 + rect.height() / 2;

        canvas.drawText(text1, 0, text1.length(), x, y, mPaint);


        text1 = "KitKat";
        rect = new Rect();
        mPaint.getTextBounds(text1, 0, text1.length(), rect);
        x = 550 - rect.width() / 2;
        y = 420 + rect.height() / 2;

        canvas.drawText(text1, 0, text1.length(), x, y, mPaint);


        int displayWidth = Utils.getDisplayWidth(getContext());

        mPaint.setTextSize(Utils.dp2px(30, getContext()));
        text1 = "直方图";
        rect = new Rect();
        mPaint.getTextBounds(text1, 0, text1.length(), rect);
        x = displayWidth / 2 - rect.width() / 2;
        y = 550 + rect.height() / 2;

        canvas.drawText(text1, 0, text1.length(), x, y, mPaint);


    }
}

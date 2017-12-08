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

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        // ( 450, 500)
        // (  550, 500)
        // ( , )
        // ( , )
        // ( , )
        // ( , )

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path.moveTo(450, 450);
        RectF rect = new RectF(400, 400, 500, 500);
        path.addArc(rect, 150, 210);

        path.moveTo(550, 450);
        RectF rectF = new RectF(500, 400, 600, 500);
        path.addArc(rectF, -190, 210);

        path.lineTo(500, 580);
        path.lineTo(408 ,475);
        path.lineTo(500, 450);
        path.close();
        canvas.drawPath(path, paint);
    }
}

package com.kiloway.mylibrary;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @ClassName: MyCircle
 * @Description: java类作用描述
 * @Author: 何鑫
 * @CreateDate: 2021/6/17 10:03
 * @UpdateUser: 更新者
 * @UpdateDate: 2021/6/17 10:03
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyCircle extends View {

    public MyCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint  paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);//画笔属性是实心圆
        //paint.setStyle(Paint.Style.STROKE);//画笔属性是空心圆
        paint.setStrokeWidth(8);//设置画笔粗细
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, 200, paint);
    }
}

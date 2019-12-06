package com.hjs.ex_1206;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    //View를 상속받은 클래스는 onDraw()를 오버라이딩 필수!!
    @Override
    protected void onDraw(Canvas canvas) {
        // 그림을 그릴수 있도록 해 주는 메서드 onDraw()

        // 그림을 그리기 위한 필요한 붓과 같은 객체 (Paint)
        Paint paint = new Paint();

        //붓에 색상 적용
        paint.setColor(Color.argb(255,0,84,255));

        //붓의 두께
        paint.setStrokeWidth(20);

        //캔버스에 그림을 그린다.
        //사각형
        canvas.drawRect(100, 200, 300, 400, paint);

        paint.setColor(Color.RED);
        canvas.drawRect(300, 200, 500, 400, paint);

        //캔버스에 원 그리기
        canvas.drawCircle(200,600,100, paint);

        //여러가지 그리기 명령을 모아뒀다가 한번에 그려주기 위한 클래스
        Path path = new Path();
        path.moveTo(400,600); // 그림그리기를 시작할 좌표
        path.lineTo(320, 800);
        path.lineTo(600,800);
        canvas.drawPath(path, paint);

        paint.setColor(Color.argb(255,61,138,204));
        paint.setStyle(Paint.Style.STROKE);


        canvas.drawRect(700,700, 900,900,paint);

        Path path2 = new Path();
        path2.moveTo(500,400);
        path2.lineTo(300,700);
        path2.lineTo(700,1000);

        canvas.drawPath(path2,paint);

    }
}

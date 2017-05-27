package evan.chen.app.canvassample;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    public enum CanvasType{
        DrawArc, DrawCircle, DrawOval, DrawLine, DrawPoint, DrawRect, DrawRoundRect, DrawPath
    }

    private CanvasType canvasType;
    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        this.canvasType = (CanvasType) getIntent().getSerializableExtra("CanvasType");

        ImageView imageView=(ImageView) findViewById(R.id.imageView);
        this.bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
        imageView.setBackgroundColor(Color.LTGRAY);

        switch (this.canvasType ){
            case DrawArc:
                this.drawArc();
                this.setTitle("DrawArc");
                    break;
            case DrawCircle:
                this.drawCircle();
                this.setTitle("DrawCircle");
                break;
            case DrawOval:
                this.drawOval();
                this.setTitle("DrawOval");
                break;
            case DrawLine:
                this.drawLine();
                this.setTitle("DrawLine");
                break;
            case DrawPoint:
                this.drawPoints();
                this.setTitle("DrawPoints");
                break;
            case DrawRect:
                this.drawRect();
                this.setTitle("DrawRect");
                break;
            case DrawRoundRect:
                this.drawRoundRect();
                this.setTitle("DrawRoundRect");
                break;
            case DrawPath:
                this.drawPath();
                this.setTitle("DrawPath");
                break;

        }

        imageView.setImageBitmap(bitmap);

    }

    private void drawCircle(){
        Paint p = new Paint();
        p.setStrokeWidth(3);
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.STROKE);

        Canvas canvas = new Canvas(bitmap);
        canvas.drawCircle(240, 240, 150, p);
    }

    private void drawOval(){
        Paint p = new Paint();
        p.setStrokeWidth(10);
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.STROKE);

        Canvas canvas = new Canvas(bitmap);

        RectF oval=new RectF();
        oval.left=100;
        oval.top=100;
        oval.right=400;
        oval.bottom=300;
        canvas.drawOval(oval, p);
    }

    private void drawLine(){
        Paint p = new Paint();
        p.setStrokeWidth(10);
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.STROKE);

        Canvas canvas = new Canvas(bitmap);

        canvas.drawLine(60, 40, 200, 400, p);
    }

    private void drawPoints(){

        Paint p = new Paint();
        p.setStrokeWidth(20);
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.STROKE);

        Canvas canvas = new Canvas(bitmap);

        canvas.drawPoint(60, 390, p);
        canvas.drawPoints(new float[]{60,300,100,300,200,300}, p);
    }

    private void drawRoundRect(){
        Paint p = new Paint();
        p.setStrokeWidth(2);
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.FILL);
        p.setAntiAlias(true);

        Canvas canvas = new Canvas(bitmap);

        RectF rect = new RectF(100, 50, 300, 500);
        canvas.drawRoundRect(rect, 20, 20, p);
    }

    private void drawRect(){
        Paint p = new Paint();
        p.setStrokeWidth(2);
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.STROKE);

        Canvas canvas = new Canvas(bitmap);

        RectF rect = new RectF(100,100,400,400);
        canvas.drawRect(rect, p);
    }

    private void drawPath(){

        Paint p = new Paint();
        p.setStrokeWidth(5);
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.STROKE);

        Canvas canvas = new Canvas(bitmap);

        Path path =new Path();
        path.moveTo(200, 200);
        path.lineTo(400, 200);
        path.lineTo(400, 400);
        path.close();
        canvas.drawPath(path, p);
    }

    private void drawArc(){
        Paint p = new Paint();
        p.setStrokeWidth(2);
        p.setColor(Color.RED);
        p.setStyle(Paint.Style.STROKE);

        Canvas canvas = new Canvas(bitmap);

        RectF oval1=new RectF(100, 100,400,400);
        canvas.drawArc(oval1, 30, 300, true, p);
    }
}

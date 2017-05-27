package evan.chen.app.canvassample;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void drawArc(View view){
        Intent intent = new Intent(MainActivity.this, ImageActivity.class);
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawArc);
        startActivity(intent);
    }

    public void drawCircle(View view){
        Intent intent = new Intent(MainActivity.this, ImageActivity.class);
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawCircle);
        startActivity(intent);
    }

    public void drawLine(View view){
        Intent intent = new Intent(MainActivity.this, ImageActivity.class);
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawLine);
        startActivity(intent);
    }

    public void drawOval(View view){
        Intent intent = new Intent(MainActivity.this, ImageActivity.class);
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawOval);
        startActivity(intent);
    }

    public void drawPath(View view){
        Intent intent = new Intent(MainActivity.this, ImageActivity.class);
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawPath);
        startActivity(intent);
    }

    public void drawPoint(View view){
        Intent intent = new Intent(MainActivity.this, ImageActivity.class);
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawPoint);
        startActivity(intent);
    }

    public void drawRect(View view){
        Intent intent = new Intent(MainActivity.this, ImageActivity.class);
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawRect);
        startActivity(intent);
    }

    public void drawRoundRect(View view){
        Intent intent = new Intent(MainActivity.this, ImageActivity.class);
        intent.putExtra("CanvasType", ImageActivity.CanvasType.DrawRoundRect);
        startActivity(intent);
    }

}

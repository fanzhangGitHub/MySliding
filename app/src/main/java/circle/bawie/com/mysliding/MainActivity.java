package circle.bawie.com.mysliding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SlidingMenu menu = new SlidingMenu(this);
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.setBehindOffset(200);
        menu.setFadeDegree(1);
        TextView view = (TextView) findViewById(R.id.textView);
        menu.attachToActivity(this,SlidingMenu.SLIDING_CONTENT);
        View  view1 = View.inflate(this,R.layout.layout_sliding,null);
        menu.setMenu(view1);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menu.showMenu(true);

            }
        });
        Log.d("32312132321","dsaffdsfsad");
    }
}

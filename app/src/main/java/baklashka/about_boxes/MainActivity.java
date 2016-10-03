package baklashka.about_boxes;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    public Animation animlogo;
    public ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//поставил горизантольно
        setContentView(R.layout.main_menu_layout);

        TextView tv = (TextView) findViewById(R.id.version);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/custom.ttf");
        tv.setTypeface(tf);

        logo = (ImageView) findViewById(R.id.logo);
        animlogo = AnimationUtils.loadAnimation(this, R.anim.anim_logo);
        logo.startAnimation(animlogo);
    }
}



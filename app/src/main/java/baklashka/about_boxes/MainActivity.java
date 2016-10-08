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

    public Animation anim;
    public ImageView logo;
    public ImageView play;
    public ImageView achivments;
    public ImageView settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//поставил горизантольно
        setContentView(R.layout.main_menu_layout);

        TextView tv = (TextView) findViewById(R.id.version);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/custom.ttf");
        tv.setTypeface(tf);

        logo = (ImageView) findViewById(R.id.logo);
        play = (ImageView) findViewById(R.id.play);
        achivments = (ImageView) findViewById(R.id.achivments);
        settings = (ImageView) findViewById(R.id.settings);

        anim = AnimationUtils.loadAnimation(this, R.anim.anim_logo);
        logo.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.anim_menu);

        for (int i = 1; i <= 3; i++) {
            if (i == 1)
                play.startAnimation(anim);
            else if (i == 2)
                achivments.startAnimation(anim);
            else if (i == 3)
                settings.startAnimation(anim);

        }
    }
}



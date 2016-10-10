package baklashka.about_boxes;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    public Animation anim;
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

        anim = AnimationUtils.loadAnimation(this, R.anim.anim_logo);
        logo.startAnimation(anim);

        final ImageButton play = (ImageButton) findViewById(R.id.play);
        final ImageButton achivments = (ImageButton) findViewById(R.id.achivments);
        final ImageButton settings = (ImageButton) findViewById(R.id.settings);
        final Animation anim = AnimationUtils.loadAnimation(this, R.anim.anim_menu);
        //Создаём то, через что можно обращаться к UI (поток экрана)
        final Handler mainHandler = new Handler()
        {
            //То что будет происходить при посылании сюда чего-нить
            public void handleMessage(android.os.Message msg)
            {
                switch (msg.what)//извлекаем из msg i (Я НЕ ЗНАЮ КАК)
                {
                    case 0:
                        play.startAnimation(anim);
                        play.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        achivments.startAnimation(anim);
                        achivments.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        settings.startAnimation(anim);
                        settings.setVisibility(View.VISIBLE);
                        break;

                }
            }
        };

        Thread t = new Thread(new Runnable()//Создаём поток, который по очереди посылает команду хендлеру
        {
            public void run() {
                for (int i = 0; i < 3; i++)
                {
                    mainHandler.sendEmptyMessage(i);
                    try{
                        Thread.sleep(400);
                    }catch(InterruptedException e){}
                }
            }
        });
        t.start();

    }
}




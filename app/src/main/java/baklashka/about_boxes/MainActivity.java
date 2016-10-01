package baklashka.about_boxes;

//import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//поставил горизантольно
        setContentView(R.layout.main_menu_layout);

        //Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/custom_font.ttf");
        //TextView tv = (TextView) findViewById(R.id.textView);
        //tv.setTypeface(tf);

    }
}

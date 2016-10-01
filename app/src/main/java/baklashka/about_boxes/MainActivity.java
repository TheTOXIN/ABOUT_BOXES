package baklashka.about_boxes;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//поставил горизантольно
        setContentView(R.layout.main_menu_layout);
    }
}

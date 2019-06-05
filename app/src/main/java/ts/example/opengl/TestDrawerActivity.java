package ts.example.opengl;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import com.genericdrawerLayout.FingerType;
import com.genericdrawerLayout.GenericDrawerLayout;

/**
 * Created by chengli on 19-6-5.
 */

public class TestDrawerActivity extends Activity {
    private GenericDrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mDrawerLayout = findViewById(R.id.genericdrawerlayout);
        mDrawerLayout.setContentLayout(View.inflate(this, R.layout.layout_content, null));
        mDrawerLayout.setDrawerGravity(Gravity.TOP);
        float v = getResources().getDisplayMetrics().density * 100 + 0.5f; // 100DIP
        mDrawerLayout.setDrawerEmptySize((int) v);
        mDrawerLayout.setFingerType(FingerType.FINGER_TRIPLE);
    }
}

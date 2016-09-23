package tw.com.pcschool.t092302;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] fruits = {"蘋果", "香蕉", "鳳梨", "芒果", "AAA", "BBB", "CCC", "DDD", "EEE"};
    String[] prices = {"50", "30", "100", "70", "70", "70","70", "70", "90"};
    int[] imgs = {R.drawable.apple, R.drawable.banana, R.drawable.pineapple, R.drawable.mango, R.drawable.banana, R.drawable.pineapple, R.drawable.mango, R.drawable.pineapple, R.drawable.mango};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(MainActivity.this, fruits, prices, imgs);

        lv.setAdapter(adapter);

    }
}

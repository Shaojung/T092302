package tw.com.pcschool.t092302;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] fruits = {"蘋果", "香蕉", "鳳梨", "芒果", "AAA", "BBB", "CCC", "DDD", "EEE"};
    String[] prices = {"50", "30", "100", "70", "70", "70","70", "70", "90"};
    int[] imgs = {R.drawable.apple, R.drawable.banana, R.drawable.pineapple, R.drawable.mango, R.drawable.banana, R.drawable.pineapple, R.drawable.mango, R.drawable.pineapple, R.drawable.mango};
    boolean bchk[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bchk = new boolean[9];
        ListView lv = (ListView) findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter(MainActivity.this, fruits, prices, imgs, bchk);

        lv.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Show");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String str = "";
        for (int i=0;i<fruits.length;i++)
        {
                if (bchk[i])
                {
                    str = str + "," + fruits[i];
                }
        }
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}

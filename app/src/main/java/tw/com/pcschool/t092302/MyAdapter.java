package tw.com.pcschool.t092302;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by student on 2016/9/23.
 */
public class MyAdapter extends BaseAdapter {
    String[] fruits;
    Context context;
    public MyAdapter(Context c, String[] fruits)
    {
        this.fruits = fruits;
        context = c;
    }
    @Override
    public int getCount() {
        return fruits.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((AppCompatActivity) context).getLayoutInflater();
        View v = inflater.inflate(R.layout.myitem, null);
        TextView tv = (TextView) v.findViewById(R.id.textView);
        tv.setText(fruits[position]);

        return v;
    }
}

package tw.com.pcschool.t092302;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by student on 2016/9/23.
 */
public class MyAdapter extends BaseAdapter {
    String[] fruits;
    String[] prices;
    int[] imgs;
    Context context;
    LayoutInflater inflater;
    public MyAdapter(Context c, String[] fruits, String[] p, int[] i)
    {
        this.fruits = fruits;
        this.prices = p;
        this.imgs = i;
        context = c;
        inflater = ((AppCompatActivity) context).getLayoutInflater();
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
        ViewHolder holder;
        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.myitem, null);
            holder = new ViewHolder();
            holder.tv = (TextView) convertView.findViewById(R.id.textView);
            holder.tv2 = (TextView) convertView.findViewById(R.id.textView2);
            holder.img = (ImageView) convertView.findViewById(R.id.imageView);
            holder.chk = (CheckBox) convertView.findViewById(R.id.checkBox);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }


        holder.tv.setText(fruits[position]);
        holder.tv2.setText(prices[position]);
        holder.img.setImageResource(imgs[position]);


        return convertView;
    }
    static class ViewHolder
    {
        TextView tv;
        TextView tv2;
        ImageView img;
        CheckBox chk;
    }
}

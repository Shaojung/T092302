package tw.com.pcschool.t092302;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ButtonBarLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by student on 2016/9/23.
 */
public class MyAdapter extends BaseAdapter {
    String[] fruits;
    String[] prices;
    int[] imgs;
    boolean[] bchk;
    Context context;
    LayoutInflater inflater;
    public MyAdapter(Context c, String[] fruits, String[] p, int[] i, boolean b[])
    {
        this.fruits = fruits;
        this.prices = p;
        this.imgs = i;
        bchk = b;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null)
        {
            convertView = inflater.inflate(R.layout.myitem, null);
            holder = new ViewHolder();
            holder.tv = (TextView) convertView.findViewById(R.id.textView);
            holder.tv2 = (TextView) convertView.findViewById(R.id.textView2);
            holder.img = (ImageView) convertView.findViewById(R.id.imageView);
            holder.chk = (CheckBox) convertView.findViewById(R.id.checkBox);
            holder.btn = (Button) convertView.findViewById(R.id.button);
            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                bchk[position] = isChecked;
            }
        });
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "MSG:" + fruits[position], Toast.LENGTH_SHORT).show();
            }
        });
        holder.tv.setText(fruits[position]);
        holder.tv2.setText(prices[position]);
        holder.img.setImageResource(imgs[position]);
        holder.chk.setChecked(bchk[position]);

        return convertView;
    }
    static class ViewHolder
    {
        TextView tv;
        TextView tv2;
        ImageView img;
        CheckBox chk;
        Button btn;
    }
}

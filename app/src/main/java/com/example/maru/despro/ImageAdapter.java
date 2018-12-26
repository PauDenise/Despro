package com.example.maru.despro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    private final int[] Imageid;
    private final String[] web;
    public ImageAdapter(Context c,String[] web,int[] Imageid )
    {
        mContext = c;
        this.Imageid = Imageid;
        this.web=web;
    }
    @Override
    public int getCount() {
        return Imageid.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if (convertView == null)
        {
            gridView = new View(mContext);
            // get layout from mobile.xml
            gridView = inflater.inflate(R.layout.imageview, null);
            // set value into textview
            TextView textView = (TextView)
                    gridView.findViewById(R.id.TVplacename);
            textView.setText(web[position]);
            // set image based on selected text
            ImageView imageView = (ImageView)
                    gridView.findViewById(R.id.IVplace);
            imageView.setImageResource(Imageid[position]);
        }
        else
        {
            gridView = (View) convertView;
        }
        return gridView;
    }
}

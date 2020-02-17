package com.dino.socar.src.mid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

import com.dino.socar.R;

public class Mid_Adapter extends PagerAdapter {

    private int[] images = {R.drawable.mid_01, R.drawable.mid_02, R.drawable.mid_03};
    private LayoutInflater inflater;
    private Context context;

    public Mid_Adapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem (ViewGroup container, int position){
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view =inflater.inflate(R.layout.slider, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.slider_imageView);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText((position + 1) + "번째 이미지 입니다.");
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.invalidate();
    }
}

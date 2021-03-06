package com.yeyu.zhihuinanchang.base.Tag_pager;

import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.yeyu.zhihuinanchang.base.Basepager;

/**
 * 主页面的五个标签之一
 * 政务
 * Created by gaoyehua on 2016/8/9.
 */
public class GovAffairsPager extends Basepager {

    public GovAffairsPager(Activity activity) {
        super(activity);
    }

    @Override
    public void initData() {
        Log.i("data","政务初始化。。");

        //给帧布局添加布局对象
        TextView view =new TextView(mActivity);
        view.setText("政务");
        view.setTextColor(Color.RED);
        view.setTextSize(25);
        view.setGravity(Gravity.CENTER);


        fl_comtent.addView(view);
        //修改页面的标题
        tv_title.setText("人口管理");
        //菜单按钮
        ib_menu.setVisibility(View.VISIBLE);
    }
}

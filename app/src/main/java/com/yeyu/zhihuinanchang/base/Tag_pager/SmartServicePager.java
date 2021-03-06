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
 * 智慧南昌
 * Created by gaoyehua on 2016/8/9.
 */
public class SmartServicePager extends Basepager {

    public SmartServicePager(Activity activity) {
        super(activity);
    }

    @Override
    public void initData() {
        Log.i("data","智慧服务初始化。。");

        //给帧布局添加布局对象
        TextView view =new TextView(mActivity);
        view.setText("智慧服务");
        view.setTextColor(Color.RED);
        view.setTextSize(25);
        view.setGravity(Gravity.CENTER);


        fl_comtent.addView(view);
        //修改页面的标题
        tv_title.setText("生活");
        //菜单按钮
        ib_menu.setVisibility(View.VISIBLE);
    }
}

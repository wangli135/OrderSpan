package com.xks.orderspan;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.widget.TextView;

/**
 * 演示OrderSpan用于段落的效果
 */
public class MainActivity extends AppCompatActivity {

    private TextView mParagraph1;
    private TextView mParagraph2;

    private String paragraph = "中新网\t北京9月10日电 今天，" +
            "连通东西部多条铁路干线的郑徐高铁将正式通车运营，" +
            "中国高铁网络再次得到完善，东中西部民众的高铁出行也" +
            "更加便利。与此同时，今天开始，受郑徐高铁开通影响，" +
            "全国铁路再次迎来一次运行图大调整。";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mParagraph1 = (TextView) findViewById(R.id.paragraph_1);
        mParagraph2 = (TextView) findViewById(R.id.paragraph_2);


        //默认实现，序号为1，颜色和尺寸都和文本内容一致
        OrderSpan orderSpan1 = new OrderSpan();
        SpannableString spannableString = new SpannableString(paragraph);
        spannableString.setSpan(orderSpan1, 0, paragraph.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        mParagraph1.setText(spannableString);

        OrderSpan orderSpan2 = new OrderSpan(2, Color.RED, 40);
        spannableString.removeSpan(orderSpan1);//移除OrderSpan1
        spannableString.setSpan(orderSpan2, 0, paragraph.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);//添加OrderSpan2
        mParagraph2.setText(spannableString);

    }
}

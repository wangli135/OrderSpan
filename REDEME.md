OrderSpan用于设置Android的文本有序段落，仿照BulletSpan(无序段落)的实现。
功能演示如下图：
![OrderSpan效果图](http://img.blog.csdn.net/20160911142803656)
使用方法可以将src/com/xks/orderspan/OrderSpan拷贝进应用，使用代码如下：  
```
  OrderSpan orderSpan2 = new OrderSpan(2, Color.RED, 40);
        spannableString.removeSpan(orderSpan1);//移除OrderSpan1
        spannableString.setSpan(orderSpan2, 0, paragraph.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);//添加OrderSpan2
        mParagraph2.setText(spannableString);
```
OrderSpan的第一个参数表示序号，第二个参数表示序号的颜色，第三个参数表示序号与正文的距离；如果使用无参的OrderSpan，那么参数为1，颜色为黑色。

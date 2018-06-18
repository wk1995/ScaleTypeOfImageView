# ScaleTypeOfImageView
关于ImageView的ScaleType属性


摘自https://blog.csdn.net/lsw305264677/article/details/52175084

scaleType的属性有matrix（默认）、center、centerCrop、centerInside、fitCenter、fitEnd、fitStart、fitXY。

#### android:scaleType="matrix"

不改变原图的大小，从ImageView的左上角开始绘制原图，原图超过ImageView的部分作裁剪处理。该属性使用代码来实现的时候应当注意一点
iv.scaleType= ImageView.ScaleType.MATRIX

iv.imageMatrix= Matrix()

其他的只需直接设置scaleType即可

#### android:scaleType="center"

保持原图的大小，显示在ImageView的中心。当原图的size大于ImageView的size，超过部分裁剪处理。

#### android:scaleType="centerCrop"

以填满整个ImageView为目的，将原图的中心对准ImageView的中心，等比例放大原图，直到填满ImageView为止（指的是ImageView的宽和高都要填满），原图超过ImageView的部分作裁剪处理。

#### android:scaleType="centerInside"

以原图完全显示为目的，将图片的内容完整居中显示，通过按比例缩小原图的size宽(高)等于或小于ImageView的宽(高)。如果原图的size本身就小于ImageView的size，则原图的size不作任何处理，居中显示在ImageView。

#### android:scaleType="fitCenter"

把原图按比例扩大或缩小到ImageView的ImageView的高度，居中显示

#### android:scaleType="fitEnd"

把原图按比例扩大(缩小)到ImageView的高度，显示在ImageView的下部分位置

#### android:scaleType="fitStart"

把原图按比例扩大(缩小)到ImageView的高度，显示在ImageView的上部分位置

#### android:scaleType="fitXY"

把原图按照指定的大小在View中显示，拉伸显示图片，不保持原比例，填满ImageView.

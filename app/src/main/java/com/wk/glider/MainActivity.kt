package com.wk.glider

import android.graphics.Matrix
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import com.bumptech.glide.Glide



class MainActivity : AppCompatActivity(), View.OnClickListener,RadioGroup.OnCheckedChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener(this)
        rg.setOnCheckedChangeListener(this)
        iv.scaleType= ImageView.ScaleType.MATRIX
    }

    override fun onClick(v: View?) {
        when (v!!) {
            btn -> {
                var url = "http://cn.bing.com/az/hprichbg/rb/Dongdaemun_ZH-CN10736487148_1920x1080.jpg"
//                 url = "http://p1.pstatp.com/large/166200019850062839d3"
                Glide.with(this)
                        .load(url)
                        .placeholder(R.mipmap.ic_launcher)
                        .into(iv)
            }
        }
    }

    override fun onCheckedChanged(group: RadioGroup?, checkedId: Int) {
        Toast.makeText(this,checkedId.toString(),Toast.LENGTH_SHORT).show()
        when(checkedId){
            R.id.rbMatrix->{
                iv.scaleType= ImageView.ScaleType.MATRIX
                iv.imageMatrix= Matrix()
            }
            R.id.rbCenter->iv.scaleType=ImageView.ScaleType.CENTER
            R.id.rbCenterCrop->iv.scaleType=ImageView.ScaleType.CENTER_CROP
            R.id.rbCenterInside->iv.scaleType=ImageView.ScaleType.CENTER_INSIDE
            R.id.rbFitXY->iv.scaleType=ImageView.ScaleType.FIT_XY
            R.id.rbFitStart->iv.scaleType=ImageView.ScaleType.FIT_START
            R.id.rbFitCenter->iv.scaleType=ImageView.ScaleType.FIT_CENTER
            R.id.rbFitEnd->iv.scaleType=ImageView.ScaleType.FIT_END
        }
    }
}

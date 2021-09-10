package com.curso_android.cursokotlinespaol

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView

class AspectRatioInitView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr){

    var ratio: Float = 1f
    
    init {
        val a = context.obtainStyledAttributes(attrs, R.styleable.AspectRatioInitView)
        ratio = a.getFloat(R.styleable.AspectRatioInitView_ratio,1f)
        a.recycle()
    }
    
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        /*Da información respecto al tamaño final de esta Custom View*/
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        var width = measuredWidth
        var heigth = measuredHeight

        if (width == 0 && heigth == 0){
            return
        }

        if (width > 0  ){
            heigth = (width * ratio).toInt()
        } else if (heigth > 0){
            width = (height/ratio).toInt()
        }

        setMeasuredDimension(width, heigth)
    }
}
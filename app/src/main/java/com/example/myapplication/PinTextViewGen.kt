package com.example.myapplication

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import com.google.android.material.shape.ShapeAppearanceModel

class PinTextViewGen @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var pinTextView1: PinTextView
    private var pinTextView2: PinTextView
    private var pinTextView3: PinTextView
    private var pinTextView4: PinTextView
    var listOfpin: List<PinTextView>

    init {
        val view = inflate(context, R.layout.pin_text_view, this)
        pinTextView1 = view.findViewById(R.id.pinTextView_1)
        pinTextView2 = view.findViewById(R.id.pinTextView_2)
        pinTextView3 = view.findViewById(R.id.pinTextView_3)
        pinTextView4 = view.findViewById(R.id.pinTextView_4)
        listOfpin = listOf(pinTextView1, pinTextView2, pinTextView3, pinTextView4)
    }

    fun append(number: Int) {
        for (pin in listOfpin) {
            if (pin.text == "") {
                pin.text = number.toString()
                pin.background = ContextCompat.getDrawable(context, R.drawable.button_shape_default)
                pin.setTextColor(ContextCompat.getColor(context, R.color.blue))
                break
            }
        }
        for (pin in listOfpin) {
            if (pin.text != "") {
                pin.background = ContextCompat.getDrawable(context, R.drawable.button_shape_default)
                pin.setTextColor(ContextCompat.getColor(context, R.color.blue))
            }
            else{
                pin.background = ContextCompat.getDrawable(context, R.drawable.botton_shape_blank)
                pin.setTextColor(ContextCompat.getColor(context, R.color.blue))
            }
        }
    }

    fun clear() {
        for (pin in listOfpin) {
            if (pin.text != "") {
                pin.background = ContextCompat.getDrawable(context, R.drawable.button_shape_default)
                pin.setTextColor(ContextCompat.getColor(context, R.color.blue))
            }
            else{
                pin.background = ContextCompat.getDrawable(context, R.drawable.botton_shape_blank)
                pin.setTextColor(ContextCompat.getColor(context, R.color.blue))
            }
        }
        for (pin in listOfpin.reversed()) {
            if (pin.text != "") {
                pin.text = ""
                pin.background = ContextCompat.getDrawable(context, R.drawable.botton_shape_blank)
                pin.setTextColor(ContextCompat.getColor(context, R.color.blue))
                break
            }
        }
    }

    fun checking() {
        for (pin in listOfpin) {
            if (listOf(
                    pinTextView1.text,
                    pinTextView2.text,
                    pinTextView3.text,
                    pinTextView4.text
                ) == listOf("1", "5", "6", "7")
            ) {
                pin.background =
                    ContextCompat.getDrawable(context, R.drawable.border_color_correct)
                pin.setTextColor(ContextCompat.getColor(context, R.color.green))
            } else {
                pin.background =
                    ContextCompat.getDrawable(context, R.drawable.border_color_uncorrect)
                pin.setTextColor(ContextCompat.getColor(context, R.color.red))
            }
        }
    }

    fun clearAll() {
        for (pin in listOfpin) {
            pin.background = ContextCompat.getDrawable(context, R.drawable.botton_shape_blank)
            pin.setTextColor(ContextCompat.getColor(context, R.color.blue))
            pin.text = ""
        }
    }
}

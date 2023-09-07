package com.bezrukov.tint

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.AttrRes
import androidx.appcompat.widget.AppCompatTextView

class CustomChip @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    @AttrRes defStyleAttr: Int = R.attr.testChipStyleAttr,
) : AppCompatTextView(context, attrs, defStyleAttr)
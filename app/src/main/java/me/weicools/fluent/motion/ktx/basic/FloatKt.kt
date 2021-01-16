package me.weicools.fluent.motion.ktx.basic

import android.content.res.Resources
import android.util.TypedValue

/**
 * @author weicools
 * @date 2020.07.25
 */


val Float.dp
  get() = TypedValue.applyDimension(
    TypedValue.COMPLEX_UNIT_DIP, this,
    Resources.getSystem().displayMetrics
  )
package me.weicools.fluent.motion.ktx.basic

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.util.TypedValue
import androidx.annotation.ColorInt
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.ContextCompat

/**
 * @author weicools
 * @date 2020.07.25
 */

val Int.dp
  get() = TypedValue.applyDimension(
    TypedValue.COMPLEX_UNIT_DIP, this.toFloat(),
    Resources.getSystem().displayMetrics
  ).toInt()

@ColorInt
fun @receiver:ColorRes Int.toColorInt(context: Context): Int {
  return ContextCompat.getColor(context, this)
}

fun @receiver:ColorRes Int.toColorStateList(context: Context): ColorStateList {
  return ColorStateList.valueOf(this.toColorInt(context))
}

fun @receiver:DrawableRes Int.toDrawable(context: Context): Drawable? {
  return AppCompatResources.getDrawable(context, this)
}

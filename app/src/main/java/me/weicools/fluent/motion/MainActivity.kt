package me.weicools.fluent.motion

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import me.weicools.fluent.motion.ktx.basic.toColorInt

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_motion)

    // val d = AppCompatResources.getDrawable(this, 0)
    // Log.d("MainActivity", "onCreate: d=$d")

    Log.d("MainActivity", "onCreate: t1=${R.color.colorAccent.toColorInt(this)}")
    Log.d("MainActivity", "onCreate: t2=${12.toColorInt(this)}")
  }
}
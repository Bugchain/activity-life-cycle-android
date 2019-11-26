package app.bugchain.activitylifecycledemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("MainActivity", "onCreate")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MainActivity", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "onDestroy")
    }
}

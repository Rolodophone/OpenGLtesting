package net.rolodophone.opengltesting

import android.opengl.GLSurfaceView
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var mGLSurfaceView: GLSurfaceView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mGLSurfaceView = GLSurfaceView(this)

//        //check if system supports OpenGL ES 2.0
//        val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
//        val configurationInfo = activityManager.getDeviceConfigurationInfo()
//        val supportsEs2 = configurationInfo.reqGlEsVersion >= 0x20000

//        if (supportsEs2){

            // Request an OpenGL ES 2.0 compatible context.
            mGLSurfaceView.setEGLContextClientVersion(2)

            // Set the renderer to our demo renderer, defined below.
            mGLSurfaceView.setRenderer(LessonOneRenderer())

//        } else {
//            // This is where you could create an OpenGL ES 1.x compatible
//            // renderer if you wanted to support both ES 1 and ES 2.
//            return
//        }

        setContentView(mGLSurfaceView)
    }

    override fun onResume() {
        // The activity must call the GL surface view's onResume() on activity onResume().
        super.onResume()
        mGLSurfaceView.onResume()
    }

    override fun onPause() {
        // The activity must call the GL surface view's onPause() on activity onPause().
        super.onPause()
        mGLSurfaceView.onPause()
    }
}

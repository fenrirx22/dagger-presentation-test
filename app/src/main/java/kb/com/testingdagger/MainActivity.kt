package kb.com.testingdagger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import kb.com.testingdagger.di.AppComponent
import javax.inject.Inject

//class MainActivity : AppCompatActivity() {
//
//    @Inject
//    lateinit var presenter: MainPresenter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        AndroidInjection.inject(this)
//        setContentView(R.layout.activity_main)
//    }
//
//    override fun onStart() {
//        super.onStart()
//        presenter.logError("HELLO WORLD")
//    }
//}


class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var presenter: MainPresenter

    @Inject
    lateinit var appComponent: AppComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        presenter.logError("HELLO WORLD")
        val view = CustomView(this.applicationContext)
        appComponent.inject(view)
        view.go()
    }
}

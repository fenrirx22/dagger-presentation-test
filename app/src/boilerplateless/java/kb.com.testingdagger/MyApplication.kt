package kb.com.testingdagger

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import kb.com.testingdagger.di.DaggerAppComponent

class MyApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out MyApplication> {
        return DaggerAppComponent.builder().create(this)
    }

}
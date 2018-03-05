package kb.com.testingdagger.di

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import kb.com.testingdagger.CustomView
import kb.com.testingdagger.MainActivity

@Module
abstract class ActivityBuilder {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivit(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>

}
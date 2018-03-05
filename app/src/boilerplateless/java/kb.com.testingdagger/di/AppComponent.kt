package kb.com.testingdagger.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import kb.com.testingdagger.CustomView
import kb.com.testingdagger.MyApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBuilder::class
])
interface AppComponent: AndroidInjector<MyApplication> {

    fun inject(view: CustomView)

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MyApplication>()
}
package kb.com.testingdagger.di

import android.app.Application
import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
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
interface AppComponent {

    fun inject(app: MyApplication)

    fun inject(customView: CustomView)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: MyApplication): Builder

        fun build(): AppComponent
    }
}
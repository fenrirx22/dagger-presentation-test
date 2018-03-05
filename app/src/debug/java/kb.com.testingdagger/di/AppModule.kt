package kb.com.testingdagger.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import kb.com.testingdagger.MyApplication
import javax.inject.Singleton

@Module(subcomponents = [
    MainActivityComponent::class
])
abstract class AppModule {

    @Binds
    @Singleton
     abstract fun provideContext(app: MyApplication) : Context

}
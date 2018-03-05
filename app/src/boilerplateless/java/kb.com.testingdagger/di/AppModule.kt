package kb.com.testingdagger.di

import android.content.Context
import dagger.Binds
import dagger.Module
import kb.com.testingdagger.MyApplication
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Binds
    @Singleton
     abstract fun provideContext(app: MyApplication) : Context

}
package kb.com.testingdagger.di

import dagger.Binds
import dagger.Module
import dagger.Provides
import kb.com.testingdagger.CustomLogger
import kb.com.testingdagger.MainPresenter
import kb.com.testingdagger.MainPresenterImpl


@Module
class MainActivityModule {

    @Provides
    fun provideMainPresenter(logger: CustomLogger): MainPresenter = MainPresenterImpl(logger)
}
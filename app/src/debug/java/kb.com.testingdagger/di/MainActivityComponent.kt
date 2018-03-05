package kb.com.testingdagger.di

import dagger.Subcomponent
import dagger.android.AndroidInjector
import kb.com.testingdagger.MainActivity

@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}

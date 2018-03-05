package kb.com.testingdagger

import android.util.Log
import java.util.logging.Level
import java.util.logging.Logger
import javax.inject.Inject
import javax.inject.Singleton

interface MainPresenter {
    fun logError(msg: String)
}

class MainPresenterImpl(private val logger: CustomLogger) : MainPresenter {

    override fun logError(msg: String) {
        logger.log(msg)
    }
}
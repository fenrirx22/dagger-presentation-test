package kb.com.testingdagger

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import dagger.android.AndroidInjection
import javax.inject.Inject

class CustomView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    @Inject
    lateinit var logger: CustomLogger

    fun go(){
        logger.log("go")
    }

}
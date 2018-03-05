package kb.com.testingdagger

import android.content.Context
import android.util.Log
import java.util.logging.Logger
import javax.inject.Inject


class CustomLogger @Inject constructor(private val ctx: Context){

    fun log(msg: String){
        Log.e(ctx.packageName, msg)
    }

}
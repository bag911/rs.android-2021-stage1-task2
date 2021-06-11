package subtask3

import kotlin.reflect.KClass
import kotlin.reflect.typeOf

class Blocks {


    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {

        if(blockB.isInstance(String())){
            return "x"
        }

        return "value"
    }
}

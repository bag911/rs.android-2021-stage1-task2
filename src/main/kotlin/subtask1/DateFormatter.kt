package subtask1

import java.lang.Exception
import java.time.LocalDate

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val date: LocalDate?
        try {
            date = LocalDate.of(year.toInt(),month.toInt(),day.toInt())
        } catch (e:Exception){
            return "Такого дня не существует"
        }
        var str = "${date.dayOfMonth} "

        str += when(date.month.value){
            1 -> "января, "
            2 -> "февраля, "
            3 -> "марта, "
            4 -> "апреля, "
            5 -> "мая, "
            6 -> "июня, "
            7 -> "июля, "
            8 -> "августа, "
            9 -> "сентября, "
            10 -> "октября, "
            11 -> "ноября, "
            12 -> "декабря, "
            else -> return "error"
        }
        str += when (date.dayOfWeek.value){
            1 -> "понедельник"
            2 -> "вторник"
            3 -> "среда"
            4 -> "четверг"
            5 -> "пятница"
            6 -> "суббота"
            7 -> "воскресенье"
            else -> return "error"
        }


//        when(calendar.get(Calendar.DAY_OF_WEEK)){
//            Calendar.SUNDAY -> return "sunday"
//        }
        return str
    }
}

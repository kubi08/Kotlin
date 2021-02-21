package com.kubilay.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var arrays: Any
    lateinit var hashMap: HashSet<Any>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //------------------------------------------------------------------------------------------
        //VARIABLES//
        var number: Int = 15 // variable
        val constNum: Double = 3.14 // constant
        var str: String = "Ozu"
        var boolean: Boolean = true
        boolean = false
        number++
        number = constNum.toInt() // number=3
        number-- // number=2
        println("2:" + number) //2:2
        --number //number=1
        println("1:" + number++) // 1:1
        ++number // number=3
        println("2:" + --number) // 2:2
        var char: Char = 'K'
        // boolean8,byte8,short16,int32,long64,float32,double64,char16,string32
        val typeConverterInt = constNum.toInt()
        println(typeConverterInt)
        val typeConverterDouble = number.toDouble()
        println(typeConverterDouble.toString() + number)
        println(str.compareTo("Kubi"))
        //------------------------------------------------------------------------------------------
        println(array(55, "kubi"))
        println(Class2().sumProcess(10, 5))
        println(Class2().whenSwitchCase())
        println(Class2().whileLoop(4))
        println(Class2().hashSet())
        print(Class2().hashMap())
        //ARRAYS//
    }

    fun array(arg: Any, arg2: String): Any {
        arrays = arrayOf("Kubi", "Ozu", 25, 27, "Artvin", "Malatya", 'E', 'K', true, false)
        var arg3 = arg

        for (i in arrays as Array<Any>) {

        }
        println((arrays as Array<Any>)[5])
        (arrays as Array<Any>).forEach {
            println(it)
        }
        return arg3
    }

    class Class2 {
        var constructor = Constructor()

        fun sumProcess(num: Int, num2: Int): Any {

            var sum: Int = 0
            constructor.age = 95
            println(constructor.setAd("Kubilay"))
            println(constructor.getAd().toString())
            println(constructor.age.toString())
            println(constructor.date.toString())

            if (num != null && num2 != null) {
                sum = num + num2
            } else {

            }
            return sum
        }

        fun whenSwitchCase() {
            var lessonNote: String = "Özgem"
            when (lessonNote) {
                "Özge" -> println("Tebrikler")
                else -> sumProcess(45, 88)
            }
        }

        fun whileLoop(i: Int) {
            var sumFactory: Int = 1
            var iFun = i

            while (iFun > 0) {
                sumFactory *= iFun
                iFun--
            }

            println(sumFactory)
        }

        fun hashSet() {
            var hashSet
            = hashSetOf("Gul", "Can", 45, true, true, 45, "Can")
            hashSet.add("Selçuk")
            hashSet.add(45)
            hashSet.forEach {
                println(it)
            }
        }

        fun hashMap(){
            var hashMap= hashMapOf<Any,Any>()
            hashMap.put(1,"kubi")
            hashMap.put("K",3)
            hashMap.put("U",5)
            hashMap.put("B",15)
            hashMap.size

            for (i in hashMap){
                println(i)
            }
        }


    }

}

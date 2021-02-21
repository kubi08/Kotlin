package com.kubilay.kotlinlearning
import java.util.*

class Constructor {
    private var ad: String? = null
    var age: Int? = null
    var date: String? = null

    constructor(ad: String="Constructor", age: Int=31, date: String="31/3*2033") {
        this.ad = ad
        this.age = age
        this.date = date
    }

    fun setAd(ad: String) { // set Variables
        this.ad = ad
    }

    fun getAd(): String? { //get Variables
        return this.ad
    }

}
package com.anushka.didemo

import android.util.Log
import javax.inject.Inject

class SIMCard @Inject constructor(private val serviceProvider: ServiceProvider) {
    // Field Injection
    init {
        Log.i("MYTAG","SIM Card Constructed")
    }


    // Method Injection

    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}
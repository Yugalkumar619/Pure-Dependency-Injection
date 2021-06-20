package com.anushka.didemo

import android.util.Log

class SIMCard() {
    // Field Injection
    private lateinit var serviceProvider: ServiceProvider
    init {
        Log.i("MYTAG","SIM Card Constructed")
    }


    // Method Injection
    fun setServiceProvider(serviceProvider: ServiceProvider){
       this.serviceProvider = serviceProvider
    }
    fun getConnection(){
        serviceProvider.getServiceProvider()
    }
}
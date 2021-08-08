package com.anushka.didemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Constructor Injection
//        val battery = Battery()
//        val memoryCard = MemoryCard()
//        val serviceProvider = ServiceProvider()
//        val simCard = SIMCard(serviceProvider)
//        val smartPhone = SmartPhone(battery,simCard,memoryCard)
//        smartPhone.makeACallWithRecording()

//        val smartPhone = SmartPhone(
//            Battery(),
//            SIMCard(ServiceProvider()),
//            MemoryCard()
//        )
//        smartPhone.makeACallWithRecording()

        DaggerSmartPhoneComponent.create()
            .getSmartPhone()
            .makeACallWithRecording()

    }
}

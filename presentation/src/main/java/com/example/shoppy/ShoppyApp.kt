package com.example.shoppy

import android.app.Application
import com.example.data.di.dataModule
import com.example.domain.di.domainModule
import com.example.shoppy.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class ShoppyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        //tell the koin to get all the module
        startKoin {
            //we need to declare android specific dependency for koin for this line
            androidContext(this@ShoppyApp)
            modules(
                listOf(
                    presentationModule,
                    dataModule,
                    domainModule

                ),

            )
        }
    }
}
package com.kbeslan.android.shoppinglist.presentation

import android.app.Application
import com.kbeslan.android.shoppinglist.di.DaggerApplicationComponent

class ShopApplication : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }

}
package com.kbeslan.android.shoppinglist.di

import android.app.Application
import com.kbeslan.android.shoppinglist.data.AppDatabase
import com.kbeslan.android.shoppinglist.data.ShopListDao
import com.kbeslan.android.shoppinglist.data.ShopListRepositoryImpl
import com.kbeslan.android.shoppinglist.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {
        @ApplicationScope
        @Provides
        fun provideShopListDao(application: Application): ShopListDao {
            return AppDatabase.getInstance(application).shopListDao()
        }
    }
}
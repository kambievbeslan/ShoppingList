package com.kbeslan.android.shoppinglist.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kbeslan.android.shoppinglist.data.ShopListRepositoryImpl
import com.kbeslan.android.shoppinglist.domain.DeleteShopItemUseCase
import com.kbeslan.android.shoppinglist.domain.EditShopItemUseCase
import com.kbeslan.android.shoppinglist.domain.GetShopListUseCase
import com.kbeslan.android.shoppinglist.domain.ShopItem

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}
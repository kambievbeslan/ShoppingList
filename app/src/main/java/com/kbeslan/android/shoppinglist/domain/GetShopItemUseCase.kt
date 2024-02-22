package com.kbeslan.android.shoppinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem = shopListRepository.getShopItem(shopItemId)

}
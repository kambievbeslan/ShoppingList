package com.kbeslan.android.shoppinglist.domain

import javax.inject.Inject

class GetShopItemUseCase @Inject constructor (private val shopListRepository: ShopListRepository) {

    suspend fun getShopItem(shopItemId: Int): ShopItem = shopListRepository.getShopItem(shopItemId)

}
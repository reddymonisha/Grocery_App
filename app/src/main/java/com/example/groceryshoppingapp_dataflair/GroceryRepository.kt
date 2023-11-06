package com.example.groceryshoppingapp_dataflair

import com.example.groceryshoppingapp_dataflair.GroceryDatabase
import com.example.groceryshoppingapp_dataflair.GroceryItems

class GroceryRepository(private val db: GroceryDatabase) {
    suspend fun insert(items: GroceryItems) = db.getGroceryDao().insert(items)
    suspend fun delete(items: GroceryItems) = db.getGroceryDao().delete(items)

    fun getAllItems() = db.getGroceryDao().getAllGroceryItems()
}
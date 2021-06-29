package com.post2shyam.updatedframework.application

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.post2shyam.updatedframework.application.storage.IPersistanceStore

class PersistanceStore : IPersistanceStore {

    private var sharedPreferences: SharedPreferences?

    constructor(context: Context) {
        sharedPreferences = context.getSharedPreferences("kk", MODE_PRIVATE)
    }

    override fun readInt(): Int {
        //If the value is not found return default 0. If the sharedpreference not found then also return 0
        return sharedPreferences?.getInt("FF", 0) ?: 0;
    }

    override fun writeInt(value: Int): Unit {
        with(sharedPreferences?.edit()) {
            this?.putInt("FF", value)
            this?.apply()
        }
    }
}
package com.post2shyam.updatedframework.application.storage

interface IPersistanceStore {
    fun readInt() : Int
    fun writeInt(value : Int) : Unit
}
package com.post2shyam.updatedframework.system

interface IPersistanceStore {
    fun readInt(): Int
    fun writeInt(value: Int): Unit
}
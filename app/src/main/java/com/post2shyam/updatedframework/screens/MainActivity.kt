package com.post2shyam.updatedframework.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.post2shyam.updatedframework.R
import com.post2shyam.updatedframework.system.storage.PersistanceStore
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var persistanceStore: PersistanceStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.d("Writing to persistence store")
        persistanceStore.writeInt(90)
    }
}
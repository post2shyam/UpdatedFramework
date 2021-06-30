package com.post2shyam.updatedframework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.post2shyam.updatedframework.application.PersistanceStore
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var persistanceStore: PersistanceStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        persistanceStore.writeInt(90)
    }
}
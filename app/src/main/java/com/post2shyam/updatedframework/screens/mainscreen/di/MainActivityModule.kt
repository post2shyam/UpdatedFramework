package com.post2shyam.updatedframework.screens.mainscreen.di

import com.post2shyam.updatedframework.screens.lifecycleobserver.ActivityLifeCycleObserver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
object MainActivityModule {
    @Provides
    fun provideActivityLifeCycleObserver(): ActivityLifeCycleObserver {
        return ActivityLifeCycleObserver()
    }
}

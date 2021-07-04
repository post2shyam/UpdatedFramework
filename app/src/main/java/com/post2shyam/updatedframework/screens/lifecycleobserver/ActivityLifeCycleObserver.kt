package com.post2shyam.updatedframework.screens.lifecycleobserver

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import timber.log.Timber

class ActivityLifeCycleObserver : DefaultLifecycleObserver {
    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        Timber.tag("ACTIVE")
        Timber.i(owner.javaClass.simpleName)
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        Timber.tag("INACTIVE")
        Timber.i(owner.javaClass.simpleName)
    }
}
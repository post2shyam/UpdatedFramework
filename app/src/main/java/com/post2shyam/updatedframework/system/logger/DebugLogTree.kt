package com.post2shyam.updatedframework.system.logger

import timber.log.Timber.DebugTree
import java.util.*

class DebugLogTree : DebugTree() {
    override fun createStackElementTag(element: StackTraceElement): String? {
        return String.format(
            Locale.US,
            "%s:%s:%s",
            element.fileName,
            element.lineNumber,
            Thread.currentThread().name
        )
    }
}

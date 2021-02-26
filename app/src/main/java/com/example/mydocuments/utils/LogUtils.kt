package com.example.mydocuments.utils

import timber.log.Timber

fun showLogWithTag(tag: String, log: String) {
    Timber.tag(tag).d(log)
}

fun showLog(log: String) {
    Timber.d(log)
}
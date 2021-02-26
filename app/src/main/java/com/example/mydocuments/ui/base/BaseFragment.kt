package com.example.mydocuments.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment(@LayoutRes val layoutId: Int) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onAfterCreatedView(view, savedInstanceState)

        initView()

        listenEvents()

        actions()
    }

    // Calls after create view
    abstract fun onAfterCreatedView(view: View, savedInstanceState: Bundle?)

    // Init UI contents after create UI
    abstract fun initView()

    // Listen live data or flows from viewmodel after create UI
    abstract fun listenEvents()

    // Click actions
    abstract fun actions()

}
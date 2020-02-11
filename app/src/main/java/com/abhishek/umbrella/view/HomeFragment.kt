package com.abhishek.umbrella.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.abhishek.umbrella.base.BaseFragment
import com.abhishek.umbrella.databinding.LayoutHomeBinding
import com.abhishek.umbrella.viewmodel.HomeViewModel

class HomeFragment : BaseFragment() {

    private val viewModel: HomeViewModel by viewModels { factory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return LayoutHomeBinding.inflate(inflater, container, false)
            .apply {
                viewModel = this@HomeFragment.viewModel
                lifecycleOwner = this@HomeFragment
            }
            .root
    }
}
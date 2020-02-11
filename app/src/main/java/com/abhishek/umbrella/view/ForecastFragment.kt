package com.abhishek.umbrella.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.abhishek.umbrella.base.BaseFragment
import com.abhishek.umbrella.databinding.LayoutWeeklyForecastBinding
import com.abhishek.umbrella.viewmodel.ForecastViewModel

class ForecastFragment : BaseFragment() {

    private val args: ForecastFragmentArgs by navArgs()
    private val viewModel: ForecastViewModel by viewModels { factory }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = LayoutWeeklyForecastBinding.inflate(inflater, container, false)
            .apply {
                lifecycleOwner = this@ForecastFragment
                // TODO pass this in constructor using viewmodel factory
                viewModel = this@ForecastFragment.viewModel.apply { city.value = args.city }
            }
        return binding.root
    }
}
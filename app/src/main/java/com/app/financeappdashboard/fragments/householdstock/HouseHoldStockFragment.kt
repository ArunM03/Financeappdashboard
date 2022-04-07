package com.app.financeappdashboard.fragments.householdstock

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.app.financeappdashboard.R
import com.app.financeappdashboard.databinding.FragmentDashbaordBinding

class HouseHoldStockFragment  : Fragment(R.layout.fragment_house_stock) {

    private lateinit var binding : FragmentDashbaordBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUI()

    }

    private fun setUI() {

    }

}
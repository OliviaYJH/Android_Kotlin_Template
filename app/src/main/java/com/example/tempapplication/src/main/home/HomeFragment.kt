package com.example.tempapplication.src.main.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tempapplication.R
import com.example.tempapplication.config.BaseFragment
import com.example.tempapplication.databinding.FragmentHomeBinding
import com.example.tempapplication.src.main.home.models.SignUpResponse
import com.example.tempapplication.src.main.home.models.UserResponse

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::bind, R.layout.fragment_home), HomeView {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ///
        binding.homeButtonTryGetJwt.setOnClickListener{
            showLoadingDialog(requireContext())
            HomeService(this).tryGetUsers()
        }
    }

    override fun onGetUserSuccess(response: UserResponse) {
        dismissLoadingDialog()
        for(User in response.result){
            Log.d("HomeFragment", User.toString())
        }

        binding.homeButtonTryGetJwt.text = response.message
        showCustomToast("Get JWT 성공")
    }

    override fun onGetUserFailure(message: String) {
        dismissLoadingDialog()
        showCustomToast("오류 : $message")
    }

    override fun onPostSignUpSuccess(response: SignUpResponse) {
        dismissLoadingDialog()
        binding.homeBtnTryPostHttpMethod.text = response.result.toString()
        showCustomToast(response.result.toString())
    }

    override fun onPostSignUpFailure(response: String) {
        dismissLoadingDialog()
        showCustomToast("오류")
    }

}
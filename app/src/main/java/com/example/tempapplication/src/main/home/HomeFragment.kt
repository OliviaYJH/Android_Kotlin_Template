package com.example.tempapplication.src.main.home

import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.tempapplication.R
import com.example.tempapplication.config.BaseFragment
import com.example.tempapplication.databinding.FragmentHomeBinding
import com.example.tempapplication.src.main.home.models.SignUpResponse
import com.example.tempapplication.src.main.home.models.UserResponse
import com.example.tempapplication.util.recycler.TestAdapter
import com.example.tempapplication.util.recycler.TestData

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::bind, R.layout.fragment_home), HomeView {

    // RecylerView
    lateinit var testAdapter: TestAdapter
    val testDatas = mutableListOf<TestData>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        ///
        binding.homeButtonTryGetJwt.setOnClickListener{
            showLoadingDialog(requireContext())
            HomeService(this).tryGetUsers()
        }

        testRecyclerView()
    }

    // RecyclerView
    fun testRecyclerView(){
        testAdapter = TestAdapter(requireActivity()) // activity인 경우는 this
        binding.recyclerTest.adapter = testAdapter

        for(i in 1 until 10){
            testDatas.apply { add(TestData(test = "test 1")) }
        }

        testAdapter.testdatas = testDatas
        testAdapter.notifyDataSetChanged()
    }

    override fun onGetUserSuccess(response: UserResponse) {
        dismissLoadingDialog()
        for(User in response.result){
            Log.d("HomeFragment", User.toString())
        }

        binding.homeButtonTryGetJwt.text = response.message
        showCustomToast("Get JWT 성공")

        /*
        SharedPreference에 jwt 저장

        editor.putString(X_ACCESS_TOKEN, response.result.jwt)
        editor.commit()
         */

        /*
        화면 전환

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent, LoginActivity::class.java)
        finish()
         */
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
@file:Suppress("DEPRECATION")

package ru.home.myapplication.ui.splash

import android.os.Handler
import org.koin.android.viewmodel.ext.android.viewModel
import ru.home.myapplication.data.entity.Note
import ru.home.myapplication.ui.base.BaseActivity
import ru.home.myapplication.ui.main.MainActivity

class SplashActivity : BaseActivity<Boolean?, SplashViewState>() {

    override val viewModel: SplashViewModel by viewModel()

    override val layoutRes = null

    override fun onResume() {
        super.onResume()
        Handler().postDelayed({ viewModel.requestUser() }, 1)
    }

    override fun renderData(data: Boolean?) {
        data?.takeIf { it }?.let {
            startMainActivity()
        }
    }

    fun startMainActivity() {
        MainActivity.start(this)
        finish()
    }

}
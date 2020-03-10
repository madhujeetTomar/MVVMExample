package com.mj.demo.module.notificationmodule

import android.os.Bundle
import androidx.lifecycle.Observer
import com.mj.demo.BR
import com.mj.demo.R
import com.mj.demo.core.base.BaseActivity
import com.mj.demo.databinding.ActivityNotificationSettingBinding
import javax.inject.Inject

class NotificationSetting : BaseActivity<ActivityNotificationSettingBinding,NotificationSettingViewModel>() {

    @Inject
    lateinit var mNotificationSettingViewModel: NotificationSettingViewModel

    override fun getLayoutResId(): Int {
        return R.layout.activity_notification_setting
    }

    override fun getBindingVariable(): Int {
    return BR.model
    }

    override fun getViewModel(): NotificationSettingViewModel {
    return mNotificationSettingViewModel
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mNotificationSettingViewModel.getUserPrefSelection()

        val name = Observer<NotifyCityModel> { s -> updateData(s) }
        mNotificationSettingViewModel.responseLiveData.observe(this, name)
    }

    private fun updateData(response: NotifyCityModel?) {

       println(response!!.emailAlert)

    }

}

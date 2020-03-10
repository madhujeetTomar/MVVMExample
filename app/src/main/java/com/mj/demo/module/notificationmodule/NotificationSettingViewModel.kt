package com.mj.demo.module.notificationmodule

import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import com.mj.demo.core.base.BaseViewModel
import com.mj.demo.core.base.ErrorResponse
import com.mj.demo.core.base.ResponseListener

class NotificationSettingViewModel
constructor(val notificationSettingRepository: NotificationSettingRepository) :
    BaseViewModel<NotificataionSettingNavigator>() {

    var responseLiveData: MutableLiveData<NotifyCityModel> = MutableLiveData()

    var pushNotiAlert: ObservableField<Boolean> = ObservableField()

    var emailAlert: ObservableField<Boolean> = ObservableField()

    var smsAlert: ObservableField<Boolean> = ObservableField()


    fun getPushNotificationAlert(): ObservableField<Boolean>? {
        return pushNotiAlert
    }

    fun getEmailNotification(): ObservableField<Boolean>? {
        return emailAlert
    }

    fun getSmsNotification(): ObservableField<Boolean>? {
        return smsAlert
    }

    fun getUserPrefSelection() {
        notificationSettingRepository.getNotificationSettingData(object :
            ResponseListener<List<NotifyCityModel>> {
            override fun onError(error: ErrorResponse) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onSuccess(response: List<NotifyCityModel>) {

                responseLiveData.postValue(response.get(0))


                pushNotiAlert.set(response[0].notificationAlert == 1)

                smsAlert.set(response[0].smsAlert == 1)

                emailAlert.set(response[0].emailAlert == 1)


            }
        })
    }


}
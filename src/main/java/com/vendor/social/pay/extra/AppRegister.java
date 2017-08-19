package com.vendor.social.pay.extra;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.vendor.social.SocialConfig;

public class AppRegister extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		final IWXAPI api = WXAPIFactory.createWXAPI(context, SocialConfig.getWeiboAppKey());

		//将该app注册到微信
		api.registerApp(SocialConfig.getWeixinId());
	}
}

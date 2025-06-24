package com.compose.jello.navigator

import android.content.Context
import android.content.Intent
import com.compose.auth.MainActivity
import com.compose.home.HomeActivity
import com.compose.navigator.Navigator
import javax.inject.Inject

class AppNavigator @Inject constructor() : Navigator {
  override fun navigateToFeatureHome(context: Context) {
    val intent = Intent(context, HomeActivity::class.java)
    context.startActivity(intent)
  }

  override fun navigateToFeatureAuth(context: Context) {
    val intent = Intent(context, MainActivity::class.java)
    context.startActivity(intent)
  }
}

package com.compose.navigator

import android.content.Context

interface Navigator {
  fun navigateToFeatureHome(context: Context)
  fun navigateToFeatureAuth(context: Context)
}

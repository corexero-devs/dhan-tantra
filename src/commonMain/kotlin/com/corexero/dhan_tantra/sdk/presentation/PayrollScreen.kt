package com.corexero.dhan_tantra.sdk.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.revenuecat.purchases.kmp.ui.revenuecatui.Paywall
import com.revenuecat.purchases.kmp.ui.revenuecatui.PaywallOptions

@Composable
fun PayrollScreen(onClose: () -> Unit) {
    val options = remember {
        PaywallOptions(dismissRequest = {onClose() })
    }
    Paywall(options)
}

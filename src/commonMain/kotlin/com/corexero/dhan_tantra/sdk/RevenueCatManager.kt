package com.corexero.dhan_tantra.sdk

import com.revenuecat.purchases.kmp.LogLevel
import com.revenuecat.purchases.kmp.Purchases
import com.revenuecat.purchases.kmp.configure

object RevenueCatManager {

    fun initializeRevenueCat() {
        Purchases.logLevel = LogLevel.DEBUG
        Purchases.configure(apiKey = "goog_wQQyhGeLVHDFNQgChIDpzNIyEMa") {
            appUserId = "null"
        }
    }

    fun getSubscriptionStatus() {
        Purchases.sharedInstance.getCustomerInfo(
            onError = { error -> /* Optional error handling */ },
            onSuccess = { customerInfo ->
                if (customerInfo.entitlements[""]?.isActive == true) {
                    // Grant user "pro" access
                }
            }
        )
    }


    fun restorePurchase(){
        Purchases.sharedInstance.restorePurchases(
            onError = { error ->
                // An error occurred.
            },
            onSuccess = { customerInfo ->
                //... check customerInfo to see if entitlement is now active
            }
        )
    }
}
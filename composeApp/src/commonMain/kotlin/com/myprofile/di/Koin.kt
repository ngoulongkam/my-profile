package com.myprofile.di

import com.myprofile.data.CatFactRepository
import com.myprofile.network.provideHttpClient
import com.myprofile.remote.CatFactApi
import com.myprofile.screen.certification.CertificationViewModel
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.koinApplication
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) {
    val koinApp = koinApplication {
        appDeclaration()
        modules(commonModule())
    }

    startKoin(koinApp)
}

fun commonModule() = module {
    single { provideHttpClient() }
    single { CatFactApi(get()) }
    single { CertificationViewModel(get()) }
    single { CatFactRepository(get()) }
}

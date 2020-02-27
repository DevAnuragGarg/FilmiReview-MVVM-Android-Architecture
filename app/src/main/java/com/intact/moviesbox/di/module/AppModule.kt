package com.intact.moviesbox.di.module

import com.intact.moviesbox.data.BaseDataManager
import com.intact.moviesbox.data.DataManager
import com.intact.moviesbox.domain.schedulers.BaseSchedulerProvider
import com.intact.moviesbox.util.scheduler.SchedulerProvider
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton


/**
 * Created by Anurag Garg on 19/03/19.
 *
 * Module to provide the generic dependencies
 */
@Module
class AppModule {

    @Provides
    @Singleton
    internal fun providesDataManager(dataManager: DataManager) : BaseDataManager = dataManager

    @Provides
    internal fun provideSchedulerProvider(): BaseSchedulerProvider = SchedulerProvider()

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable = CompositeDisposable()
}
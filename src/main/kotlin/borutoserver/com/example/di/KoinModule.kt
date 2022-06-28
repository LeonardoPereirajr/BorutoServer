package borutoserver.com.example.di

import borutosertver.com.example.repository.HeroRepository
import borutosertver.com.example.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}
package net.shamansoft.ni.srv

import javax.inject.Singleton

interface HealthService {
    fun getStatus(): String
}

@Singleton
class HealthServiceCucumberImpl: HealthService {
    override fun getStatus() = "Cucumber"
}
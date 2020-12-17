package net.shamansoft.ni.srv

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("net.shamansoft.ni.srv")
		.start()
}


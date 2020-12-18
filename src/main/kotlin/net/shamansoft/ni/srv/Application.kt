package net.shamansoft.ni.srv

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
	println("printing out args")
	args.forEach { println(it) }
	build()
	    .args(*args)
		.packages("net.shamansoft.ni.srv")
		.start()
}


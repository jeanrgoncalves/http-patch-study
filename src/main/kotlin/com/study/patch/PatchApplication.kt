package com.study.patch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PatchApplication

fun main(args: Array<String>) {
	runApplication<PatchApplication>(*args)
}

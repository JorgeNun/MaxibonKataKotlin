package com.karumi.maxibonkata

import io.kotlintest.properties.forAll
import io.kotlintest.specs.ShouldSpec

class DeveloperSpec : ShouldSpec() {
    init {
        "Developers"{
            should("always grab a positive number of maxibons") {
                forAll { numberOfMaxibons: Int ->
                    println("----> $numberOfMaxibons")
                    val dev = Developer(numberOfMaxibons = numberOfMaxibons)

                    dev.maxibonsToGrab >= 0
                }
            }
        }

        should("assign the name of the developer in construction") {
            forAll { name: String ->
                val dev = Developer(name)
                println("----> $name")
                dev.name == name
            }
        }

    }
}

package com.thoughtworks.apsilva.playerscore.controller

import com.thoughtworks.apsilva.playerscore.PlayerScoreTestWithFongo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.test.web.servlet.MockMvc

@AutoConfigureMockMvc
abstract class PlayerScoreTestWithFongoAndMockMvc(initializeTestData: Boolean = true) : PlayerScoreTestWithFongo(initializeTestData) {

    @Autowired
    lateinit var mvc: MockMvc
}
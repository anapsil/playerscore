package com.thoughtworks.apsilva.playerscore.controller

import com.thoughtworks.apsilva.playerscore.service.PlayerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import kotlin.streams.toList

@RestController
class LeaderController{

    @Autowired
    lateinit var playerService: PlayerService

    @GetMapping("/leaders")
    fun getLeaders() : List<String> = playerService.leaders().stream().map { it.handle }.toList()
}

@RestController
class PlayerController {
    @Autowired
    lateinit var playerService: PlayerService

    @PostMapping("/player/{handle}/score")
    fun postPlayerScore(@PathVariable handle: String,
                        @RequestBody points: String) : String {
        val score = playerService.score(handle, points.toInt())

        return "$handle now has a total score of $score."
    }
}
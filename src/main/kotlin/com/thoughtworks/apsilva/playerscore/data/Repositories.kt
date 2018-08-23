package com.thoughtworks.apsilva.playerscore.data

import org.springframework.data.repository.CrudRepository

interface PlayerRepository : CrudRepository<Player, String> {
    fun findTop3ByOrderByTotalScoreDesc() : List<Player>
}
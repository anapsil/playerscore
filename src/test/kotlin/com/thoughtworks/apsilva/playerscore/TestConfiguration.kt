package com.thoughtworks.apsilva.playerscore

import com.github.fakemongo.Fongo
import com.mongodb.MongoClient
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.springframework.data.mongodb.config.AbstractMongoConfiguration

@Configuration
class TestConfiguration : AbstractMongoConfiguration() {
    @Autowired
    lateinit var env: Environment

    override fun mongoClient(): MongoClient {
        logger.info("Instantiating Fongo with name $databaseName.")
        return Fongo(databaseName).mongo
    }

    override fun getDatabaseName(): String =
        env.getProperty("mongo.db.name", "test")

    companion object {
        val logger: Logger = LoggerFactory.getLogger(TestConfiguration::class.java)
    }
}
package com.davidelmn.application.frenzspots.data

import android.content.Context
import com.davidelmn.application.frenzspots.Spot
import com.davidelmn.application.frenzspots.data.local.SpotDataSourceLocal
import com.davidelmn.application.frenzspots.data.remote.SpotDataSourceRemote
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

class SpotListDataRepository(val context: Context?) {
    private val bookmarkDataSourceLocal = SpotDataSourceLocal(context)
    private val bookmarkDataSourceRemote = SpotDataSourceRemote(context)

    fun getSpots(): Flow<MutableList<Spot>> {
//        if (local != 0) else remote
        return bookmarkDataSourceRemote.getSpotList()
    }

    fun addSpot(spot: Spot) {
//        bookmarkDataSourceLocal.insertSpot(spot)
    }

    fun updateSpot(spot: Spot) {
//        return bookmarkDataSourceLocal.updateSpot(spot)
    }

    fun findSpotById(id: String): Spot {
        return Spot("bla", "bla", "blal", "blal")
//        return bookmarkDataSourceLocal.findSpotById(id)
    }

    fun deleteSpot(spot: Spot) {
//        return bookmarkDataSourceLocal.deleteSpot(spot)
    }
}
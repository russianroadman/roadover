package com.tanto.roadover.data.fetch

import com.tanto.roadover.data.fetch.proxy.Graph

/**
 * Interface to retrieve specific section from data model
 * */
interface Fetcher {

    /**
     * Get entire model
     * */
    fun fetchModel()

    /**
     * Get model section starting from specific node
     * All nested beans will be fetched
     * */
    fun fetchBranch()

    /**
     * Get specific model section based on graph
     * */
    fun fetchModel(graph: Graph)

}

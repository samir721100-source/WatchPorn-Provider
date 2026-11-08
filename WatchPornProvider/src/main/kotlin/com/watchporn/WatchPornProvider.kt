package com.watchporn

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.*

class WatchPornProvider : MainAPI() {
    override var mainUrl = "https://watchporn.to"
    override var name = "WatchPorn"
    override val hasMainPage = true
    override var lang = "en"
    override val supportedTypes = setOf(TvType.Movie)

    override suspend fun search(query: String): List<SearchResponse> {
        return emptyList()
    }

    override suspend fun getMainPage(
        page: Int,
        request: MainPageRequest
    ): HomePageResponse? = null

    override suspend fun load(url: String): LoadResponse? = null

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        callback: (ExtractorLink) -> Unit
    ): Boolean = false
}

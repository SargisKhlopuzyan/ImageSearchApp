package com.sargis.khlopuzyan.imagesearchapp.api

import com.sargis.khlopuzyan.imagesearchapp.data.UnsplashPhoto

/**
 * Created by Sargis Khlopuzyan, on 4/14/2021.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fastshift.com)
 */
data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)
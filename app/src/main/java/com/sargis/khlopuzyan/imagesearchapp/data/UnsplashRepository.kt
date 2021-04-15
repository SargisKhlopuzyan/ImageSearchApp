package com.sargis.khlopuzyan.imagesearchapp.data

import com.sargis.khlopuzyan.imagesearchapp.api.UnsplashApi
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Sargis Khlopuzyan, on 4/15/2021.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fastshift.com)
 */
@Singleton
class UnsplashRepository @Inject constructor(private val unsplashApi: UnsplashApi) {
}
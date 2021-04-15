package com.sargis.khlopuzyan.imagesearchapp.ui.gallery

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.sargis.khlopuzyan.imagesearchapp.data.UnsplashRepository

/**
 * Created by Sargis Khlopuzyan, on 4/15/2021.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fastshift.com)
 */
class GalleryViewModel @ViewModelInject constructor(
    private val repository: UnsplashRepository
) : ViewModel() {
}
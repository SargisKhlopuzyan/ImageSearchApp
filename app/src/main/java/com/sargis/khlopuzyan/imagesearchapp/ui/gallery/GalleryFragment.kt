package com.sargis.khlopuzyan.imagesearchapp.ui.gallery

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sargis.khlopuzyan.imagesearchapp.R
import dagger.hilt.android.AndroidEntryPoint

/**
 * Created by Sargis Khlopuzyan, on 4/8/2021.
 *
 * @author Sargis Khlopuzyan (sargis.khlopuzyan@fastshift.com)
 */
@AndroidEntryPoint
class GalleryFragment : Fragment(R.layout.fragment_gallery) {

    private val viewModel by viewModels<GalleryViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.photos.observe(viewLifecycleOwner) {

        }
    }
}
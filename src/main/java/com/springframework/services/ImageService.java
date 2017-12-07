package com.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Harish on 7/3/17.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}

package com.util;
import org.springframework.web.multipart.MultipartFile;

//这里的属性名称image必须和页面中的增加分类部分中的type="file"的name值保持一致
public class UploadedImageFile {
MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}

package com.example.imageviewer;

public class GalleryApp implements ImageViewer{
	private ImageAdapter imageAdapter;
    public void show(String fileName) {
        if (fileName.endsWith(".png") || fileName.endsWith(".jpg")) {
            imageAdapter = new ImageAdapter(fileName.substring(fileName.lastIndexOf(".") + 1));
            imageAdapter.show(fileName);
        } else {
            System.out.println("Invalid file format. Only PNG and JPG are supported.");
        }
    }

    public static void main(String[] args) {
        GalleryApp galleryApp = new GalleryApp();
        galleryApp.show("photo.png");
        galleryApp.show("picture.jpg");
        galleryApp.show("document.pdf");  
    }
}

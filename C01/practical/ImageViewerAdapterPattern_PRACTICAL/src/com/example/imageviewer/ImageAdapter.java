package com.example.imageviewer;

public class ImageAdapter implements ImageViewer{
	private AdvancedImageViewer advancedImageViewer;

    public ImageAdapter(String fileType) {
        if (fileType.equalsIgnoreCase("png")) {
            advancedImageViewer = new PngShower();
        } else if (fileType.equalsIgnoreCase("jpg")) {
            advancedImageViewer = new JpgShower();
        }
    }
    public void show(String fileName) {
        if (fileName.endsWith(".png")) {
            advancedImageViewer.showPng(fileName);
        } else if (fileName.endsWith(".jpg")) {
            advancedImageViewer.showJpg(fileName);
        }
    }
}

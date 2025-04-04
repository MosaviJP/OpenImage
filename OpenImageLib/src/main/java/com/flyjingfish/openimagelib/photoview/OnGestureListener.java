package com.flyjingfish.openimagelib.photoview;

public interface OnGestureListener {

    void onDrag(float dx, float dy,float moveX, float moveY);

    void onFling(float startX, float startY, float velocityX,
                 float velocityY);

    void onScale(boolean doubleFinger,float scaleFactor, float focusX, float focusY);

}
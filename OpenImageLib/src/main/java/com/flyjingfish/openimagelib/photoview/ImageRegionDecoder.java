package com.flyjingfish.openimagelib.photoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;

import androidx.annotation.NonNull;

interface ImageRegionDecoder {

    @NonNull Point init(Context context, @NonNull Uri uri) throws Exception;
    @NonNull Bitmap decodeRegion(@NonNull Rect sRect, int sampleSize);
    boolean isReady();
    void recycle();
}

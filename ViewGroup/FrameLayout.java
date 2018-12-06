<?xml version="1.0" encoding="utf-8"?>

<FrameLayout
    android:layout_height="match_parent"
    android:layout_width="match_parent"
    android:measureAllChildren="true"
    xmlns:android="http://schemas.android.com/apk/res/android">
    <!-- Image view first to make it background, if text first then image will hide it-->
    <ImageView
        android:src="@drawable/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
    <!-- Gravity is used with FrameLayout -->
    <TextView
        android:textSize="30sp"
        android:textColor="#ff00"
        android:text="Waiting..."
        android:layout_gravity="center"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />

</FrameLayout>
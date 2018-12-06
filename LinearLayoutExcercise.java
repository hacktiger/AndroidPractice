LINEAR LAYOUT

<?xml version="1.0" encoding="utf-8"?>

<!-- weightsum = tong weight tung view mot -->
<LinearLayout
    android:weightSum="9"
    android:orientation="vertical"
    android:layout_height="match_parent"
    android:layout_width="match_parent"
    xmlns:android="http://schemas.android.com/apk/res/android" >

    <!-- Dont use weight together with height/width = wrap content or match parent -->
    <TextView
        android:textColor="#ff0"
        android:textSize="30sp"
        android:text="Node"
        android:background="#0cfcdc"
        android:layout_weight="3"
        android:layout_width="match_parent"
        android:layout_height="0dp" />

    <LinearLayout
        android:weightSum="9"
        android:orientation="horizontal"
        android:layout_weight="6"
        android:layout_width="match_parent"
        android:layout_height="0dp">

        <TextView
            android:textColor="#ff0"
            android:textSize="30sp"
            android:text="Node"
            android:background="#fc0c1c"
            android:layout_weight="3"
            android:layout_width="0dp"
            android:layout_height="match_parent" />

        <LinearLayout
            android:weightSum="9"
            android:orientation="vertical"
            android:layout_weight="6"
            android:layout_width="0dp"
            android:layout_height="match_parent">

            <TextView
                android:textColor="#ff0"
                android:textSize="30sp"
                android:text="Node"
                android:background="#fc0c1c"
                android:layout_weight="6"
                android:layout_width="match_parent"
                android:layout_height="0dp" />

        </LinearLayout>
    </LinearLayout>
</LinearLayout>